/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.InventoryDirectory;
import Business.Role.Manager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ira
 */
public class ManagerOrganization extends Organization {
    
    private String location;
    private String storeAddress;
    private double storeContact;
    private InventoryDirectory inventoryList;
    
    
    public ManagerOrganization(){
        super(Type.Manager.getValue());
         inventoryList = new InventoryDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Manager());
        
        return roles;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public double getStoreContact() {
        return storeContact;
    }

    public void setStoreContact(double storeContact) {
        this.storeContact = storeContact;
    }

    public InventoryDirectory getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(InventoryDirectory inventoryList) {
        this.inventoryList = inventoryList;
    }

    
    
    
}
