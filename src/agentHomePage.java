
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Himani Patil
 */
public class agentHomePage extends javax.swing.JFrame {

//    public int z = 0;
    /**
     * Creates new form agentHomePage
     */
   public agentHomePage() {
      initComponents();
        newCustomerButton.setVisible(true);        
        customerDetailsButton.setVisible(true);
       viewPackagesButton.setVisible(true);
       viewHotelsButton.setVisible(true);
        logoutButton.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel6.setVisible(true);
        
        
        
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
        newCustomerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        customerDetailsButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        viewPackagesButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        viewHotelsButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newCustomerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/clipart1444687_1.png"))); // NOI18N
        newCustomerButton.setBorder(null);
        newCustomerButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                newCustomerButtonComponentShown(evt);
            }
        });
        newCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 80, 80));

        jLabel2.setBackground(new java.awt.Color(153, 0, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Customer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        customerDetailsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/unnamed.png"))); // NOI18N
        customerDetailsButton.setBorder(null);
        customerDetailsButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                customerDetailsButtonComponentShown(evt);
            }
        });
        customerDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerDetailsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(customerDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 90, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        viewPackagesButton.setBackground(new java.awt.Color(51, 0, 51));
        viewPackagesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/lets_go_travel_banner_with_famous_symbols_background_6825996.jpg"))); // NOI18N
        viewPackagesButton.setBorder(null);
        viewPackagesButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                viewPackagesButtonComponentShown(evt);
            }
        });
        viewPackagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPackagesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewPackagesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 90, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("View Packages");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        viewHotelsButton.setBackground(new java.awt.Color(51, 0, 51));
        viewHotelsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/hotel-building-isolated-city-street-vector-illustration-flat-cartoon_101884-680.jpg"))); // NOI18N
        viewHotelsButton.setBorder(null);
        viewHotelsButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                viewHotelsButtonComponentShown(evt);
            }
        });
        viewHotelsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHotelsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewHotelsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 90, 90));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("View Hotels");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/Goa Hotel1.jpeg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 100, 70));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add Hotels");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 82, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/lets_go_travel_banner_with_famous_symbols_background_6825996.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, 90, 80));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add Packages");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 114, -1));

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/images.png"))); // NOI18N
        logoutButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                logoutButtonComponentShown(evt);
            }
        });
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 100, 52, 54));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/1621824.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 110, 40, 40));

        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/menu-gf24f37c12_640_1.png"))); // NOI18N
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
        });
        getContentPane().add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 84, 73));

        jButton1.setText("BOOK PACKAGES HERE !");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 240, 60));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/about.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 100, 100));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Only for registered customers");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 160, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/Exotic weekend in manali_1.jpg"))); // NOI18N
        jLabel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 300, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/Krp4TI.jpg"))); // NOI18N
        jLabel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 310, -1));

        jLabel18.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Welcome to Jim's Travel Agency");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 540, 50));

        jLabel17.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TIME TO TRAVEL!");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 440, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/rounded-rectangle-128.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/rounded-rectangle-128.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/rounded-rectangle-128.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, 110));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/rounded-rectangle-128.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/rounded-rectangle-128.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(64, 64));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 130, 100));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/rounded-rectangle-128.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, 110));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/photo-1574610758891-5b809b6e6e2e.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AllImages/rounded-rectangle-128.png"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(64, 64));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 130, 100));

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        jLabel19.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("TIME TO TRAVEL!");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 440, 50));

        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit?", "Select", JOptionPane.YES_NO_OPTION);
        
        if(a == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you reallt want to Logout?", "Select", JOptionPane.YES_NO_OPTION);
        
        if(a == 0)
        {
            setVisible(false);
            new LoginPage().setVisible(true);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        // TODO add your handling code here:
//        if(z == 0)
//        {
//            try
//            {
//                Thread.sleep(250);
//                newCustomerButton.setVisible(true);
//                jLabel2.setVisible(true);
//            }
//            catch(Exception e)
//            {}
//        }
//        
//        else
//        {
//              newCustomerButton.setVisible(false);
//              customerDetailsButton.setVisible(false);
//              viewPackagesButton.setVisible(false);
//              viewHotelsButton.setVisible(false);
//              logoutButton.setVisible(false);
//              jLabel2.setVisible(false);
//              jLabel3.setVisible(false);
//              jLabel4.setVisible(false);
//              jLabel6.setVisible(false); 
//              z = 0;
//        }
    }//GEN-LAST:event_menuButtonMouseClicked

    private void newCustomerButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_newCustomerButtonComponentShown
        // TODO add your handling code here:
       // try
//            {
//                Thread.sleep(250);
//                customerDetailsButton.setVisible(true);
//                jLabel3.setVisible(true);
//            }
//            catch(Exception e)
//            {}
    }//GEN-LAST:event_newCustomerButtonComponentShown

    private void customerDetailsButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customerDetailsButtonComponentShown
        // TODO add your handling code here:
//        try
//            {
//                Thread.sleep(250);
//                viewPackagesButton.setVisible(true);
//                jLabel4.setVisible(true);
//            }
//            catch(Exception e)
//            {}
    }//GEN-LAST:event_customerDetailsButtonComponentShown

    private void viewHotelsButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_viewHotelsButtonComponentShown
        // TODO add your handling code here:
//        try
//            {
//                Thread.sleep(250);
//                logoutButton.setVisible(true);
//                z = 1;
//                
//            }
//            catch(Exception e)
//            {}
    }//GEN-LAST:event_viewHotelsButtonComponentShown

    private void logoutButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_logoutButtonComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonComponentShown

    private void viewPackagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPackagesButtonActionPerformed
        // TODO add your handling code here:
        
        new viewPackages().setVisible(true);
        
    }//GEN-LAST:event_viewPackagesButtonActionPerformed

    private void viewPackagesButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_viewPackagesButtonComponentShown
        // TODO add your handling code here:
//         try
//            {
//                Thread.sleep(250);
//                viewHotelsButton.setVisible(true);
//                jLabel6.setVisible(true);
//            }
//            catch(Exception e)
//            {}
    }//GEN-LAST:event_viewPackagesButtonComponentShown

    private void newCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustomerButtonActionPerformed
        // TODO add your handling code here:
//        setVisible(false);
        new newCustomer().setVisible(true);
    }//GEN-LAST:event_newCustomerButtonActionPerformed

    private void customerDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerDetailsButtonActionPerformed
        // TODO add your handling code here:
//        setVisible(false);
        new customerDetails().setVisible(true);
        
    }//GEN-LAST:event_customerDetailsButtonActionPerformed

    private void viewHotelsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHotelsButtonActionPerformed
        // TODO add your handling code here:
//        setVisible(false);
        new viewHotels().setVisible(true);
    }//GEN-LAST:event_viewHotelsButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        new addHotels().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
//        setVisible(false);
        new addPackages().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new registeredCustomer().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new AboutUs().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(agentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agentHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton customerDetailsButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton newCustomerButton;
    private javax.swing.JButton viewHotelsButton;
    private javax.swing.JButton viewPackagesButton;
    // End of variables declaration//GEN-END:variables
}
