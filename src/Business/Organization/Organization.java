/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Farmers.FarmerDirectory;
import Business.Inventory.InventoryDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author jaman
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private Type organizationType;
    private UserAccountDirectory userAccountDirectory;
    private FarmerDirectory farmerDirectory;
    private int organizationID;
    private static int counter=0;
    
    
    public enum Type{
        Admin("Admin Organization"),
        Loan ("Loan Organization"),
        BackgroundCheck ("Background Check Organization"),
        LoanApproval("LoanApproval Organization"),
        Seed("SeedOrganization"),
        Fertilizer("FertilizerOrganization"),
        Manager("ManagerOrganization"),
         //NgoAdmin("NgoAdminOranization"),
        Receptionist("ReceptionistOrganization"),
        Intern("InternOrganization"),
        BankManager("Bank Manager");
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        farmerDirectory = new FarmerDirectory();
       
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public FarmerDirectory getFarmerDirectory() {
        return farmerDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    public Type getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(Type organizationType) {
        this.organizationType = organizationType;
    }

   
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
