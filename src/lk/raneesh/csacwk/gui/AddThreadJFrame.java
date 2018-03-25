/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.raneesh.csacwk.gui;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import lk.raneesh.csacwk.controllers.ChatController;
import lk.raneesh.csacwk.datastructure.ThreadList;

/**
 *
 * @author Raneesh Gomez
 */
public class AddThreadJFrame extends javax.swing.JFrame {
    
    private static SelectThreadJFrame selectThread;

    /**
     * Creates new form LoginJFrame
     */
    public AddThreadJFrame() {
        super("DRAGx Chat | Add Threads");
        initComponents();
        setPlaceholder();
        //generateMessageList();
    }   
    
    public void setPlaceholder() {
        newThreadTitleText.setBorder(BorderFactory.createCompoundBorder(
        newThreadTitleText.getBorder(), 
        BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        
        newThreadTitleText.setText("Enter Thread Title Here...");
        newThreadTitleText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (newThreadTitleText.getText().equals("Enter Thread Title Here...")) {
                    newThreadTitleText.setText("");
                    newThreadTitleText.setForeground(Color.GRAY);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (newThreadTitleText.getText().isEmpty()) {
                    newThreadTitleText.setForeground(Color.GRAY);
                    newThreadTitleText.setText("Enter Thread Title Here...");
                }
            }
        });
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        createThreadButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        newThreadTitleText = new javax.swing.JTextField();
        chatHeaderLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(810, 700));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Thread");
        jLabel4.setToolTipText("");

        createThreadButton.setBackground(new java.awt.Color(153, 153, 0));
        createThreadButton.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        createThreadButton.setForeground(new java.awt.Color(255, 255, 255));
        createThreadButton.setText("CREATE THREAD");
        createThreadButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createThreadButton.setBorderPainted(false);
        createThreadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createThreadButtonActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("THREAD TITLE");
        jLabel14.setOpaque(true);

        newThreadTitleText.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        newThreadTitleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newThreadTitleTextActionPerformed(evt);
            }
        });

        chatHeaderLabel.setFont(new java.awt.Font("Roboto Black", 0, 100)); // NOI18N
        chatHeaderLabel.setForeground(new java.awt.Color(153, 153, 0));
        chatHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chatHeaderLabel.setText("DRAGx Chat");
        chatHeaderLabel.setToolTipText("");
        chatHeaderLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(newThreadTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(chatHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(createThreadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(chatHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newThreadTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(createThreadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createThreadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createThreadButtonActionPerformed
        String threadTitle = newThreadTitleText.getText();
        
        ArrayList<String> newThreadList = ChatController.createNewThread(threadTitle);       
        
        SelectThreadJFrame.threadListModel.addElement(new ThreadList(newThreadList.get(0), newThreadList.get(1), newThreadList.get(2)));   
        
        newThreadTitleText.setForeground(Color.GRAY);
        newThreadTitleText.setText("Enter Thread Title Here..."); 
        
        this.setVisible(false);
    }//GEN-LAST:event_createThreadButtonActionPerformed

    private void newThreadTitleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newThreadTitleTextActionPerformed
        
    }//GEN-LAST:event_newThreadTitleTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddThreadJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddThreadJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddThreadJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddThreadJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddThreadJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chatHeaderLabel;
    private javax.swing.JButton createThreadButton;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newThreadTitleText;
    // End of variables declaration//GEN-END:variables
}
