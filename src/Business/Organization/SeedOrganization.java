/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.InventoryDirectory;
import Business.Role.Role;
import Business.Role.SeedEmployee;

import java.util.ArrayList;

/**
 *
 * @author ira
 */
public class SeedOrganization extends Organization {
    
   
    
    
    public SeedOrganization(){
        super(Type.Seed.getValue());
        
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SeedEmployee());
        
        return roles;
    }
    
}
