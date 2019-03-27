/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Inventory.Inventory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jagman
 */
public class SupplierEnterprise extends Enterprise {
    
   
       public SupplierEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Supplier);
        
    }
    
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

   
    
       
    
}
