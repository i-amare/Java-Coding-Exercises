
import java.awt.Dimension;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21nic
 */
public class WelcomePage extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public WelcomePage() {
        
        initComponents();
        this.setMinimumSize(new Dimension(900, 640));
this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        mnbMainBar = new javax.swing.JMenuBar();
        mnuNeedHelp = new javax.swing.JMenu();
        mniFAQ = new javax.swing.JMenuItem();
        mnuContactDetails = new javax.swing.JMenu();
        mniEmailAddress = new javax.swing.JMenuItem();
        mnuNewToAlliance = new javax.swing.JMenu();
        mniCreateAcc = new javax.swing.JMenuItem();
        mnuAlreadyAlly = new javax.swing.JMenu();
        mniLogin = new javax.swing.JMenuItem();
        mnuAllianceAdmin = new javax.swing.JMenu();
        mniAdminSignIn = new javax.swing.JMenuItem();
        mnuQuit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 102, 153));
        lblHeading.setText("Tennis Alliance");
        getContentPane().add(lblHeading);
        lblHeading.setBounds(130, 100, 810, 121);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesForPAT/mainmenu.jpg"))); // NOI18N
        lblBackground.setPreferredSize(new java.awt.Dimension(1001, 563));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1000, 563);

        mnbMainBar.setBackground(new java.awt.Color(255, 255, 255));
        mnbMainBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 3));
        mnbMainBar.setForeground(new java.awt.Color(255, 255, 255));
        mnbMainBar.setPreferredSize(new java.awt.Dimension(1001, 82));

        mnuNeedHelp.setBorder(null);
        mnuNeedHelp.setForeground(new java.awt.Color(239, 128, 47));
        mnuNeedHelp.setText("NEED HELP?         ");
        mnuNeedHelp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mnuNeedHelp.setPreferredSize(new java.awt.Dimension(120, 80));

        mniFAQ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        mniFAQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mniFAQ.setForeground(new java.awt.Color(239, 128, 47));
        mniFAQ.setText("FAQ");
        mniFAQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniFAQMouseClicked(evt);
            }
        });
        mniFAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFAQActionPerformed(evt);
            }
        });
        mnuNeedHelp.add(mniFAQ);

        mnbMainBar.add(mnuNeedHelp);

        mnuContactDetails.setBackground(new java.awt.Color(51, 153, 255));
        mnuContactDetails.setForeground(new java.awt.Color(239, 128, 47));
        mnuContactDetails.setText("CONTACT DETAILS");
        mnuContactDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mnuContactDetails.setMaximumSize(new java.awt.Dimension(180, 32767));
        mnuContactDetails.setPreferredSize(new java.awt.Dimension(50, 100));

        mniEmailAddress.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mniEmailAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mniEmailAddress.setForeground(new java.awt.Color(239, 128, 47));
        mniEmailAddress.setText("Email Address: alliance@gmail.com (click for more details)");
        mniEmailAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniEmailAddressMouseClicked(evt);
            }
        });
        mniEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmailAddressActionPerformed(evt);
            }
        });
        mnuContactDetails.add(mniEmailAddress);

        mnbMainBar.add(mnuContactDetails);

        mnuNewToAlliance.setBackground(new java.awt.Color(51, 153, 255));
        mnuNewToAlliance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuNewToAlliance.setForeground(new java.awt.Color(239, 128, 47));
        mnuNewToAlliance.setText("NEW TO THE ALLIANCE?                  ");
        mnuNewToAlliance.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mnuNewToAlliance.setMaximumSize(new java.awt.Dimension(230, 32767));
        mnuNewToAlliance.setPreferredSize(new java.awt.Dimension(220, 80));

        mniCreateAcc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mniCreateAcc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mniCreateAcc.setForeground(new java.awt.Color(239, 128, 47));
        mniCreateAcc.setText("Create an account");
        mniCreateAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniCreateAccMouseClicked(evt);
            }
        });
        mniCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCreateAccActionPerformed(evt);
            }
        });
        mnuNewToAlliance.add(mniCreateAcc);

        mnbMainBar.add(mnuNewToAlliance);

        mnuAlreadyAlly.setBackground(new java.awt.Color(51, 153, 255));
        mnuAlreadyAlly.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuAlreadyAlly.setForeground(new java.awt.Color(239, 128, 47));
        mnuAlreadyAlly.setText("ALREADY AN ALLY?                   ");
        mnuAlreadyAlly.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mnuAlreadyAlly.setMaximumSize(new java.awt.Dimension(200, 32767));
        mnuAlreadyAlly.setPreferredSize(new java.awt.Dimension(190, 80));

        mniLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mniLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mniLogin.setForeground(new java.awt.Color(239, 128, 47));
        mniLogin.setText("Login to your account");
        mniLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniLoginMouseClicked(evt);
            }
        });
        mniLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoginActionPerformed(evt);
            }
        });
        mnuAlreadyAlly.add(mniLogin);

        mnbMainBar.add(mnuAlreadyAlly);

        mnuAllianceAdmin.setBackground(new java.awt.Color(51, 153, 255));
        mnuAllianceAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuAllianceAdmin.setForeground(new java.awt.Color(239, 128, 47));
        mnuAllianceAdmin.setText("ALLIANCE ADMIN?                                                   ");
        mnuAllianceAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mnuAllianceAdmin.setMaximumSize(new java.awt.Dimension(190, 32767));
        mnuAllianceAdmin.setPreferredSize(new java.awt.Dimension(170, 80));

        mniAdminSignIn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mniAdminSignIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mniAdminSignIn.setForeground(new java.awt.Color(239, 128, 47));
        mniAdminSignIn.setText("Admin Sign in");
        mniAdminSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniAdminSignInMouseClicked(evt);
            }
        });
        mniAdminSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAdminSignInActionPerformed(evt);
            }
        });
        mnuAllianceAdmin.add(mniAdminSignIn);

        mnbMainBar.add(mnuAllianceAdmin);

        mnuQuit.setForeground(new java.awt.Color(239, 128, 47));
        mnuQuit.setText("QUIT");
        mnuQuit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mnuQuit.setMaximumSize(new java.awt.Dimension(60, 32767));
        mnuQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuQuitMouseClicked(evt);
            }
        });
        mnbMainBar.add(mnuQuit);

        setJMenuBar(mnbMainBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniFAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFAQActionPerformed
       new FAQ().setVisible(true);//making the FAQ GUI screen appear when the mouse clicks here   
    }//GEN-LAST:event_mniFAQActionPerformed

    private void mniEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmailAddressActionPerformed
