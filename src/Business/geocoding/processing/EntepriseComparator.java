/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.geocoding.processing;

import Business.Enterprise.Enterprise;
import Business.geocoding.beans.Location;
import java.util.Comparator;

/**
 *
 * @author Jagman
 */
public class EntepriseComparator implements Comparator<Enterprise> {
    
    private Location userEntityLocation = null;

    public EntepriseComparator(Location userEntityLocation) {
       this.userEntityLocation = userEntityLocation;
    }

    @Override
    public int compare(Enterprise o1, Enterprise o2) {
        Location o1Loc = o1.getLocation();
        Location o2Loc = o2.getLocation();

        if (o2Loc == null) {
            return -1;
        } else if (o1Loc == null) {
            return 1;
        } 

        int result = 0;
        double o1Distance = GeocodingUtil.getDistance(userEntityLocation, o1Loc);
        double o2Distance = GeocodingUtil.getDistance(userEntityLocation, o2Loc);
        result = (Math.min(o1Distance, o2Distance) == o1Distance) ? -1 : 1;
        
        return result;


    }
    
    
    
}
