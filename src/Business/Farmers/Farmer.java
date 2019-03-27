/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Farmers;

import Business.geocoding.beans.Location;

/**
 *
 * @author Jagman
 */
public class Farmer {
    
    private String name ; 
    private String email ;
    private String phoneNum;
    private boolean isNgoRegistered; 
    private String id;
    private String networkName ; 
    private static int count = 1;
     private String address ; 
    private Location location ; 
    public Farmer(){
    
        id = "F"+ count;
        count++;
         
    }
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

 public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isIsNgoRegistered() {
        return isNgoRegistered;
    }

    public void setIsNgoRegistered(boolean isNgoRegistered) {
        this.isNgoRegistered = isNgoRegistered;
    }
    
    
    
    @Override
    public String toString(){
        return name;
    }
    
    
    
}
