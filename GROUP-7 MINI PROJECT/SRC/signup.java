/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system.project;

import javax.swing.JOptionPane;
import model.User;
import dao.UserDao;



/**
 *
 * @author HP
 */
public class signup extends javax.swing.JFrame {
    public String emailpattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern ="^[0-9]*$"; 

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
        btnsave.setEnabled(false);
        
    }
     public void clear(){
         txtname.setText("");
         txtemail.setText("");
         txtynum.setText("");
         txtaddresss.setText("");
         txtsecurityQ.setText("");
         txtans.setText("");
         txtpass.setText("");
         btnsave.setEnabled(false);
         
     }
     public void validateFeilds(){
            String name = txtname.getText();
            String email = txtemail.getText();
            String mobileNumber = txtynum.getText();
            String address = txtaddresss.getText();
            String password = txtpass.getText();
            String securityQuestion = txtsecurityQ.getText();
            String answer = txtans.getText();
            if(!name.equals("")&& email.matches(emailpattern) && 
                    mobileNumber.matches(mobileNumberPattern)&& mobileNumber.length() == 10 && 
                    !address.equals("") && !password.equals("") && !securityQuestion.equals("") && !answer.equals(""))
                btnsave.setEnabled(true);
            else
                btnsave.setEnabled(false);
     }
            
            
         
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtynum = new javax.swing.JTextField();
        txtaddresss = new javax.swing.JTextField();
        txtsecurityQ = new javax.swing.JTextField();
        txtans = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btnsave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nude colors aesthetic _ wallpaper.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setText("                  Signup");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 420, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 119, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("Mobile number:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Address:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 100, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Password:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 100, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 0));
        jLabel7.setText("Security Question:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 0));
        jLabel8.setText("Answer:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, -1, -1));

        txtname.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 351, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 351, -1));

        txtynum.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtynum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtynumActionPerformed(evt);
            }
        });
        txtynum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtynumKeyReleased(evt);
            }
        });
        getContentPane().add(txtynum, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 351, -1));

        txtaddresss.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtaddresss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddresssActionPerformed(evt);
            }
        });
        txtaddresss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaddresssKeyReleased(evt);
            }
        });
        getContentPane().add(txtaddresss, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 351, -1));

        txtsecurityQ.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtsecurityQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsecurityQActionPerformed(evt);
            }
        });
        txtsecurityQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsecurityQKeyReleased(evt);
            }
        });
        getContentPane().add(txtsecurityQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 351, -1));

        txtans.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtansKeyReleased(evt);
            }
        });
        getContentPane().add(txtans, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 351, -1));

        txtpass.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
        });
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 351, -1));

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(51, 0, 0));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(51, 0, 0));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 620, -1, 30));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(51, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 670, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 0));
        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 670, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsecurityQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsecurityQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsecurityQActionPerformed

    private void txtaddresssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddresssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddresssActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtynumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtynumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtynumActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to close Application","Select",JOptionPane.YES_NO_OPTION );
        if (a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        User user = new User();
        user.setName(txtname.getText());
        user.setEmail(txtemail.getText());
        user.setMobileNumber(txtynum.getText());
        user.setAddress(txtaddresss.getText ());
        user.setPassword(txtpass.getText());
        user.setSecurityQuestion(txtsecurityQ.getText());
        user.setAnswer(txtans.getText());
        UserDao.save(user);
        clear();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
            clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtaddresssKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaddresssKeyReleased
        // TODO add your handling code here:
        //validateFeilds();
    }//GEN-LAST:event_txtaddresssKeyReleased

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        // TODO add your handling code here:
        //validateFeilds();
    }//GEN-LAST:event_txtpassKeyReleased

    private void txtsecurityQKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsecurityQKeyReleased
        // TODO add your handling code here:
        //validateFeilds();
    }//GEN-LAST:event_txtsecurityQKeyReleased

    private void txtansKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtansKeyReleased
        // TODO add your handling code here:
        validateFeilds();
    }//GEN-LAST:event_txtansKeyReleased

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        // TODO add your handling code here:
        //validateFields();
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        // TODO add your handling code here:
        //validateFields();
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtynumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtynumKeyReleased
        // TODO add your handling code here:
       // validateFields();
    }//GEN-LAST:event_txtynumKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtaddresss;
    private javax.swing.JTextField txtans;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtsecurityQ;
    private javax.swing.JTextField txtynum;
    // End of variables declaration//GEN-END:variables
}
