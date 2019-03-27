/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jagman
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    Enterprise enterprise;
     private final static Logger LOGGER =  
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise ; 
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        LOGGER.log(Level.INFO, "Enterprise" +enterprise.getEnterpriseType());
        System.out.println("Enterprise" +enterprise.getEnterpriseType().getValue());
        if (enterprise.getEnterpriseType().getValue().equals("Bank")) {
            for (Organization.Type type : Organization.Type.values()) {
                if ((!type.getValue().equals(Organization.Type.Admin.getValue())) && (!type.getValue().equals(Organization.Type.Manager.getValue()))
                        && (!type.getValue().equals(Organization.Type.Seed.getValue())) && (!type.getValue().equals(Organization.Type.Fertilizer.getValue())) 
                        && (!type.getValue().equals(Organization.Type.Intern.getValue())) && (!type.getValue().equals(Organization.Type.Receptionist.getValue()))) {
                    organizationJComboBox.addItem(type);
                }
            }
        }
        
         if (enterprise.getEnterpriseType().getValue().equals("Supplier")) {
        for (Type type : Organization.Type.values()){
            if (!type.getValue().equals(Type.Admin.getValue()) &&(!type.getValue().equals(Type.Loan.getValue() )) &&(!type.getValue().equals(Type.BackgroundCheck.getValue()))&&(!type.getValue().equals(Type.LoanApproval.getValue()))
                    &&(!type.getValue().equals(Type.BankManager.getValue())) &&(!type.getValue().equals(Type.Intern.getValue())) &&(!type.getValue().equals(Type.Receptionist.getValue())))
            {  organizationJComboBox.addItem(type);}
        }
    }
         
          if (enterprise.getEnterpriseType().getValue().equals("NGO")) {
        for (Type type : Organization.Type.values()){
            if (!type.getValue().equals(Type.Admin.getValue()) &&(!type.getValue().equals(Type.Loan.getValue() )) &&(!type.getValue().equals(Type.BackgroundCheck.getValue()))&&(!type.getValue().equals(Type.LoanApproval.getValue()))
                 && (!type.getValue().equals(Organization.Type.Manager.getValue())) && (!type.getValue().equals(Organization.Type.Seed.getValue())) && (!type.getValue().equals(Organization.Type.Fertilizer.getValue())) 
                    && (!type.getValue().equals(Organization.Type.BankManager.getValue())))
            {  organizationJComboBox.addItem(type);}
        }
    }
 }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization;
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        removeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addJButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/Button-Submit-icon.png"))); // NOI18N
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Organization Type ");

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/arrow-back-icon.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Organization Panel");

        removeBtn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        removeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/cancel-visit.png"))); // NOI18N
        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJButton)
                    .addComponent(backJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
       int flag = 0;
        Type type = (Type) organizationJComboBox.getSelectedItem();
        System.out.println("Type :" +type);
        for (Organization o : directory.getOrganizationList()) {
            if (type.getValue().equals(o.getName())) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
             System.out.println("Type :" +type);
            directory.createOrganization(type);
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "This Organization has already been added");
        }     
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow=organizationJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove the Organization?","Warning", JOptionPane.YES_NO_OPTION);
            if(flag==0){

                Organization org = (Organization)organizationJTable.getValueAt(selectedRow, 1);
                directory.getOrganizationList().remove(org);
                populateTable();

                JOptionPane.showMessageDialog(null, "Organization Removed.", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_removeBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JButton removeBtn;
    // End of variables declaration//GEN-END:variables
}
