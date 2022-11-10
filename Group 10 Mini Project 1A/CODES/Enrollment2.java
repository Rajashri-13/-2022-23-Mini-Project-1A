import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;



/**
 *
 * @author vanshika
 */
public class Enrollment2 extends javax.swing.JFrame {

    /**
     * Creates new form Enrollment2
     */DBconnection conn;
    public Enrollment2() {
        initComponents();
        
        conn = new DBconnection();
    if(conn==null)
    {
         JOptionPane.showMessageDialog(this,"DB not available","Error",JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtsports = new javax.swing.JComboBox<>();
        txtmember = new javax.swing.JComboBox<>();
        txtgender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BackImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel5.setText("Username");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(930, 190, 130, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setText("Email ID");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1270, 190, 130, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("Membership");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1270, 350, 170, 50);

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtusername);
        txtusername.setBounds(930, 240, 210, 40);
        jPanel1.add(txtemail);
        txtemail.setBounds(1270, 240, 210, 40);

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname);
        txtname.setBounds(600, 240, 210, 40);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(600, 190, 150, 50);

        txtsports.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtsports.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chess ", "Carrom", "Table tennis", "Gymnastics", "Cricket", "Football", "Atheltics", "Basketball" }));
        jPanel1.add(txtsports);
        txtsports.setBounds(930, 400, 210, 50);

        txtmember.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtmember.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quaterly", "Half Year", "Annual" }));
        jPanel1.add(txtmember);
        txtmember.setBounds(1270, 400, 210, 50);

        txtgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel1.add(txtgender);
        txtgender.setBounds(600, 400, 210, 50);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 345, 120, 50);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Sports");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(934, 340, 140, 50);

        jButton1.setBackground(new java.awt.Color(255, 204, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Enroll");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(890, 530, 190, 70);

        BackImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vedant\\Documents\\NetBeansProjects\\sportsclub\\src\\imagepath\\Black Icons Sports Facebook Cover (3).png")); // NOI18N
        jPanel1.add(BackImage);
        BackImage.setBounds(0, 0, 1900, 930);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String name=txtname.getText();
        String username=txtusername.getText();
        String email=txtemail.getText();
        String gender=txtgender.getSelectedItem().toString();
        String sports=txtsports.getSelectedItem().toString();
        String membership=txtmember.getSelectedItem().toString();
       conn.enroll(name, username, email, gender, sports, membership);
        
       JOptionPane.showMessageDialog(this,"User ENROLLED");
            txtname.setText("");
            txtusername.setText("");
            txtemail.setText("");
            txtgender.getSelectedItem().toString();
            txtsports.getSelectedItem().toString();
            txtmember.getSelectedItem().toString();
            System.out.println("data fetched????");
           
           
       
        
            
            
            
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Enrollment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enrollment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enrollment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enrollment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enrollment2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackImage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JComboBox<String> txtgender;
    private javax.swing.JComboBox<String> txtmember;
    private javax.swing.JTextField txtname;
    private javax.swing.JComboBox<String> txtsports;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

    
}