/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
      
        if(type.getValue().equals(Type.Loan.getValue())){
            organization = new LoanOrganization();
              organization.setOrganizationType(type);
            organizationList.add(organization);
        }
       
        
        if(type.getValue().equals(Type.BackgroundCheck.getValue())){
            organization = new BackgroundCheckOrganization();
             organization.setOrganizationType(type);
            organizationList.add(organization);
        }
        
         if(type.getValue().equals(Type.LoanApproval.getValue())){
            organization = new LoanApprovalOrganization();
             organization.setOrganizationType(type);
            organizationList.add(organization);
        }
         
                
         if(type.getValue().equals(Type.Manager.getValue())){
            organization = new ManagerOrganization();
             organization.setOrganizationType(type);
            organizationList.add(organization);
        }
         if(type.getValue().equals(Type.Seed.getValue())){
            organization = new SeedOrganization();
             organization.setOrganizationType(type);
            organizationList.add(organization);
        }
         
         if(type.getValue().equals(Type.Fertilizer.getValue())){
            organization = new FertilizerOrganization();
             organization.setOrganizationType(type);
            organizationList.add(organization);
        }
         
         if(type.getValue().equals(Type.Intern.getValue())){
            organization = new InternOrganization();
             organization.setOrganizationType(type);
            organizationList.add(organization);
        }
          if(type.getValue().equals(Type.Receptionist.getValue())){
            organization = new ReceptionistOrganization();
             organization.setOrganizationType(type);
            organizationList.add(organization);
        }
          if(type.getValue().equals(Type.BankManager.getValue())){
            organization = new BankManagerOrganization();
             organization.setOrganizationType(type);
            organizationList.add(organization);
        }
         
         
        return organization;
    }
}