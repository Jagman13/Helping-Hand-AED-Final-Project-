/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.geocoding.beans;

/**
 *
 * @author Jagman
 */
public class Location {

    private double latitude;
    private double longitude;
    private String address;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(double latitude, double longitude, String alias) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = alias;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getAlias() {
        return address;
    }

    public void setAlias(String alias) {
        this.address = alias;
    }

    @Override
    public String toString() {
        return "Location{" + "latitude=" + latitude + ", longitude=" + longitude + ", alias=" + address + '}';
    }

}