new AdditionalContact().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_mniEmailAddressActionPerformed

    private void mniCreateAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniCreateAccMouseClicked
     new CreateAccount().setVisible(true);
    }//GEN-LAST:event_mniCreateAccMouseClicked

    private void mnuQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuQuitMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_mnuQuitMouseClicked

    private void mniEmailAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniEmailAddressMouseClicked
  new AdditionalContact().setVisible(true);//making the general help GUI screen appear when the mouse clicks here          // TODO add your handling code here:
    }//GEN-LAST:event_mniEmailAddressMouseClicked

    private void mniLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniLoginMouseClicked
  new SignInPage().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mniLoginMouseClicked

    private void mniAdminSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniAdminSignInMouseClicked
new AdminSignIn().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mniAdminSignInMouseClicked

    private void mniFAQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniFAQMouseClicked
new FAQ().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mniFAQMouseClicked

    private void mniCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCreateAccActionPerformed
new CreateAccount().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mniCreateAccActionPerformed

    private void mniLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoginActionPerformed
new SignInPage().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mniLoginActionPerformed

    private void mniAdminSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAdminSignInActionPerformed
new AdminSignIn().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mniAdminSignInActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JMenuBar mnbMainBar;
    private javax.swing.JMenuItem mniAdminSignIn;
    private javax.swing.JMenuItem mniCreateAcc;
    private javax.swing.JMenuItem mniEmailAddress;
    private javax.swing.JMenuItem mniFAQ;
    private javax.swing.JMenuItem mniLogin;
    private javax.swing.JMenu mnuAllianceAdmin;
    private javax.swing.JMenu mnuAlreadyAlly;
    private javax.swing.JMenu mnuContactDetails;
    private javax.swing.JMenu mnuNeedHelp;
    private javax.swing.JMenu mnuNewToAlliance;
    private javax.swing.JMenu mnuQuit;
    // End of variables declaration//GEN-END:variables
}