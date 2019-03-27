/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SeedEmployee;

import Business.Inventory.InventoryDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SeedOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SeedWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ira
 */
public class SeedEmployeeWorkAreaJPanel extends javax.swing.JPanel {
    
    
    private JPanel userProcessContainer;
    private SeedOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private InventoryDirectory inventoryDir;

    /**
     * Creates new form SupplierWorkAreaJPanel
     */
    
    public SeedEmployeeWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
         initComponents();
         
         this.userProcessContainer = userProcessContainer;
         this.organization =(SeedOrganization)organization;
         this.enterprise = enterprise;
         this.userAccount = account;
         txtEnterprise.setText(enterprise.getName());
         txtOrganization.setText(organization.getName());
         txtEmployeeName.setText(account.getUsername());
         
         
         populateRequestTable();
         
         
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblOrderRequest.getModel();
        
        model.setRowCount(0);
        if(organization.getName().equalsIgnoreCase("SeedOrganization")){
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            
                SeedWorkRequest req =(SeedWorkRequest)request;
                if(req.getCategory().equalsIgnoreCase("seed")){
                    Object[] row = new Object[10];
                    row[0] = req.getRequestDate();
                    row[1] = req.getSupName();
                    row[2] = req.getFarmerName();
                    row[3] = req.getSeedName();
                    row[4] = req.getTotalAmount();
                    row[5] = req.getReceiver();
                    row[6] = req.getStatus();
                    row[7] = request;
                    row[8] = req.getResolveDate();
                    model.addRow(row);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEnterprise = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtOrganization = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderRequest = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Supplier Work Area");

        btnProcess.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/assigntome.png"))); // NOI18N
        btnProcess.setText("Assign to me");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Employee Name");

        txtEmployeeName.setText("jTextField1");
        txtEmployeeName.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Enterprise");

        txtEnterprise.setText("jTextField1");
        txtEnterprise.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Organiation");

        txtOrganization.setText("jTextField1");
        txtOrganization.setEnabled(false);

        tblOrderRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Req raised date", "Supplier Name", "Farmer Name", "Seed Type", "Total Amount", "Sender", "Receiver", "Staus", "Comments", "Resolved Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderRequest);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/clear_refresh_Other-Power-Restart-Metro-icon.png"))); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(179, 179, 179)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(btnProcess)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnProcess)
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        
        int selectedRow =tblOrderRequest.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request from the table");
        } 
        else {
            WorkRequest request = (WorkRequest) tblOrderRequest.getValueAt(selectedRow, 7);
            if (request.getReceiver() != null) {
                JOptionPane.showMessageDialog(null, "This request is already assigned");
            }else if (request.getStatus().equalsIgnoreCase("Disapproved")) {
            JOptionPane.showMessageDialog(null,"The request has been already disapproved ", "warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else { 
                request.setReceiver(userAccount);
                populateRequestTable();
                
                SeedWorkRequest req = (SeedWorkRequest) tblOrderRequest.getValueAt(selectedRow, 7);
                ProcessRequestJPanel process = new ProcessRequestJPanel(userProcessContainer, organization, enterprise,userAccount,req);
                userProcessContainer.add("UpdateProductJPanel", process);

                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                
        }}
    }//GEN-LAST:event_btnProcessActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrderRequest;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtEnterprise;
    private javax.swing.JTextField txtOrganization;
    // End of variables declaration//GEN-END:variables

}
