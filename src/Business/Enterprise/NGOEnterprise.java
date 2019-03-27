/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AdminRole;
import Business.Role.NgoAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jagman
 */
public class NGOEnterprise extends Enterprise {
    
    
    public NGOEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Ngo);
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NgoAdmin());
        return roles;
    }
}
