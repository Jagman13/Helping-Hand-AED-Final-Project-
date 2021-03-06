/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReceptionistWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import UserInterface.FarmerRole.RegisterFarmerJPanel ;
/**
 *
 * @author Jagman
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionistWorkAreaJPanel
     */
    
    private JPanel container ;
    private UserAccount account ;
    private Enterprise enterprise ;
    private EcoSystem system ; 
    
    public ReceptionistWorkAreaJPanel(JPanel container , UserAccount account , Enterprise enterprise , EcoSystem business) {
        initComponents();
        this.container = container;
        this.account = account ;
        this.enterprise = enterprise ;
        this.system = business; 
        valueLabel.setText(account.getEmployee().getName());
        
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
        jLabel2 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        RegisterjButton = new javax.swing.JButton();
        requestjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Receptionist Work Area");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Employee :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        valueLabel.setText("<label>");

        RegisterjButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        RegisterjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/register.png"))); // NOI18N
        RegisterjButton.setText("Register Farmer");
        RegisterjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterjButtonActionPerformed(evt);
            }
        });

        requestjButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        requestjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Icons/request.png"))); // NOI18N
        requestjButton.setText("Raise Request For Farmer");
        requestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(requestjButton)
                                .addGap(55, 55, 55)
                                .addComponent(RegisterjButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel)))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestjButton)
                    .addComponent(RegisterjButton))
                .addContainerGap(340, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestjButtonActionPerformed
        
        CardLayout layout = (CardLayout)container.getLayout();
      
        container.add("RaiseRequestJPanel", new RaiseRequestJPanel(container, system,enterprise ,account ));
        layout.next(container); 
    }//GEN-LAST:event_requestjButtonActionPerformed

    private void RegisterjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterjButtonActionPerformed
       
        CardLayout layout = (CardLayout)container.getLayout();
        boolean ngo = true;
        container.add("RequestFarmerJPanel", new RegisterFarmerJPanel(container, system , ngo ));
        layout.next(container); 
        
        
        
        
       
    }//GEN-LAST:event_RegisterjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton requestjButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
