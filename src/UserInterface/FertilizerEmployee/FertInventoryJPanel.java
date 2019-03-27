/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FertilizerEmployee;


import UserInterface.SeedEmployee.*;
import Business.Enterprise.Enterprise;
import Business.Inventory.Inventory;
import Business.Inventory.InventoryDirectory;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.SeedOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ira
 */
public class FertInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryJPanel
     */
    private InventoryDirectory inventoryDir;
    private JPanel userProcessContainer;
    private Organization organization;
    private UserAccount account ;
    private Enterprise  enterprise ;
   

    
    public FertInventoryJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
       
       this.userProcessContainer=userProcessContainer;
       this.organization=organization;
       this.enterprise=enterprise;
      poplulateTable(organization);
       
    }
    
    public void poplulateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) tblInventory.getModel();
        ManagerOrganization manager ; 
        model.setRowCount(0);
        System.out.println(organization.getName());
        System.out.println(organization.getOrganizationType());
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof ManagerOrganization) {
                manager = (ManagerOrganization) org ; 
            for (Inventory inventory :manager.getInventoryList().getInventoryList()){
                    
                if(inventory.getCategory().equalsIgnoreCase("fertilizer")){
                    Object[] row = new Object[4];
                    row[0] = inventory;
                    row[1] = inventory.getName();
                    row[2] = inventory.getQuantity();
                    row[3]=inventory.getPrice();
                    model.addRow(row);
                }
            
        }
    }
    }}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Inventory Panel");

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Type of Seeds", "Avaliable Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblInventory);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/arrow-back-icon.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnBack)
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventory;
    // End of variables declaration//GEN-END:variables

    
        
}
