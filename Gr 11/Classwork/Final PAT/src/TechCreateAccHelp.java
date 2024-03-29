


import java.awt.Dimension;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21nic
 */
public class TechCreateAccHelp extends javax.swing.JFrame {

    /**
     * Creates new form TechCreateAccHelp
     */
    public TechCreateAccHelp() {
        initComponents();
        this.setMinimumSize(new Dimension(1038, 748));
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

        pnlHeading = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblHeadingAccountHelp = new javax.swing.JLabel();
        lblAlreadyAlly = new javax.swing.JLabel();
        scrInfo = new javax.swing.JScrollPane();
        txaInfo = new javax.swing.JTextArea();
        lblLinkCreateAcc = new javax.swing.JLabel();
        lblLinkSignIn = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlHeading.setBackground(new java.awt.Color(0, 102, 153));

        lblHeading.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(239, 128, 47));
        lblHeading.setText("Creating A Tennis Alliance Account");

        lblMinimize.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.setText("-");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("x");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                .addContainerGap(954, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
            .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                    .addContainerGap(244, Short.MAX_VALUE)
                    .addComponent(lblHeading)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 92, Short.MAX_VALUE))
            .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                    .addContainerGap(55, Short.MAX_VALUE)
                    .addComponent(lblHeading)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        getContentPane().add(pnlHeading);
        pnlHeading.setBounds(0, 0, 1040, 150);

        lblHeadingAccountHelp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHeadingAccountHelp.setForeground(new java.awt.Color(239, 128, 47));
        lblHeadingAccountHelp.setText("How do I create a Tennis Alliance Account?");
        getContentPane().add(lblHeadingAccountHelp);
        lblHeadingAccountHelp.setBounds(330, 180, 460, 29);

        lblAlreadyAlly.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblAlreadyAlly.setForeground(new java.awt.Color(239, 128, 47));
        lblAlreadyAlly.setText("Already an Ally?");
        getContentPane().add(lblAlreadyAlly);
        lblAlreadyAlly.setBounds(20, 400, 142, 25);

        txaInfo.setEditable(false);
        txaInfo.setBackground(new java.awt.Color(0, 102, 153));
        txaInfo.setColumns(20);
        txaInfo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txaInfo.setForeground(new java.awt.Color(255, 255, 255));
        txaInfo.setLineWrap(true);
        txaInfo.setRows(5);
        txaInfo.setText("Creating a Tennis Alliance Account is \neasy. To get started you’ll need an \nemail address.\n\nYou’ll also be asked to create a unique five-character password to keep your \naccount safe. Make sure it's memorable\nand not one you've ever used on any \nother website before.");
        scrInfo.setViewportView(txaInfo);

        getContentPane().add(scrInfo);
        scrInfo.setBounds(330, 220, 370, 190);

        lblLinkCreateAcc.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblLinkCreateAcc.setForeground(new java.awt.Color(255, 255, 255));
        lblLinkCreateAcc.setText("Click Here to Create a Tennis Alliance Account");
        lblLinkCreateAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkCreateAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkCreateAccMouseClicked(evt);
            }
        });
        getContentPane().add(lblLinkCreateAcc);
        lblLinkCreateAcc.setBounds(270, 650, 650, 60);

        lblLinkSignIn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLinkSignIn.setForeground(new java.awt.Color(255, 255, 255));
        lblLinkSignIn.setText("Click Here to Sign in to your existing account");
        lblLinkSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkSignInMouseClicked(evt);
            }
        });
        getContentPane().add(lblLinkSignIn);
        lblLinkSignIn.setBounds(20, 430, 404, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesForPAT/simona.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 150, 1040, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);//minimizes the screen
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblLinkCreateAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkCreateAccMouseClicked
        new CreateAccount().setVisible(true);
    }//GEN-LAST:event_lblLinkCreateAccMouseClicked

    private void lblLinkSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkSignInMouseClicked
new SignInPage().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lblLinkSignInMouseClicked

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
            java.util.logging.Logger.getLogger(TechCreateAccHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TechCreateAccHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TechCreateAccHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TechCreateAccHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAlreadyAlly;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblHeadingAccountHelp;
    private javax.swing.JLabel lblLinkCreateAcc;
    private javax.swing.JLabel lblLinkSignIn;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JScrollPane scrInfo;
    private javax.swing.JTextArea txaInfo;
    // End of variables declaration//GEN-END:variables
}
