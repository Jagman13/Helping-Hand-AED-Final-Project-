/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.BankEmployee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jagman
 */
public class LoanOrganization extends Organization {
    public LoanOrganization() {
        super(Type.Loan.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BankEmployee());
        return roles;
    }
    
}
