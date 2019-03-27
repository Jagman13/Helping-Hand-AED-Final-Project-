/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.geocoding.processing;

import Business.Enterprise.Enterprise;
import Business.Farmers.Farmer;
import Business.geocoding.beans.GeocodingResult;
import Business.geocoding.beans.Location;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import java.util.Collections;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MultivaluedMap;
import webservices.rest.RestWebserviceClient;
import webservices.util.ResultParser;

/**
 *
 * @author Jagman
 */
public class GeocodingUtil {

    private final static Logger LOGGER =  
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
    /**
     * Sort toLocations in reverse order wrt atLocation
     *
     * @param atLocation
     * @param toLocations
     * @return
     */
    public static List<Location> getNearestLocations(Location atLocation, List<Location> toLocations) {
        Collections.sort(toLocations, new LocationComparator(atLocation));
        //toLocations.sort(new LocationComparator(atLocation));

        return toLocations;

    }

    public static List<Enterprise> getNearestEnteprisesForFarmer(List<Enterprise> enterprises, Farmer farmer) {
         LOGGER.log(Level.INFO, "Going to calculate the nearest location for Farmer");
        /**
         * In future get location from farmer.
         */
        enterprises = populateLocationForEnteprise(enterprises);
        Location currLocation = findLocationForFarmerList(farmer);
        Collections.sort(enterprises,new EntepriseComparator(currLocation));
        //enterprises.sort(new EntepriseComparator(currLocation));
        
        return enterprises;

    }

    private static List<Enterprise> populateLocationForEnteprise(List<Enterprise> enterprises) {
       LOGGER.log(Level.INFO, "Going to calculate the location for Enterprises");
        for (Enterprise enterprise : enterprises) {
             LOGGER.log(Level.INFO, "Enterprise Name :" +enterprise.getName()+ "  Address :" +enterprise.getAddress());
            
            /**
             * We choose 0th index here for testing, fix it by finding the best
             * match.
             */
            if (enterprise.getAddress() != null) {
                GeocodingResult geocodingResult = getGeoCodingDataForAddress(enterprise.getAddress())[0];
                double longitude = Double.parseDouble(geocodingResult.getLon());
                double latitude = Double.parseDouble(geocodingResult.getLat());
                System.out.println(geocodingResult);

                enterprise.setLocation(new Location(latitude, longitude, enterprise.getName()));
            }

        }

        return enterprises;
    }
    
    
    private static  Location findLocationForFarmerList(Farmer farmer) {
       Location location = null ; 
        LOGGER.log(Level.INFO, "Going to calculate the location for Farmer +" +farmer.getAddress());
            /**
             * We choose 0th index here for testing, fix it by finding the best
             * match.
             */
            if (farmer.getAddress() != null) {
                GeocodingResult geocodingResult = getGeoCodingDataForAddress(farmer.getAddress())[0];
                double longitude = Double.parseDouble(geocodingResult.getLon());
                double latitude = Double.parseDouble(geocodingResult.getLat());
                System.out.println(geocodingResult);
                location = new Location(latitude, longitude, farmer.getName()) ;
                farmer.setLocation(new Location(latitude, longitude, farmer.getName()));
            

        }

        return location   ;
    }
    /**
     * Haversine Formula - has 0.5% error/variation
     *
     * @param loc1
     * @param loc2
     * @return
     */
    public static double getDistance(Location loc1, Location loc2) {
        int R = 6371;

        Double latDistance = Math.toRadians(loc2.getLatitude() - loc1.getLatitude());
        Double lonDistance = Math.toRadians(loc2.getLongitude() - loc1.getLongitude());

        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(loc1.getLatitude())) * Math.cos(Math.toRadians(loc2.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }

//    public static void main(String[] args) {
//        List<Location> toLocations = new ArrayList<>();
//        Location currLocation = new Location(28.6405295, 77.3758342, "Home");
//        toLocations.add(new Location(28.633824, 77.3696585, "Shipra mall"));
//        toLocations.add(new Location(28.4646148, 77.0299194, "Gurugram, city, India"));
//        toLocations.add(new Location(42.3602534, -71.0582912, "Boston, city, United States of America"));
//        toLocations.add(new Location(28.64974755, 77.34013889199865, "Vaishali Metro Station Parking, parking, Ghaziabad, India"));
//        toLocations.add(new Location(28.6169843, 77.3736012, "Noida Sector 62, station, Mamura, India"));
//        toLocations.add(new Location(28.6399139, 77.36834220689732, "Habitat center"));
//
//        System.out.println(GeocodingUtil.getNearestLocations(currLocation, toLocations));
//
//    }

    /**
     * This return a list of geocoded data, only one of them would be accurate
     * so write a function to get the best option.
     *
     * @param address
     * @return a list of geocoded data
     */
    public static GeocodingResult[] getGeoCodingDataForAddress(String address) {
      
        MultivaluedMap queryParams = new MultivaluedMapImpl();
      
        queryParams.add("q", address);
        queryParams.add("key", "1b2067d9203c37");
        queryParams.add("format", "json");
        String URI = "https://us1.locationiq.com/v1/search.php";
         
        String result = RestWebserviceClient.getResponse(URI, queryParams).getEntity(String.class);
        LOGGER.log(Level.INFO, "Inside GeoCoding getResponse ::  " +result);
        LOGGER.log(Level.INFO, "Inside GeoCodin Result from Parser  :: " +ResultParser.jsonObjectMapper(result, GeocodingResult[].class));
        return ResultParser.jsonObjectMapper(result, GeocodingResult[].class);
    }
}
