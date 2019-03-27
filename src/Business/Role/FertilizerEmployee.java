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
import UserInterface.FertilizerEmployee.FertilizerEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ira
 */
public class FertilizerEmployee extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FertilizerEmployeeWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    }
    
}
