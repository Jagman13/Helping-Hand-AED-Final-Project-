/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.InternWorkArea.InternWorkAreaJPanel;
import UserInterface.LoanApproval.LoanApprovalWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jagman
 */
public class InternRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        // Create the work Panel & add here
        return new InternWorkAreaJPanel(userProcessContainer,enterprise,account,organization,business);
    }
}
