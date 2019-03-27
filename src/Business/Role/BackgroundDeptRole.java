/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BackgroundCheckOrganization;
import Business.Organization.LoanOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.BackgroundCheck.BackgroundCheckWorkAreaJPanel;
import UserInterface.FarmerRole.FarmerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Jagman
 */
public class BackgroundDeptRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        // Create the work Panel & add here
        return new BackgroundCheckWorkAreaJPanel(userProcessContainer, account, organization,
             enterprise  );
    }

}
