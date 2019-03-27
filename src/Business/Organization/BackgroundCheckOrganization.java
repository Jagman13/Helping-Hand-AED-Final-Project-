/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BackgroundDeptRole;
import Business.Role.BankEmployee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jagman
 */
public class BackgroundCheckOrganization extends Organization{
    
    public BackgroundCheckOrganization() {
        super(Type.BackgroundCheck.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BackgroundDeptRole());
        return roles;
    }
    
}
