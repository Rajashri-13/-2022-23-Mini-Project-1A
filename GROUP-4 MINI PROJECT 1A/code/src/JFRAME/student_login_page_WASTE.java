/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFRAME;

/**
 *
 * @author sumee
 */
public class student_login_page_WASTE extends javax.swing.JFrame {

    /**
     * Creates new form login_page
     */
    public student_login_page_WASTE() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_username = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_password = new app.bolivia.swing.JCTextField();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        jLabel6 = new javax.swing.JLabel();
        rSMaterialButtonCircle3 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle5 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle6 = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Welcome To ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/library-2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 960, 590));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("A.P SHAH INSTITUTE OF TECHNOLOGY");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1002, 830));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome , Login To Your Account");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Username");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        txt_username.setBackground(new java.awt.Color(51, 102, 255));
        txt_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txt_username.setPlaceholder("Enter Username...");
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 50, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 50, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        txt_password.setBackground(new java.awt.Color(51, 102, 255));
        txt_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txt_password.setPlaceholder("Enter Password...");
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, 40));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(255, 0, 0));
        rSMaterialButtonCircle1.setText("SIGNUP");
        jPanel2.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 200, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 40));

        rSMaterialButtonCircle3.setBackground(new java.awt.Color(0, 51, 51));
        rSMaterialButtonCircle3.setForeground(new java.awt.Color(153, 255, 255));
        rSMaterialButtonCircle3.setText("LOGIN TO ADMIN PORTAL");
        rSMaterialButtonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 280, 40));

        rSMaterialButtonCircle5.setBackground(new java.awt.Color(255, 255, 0));
        rSMaterialButtonCircle5.setForeground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle5.setText("FORGOT PASSWORD");
        jPanel2.add(rSMaterialButtonCircle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 200, 50));

        rSMaterialButtonCircle6.setBackground(new java.awt.Color(255, 153, 153));
        rSMaterialButtonCircle6.setText("LOGIN");
        jPanel2.add(rSMaterialButtonCircle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 200, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(997, 0, 540, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void rSMaterialButtonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonCircle3ActionPerformed

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
            java.util.logging.Logger.getLogger(student_login_page_WASTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_login_page_WASTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_login_page_WASTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_login_page_WASTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new student_login_page_WASTE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle3;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle5;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle6;
    private app.bolivia.swing.JCTextField txt_password;
    private app.bolivia.swing.JCTextField txt_username;
    // End of variables declaration//GEN-END:variables
}