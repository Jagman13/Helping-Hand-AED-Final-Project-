/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LoanApprovalRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jagman
 */
public class LoanApprovalOrganization extends Organization {
    
    public LoanApprovalOrganization() {
        super(Type.LoanApproval.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LoanApprovalRole());
        return roles;
    }
    
}
