/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.geocoding.processing;

import Business.geocoding.beans.Location;
import Business.geocoding.beans.Location;
import java.util.Comparator;

/**
 *
 * @author Jagman
 */
public class LocationComparator implements Comparator<Location> {

    private Location currLocation = null;

    public LocationComparator(Location loc) {

        this.currLocation = loc;
    }

    @Override
    public int compare(Location o1, Location o2) {
        int result = 0;
        double o1Distance = GeocodingUtil.getDistance(currLocation, o1);
        double o2Distance = GeocodingUtil.getDistance(currLocation, o2);
        result = (Math.min(o1Distance, o2Distance) == o1Distance) ? -1 : 1;

        return result;
    }

}
