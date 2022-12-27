
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dalbir Singh
 */
public class GeneralDetails extends javax.swing.JFrame {

    /**
     * Creates new form GeneralDetails
     */
    public GeneralDetails() {
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
        jPanel2 = new javax.swing.JPanel();
        projectToggle = new javax.swing.JButton();
        experienceToggle = new javax.swing.JButton();
        eduUniversityToggle = new javax.swing.JButton();
        confirmationToggle = new javax.swing.JButton();
        saveGeneralInfo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        userLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        userDob = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        userPhoneNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userAddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        userEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userSkills = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        userHobbies = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        userId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 4, true));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GENERAL DETAILS ");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        projectToggle.setBackground(new java.awt.Color(51, 51, 51));
        projectToggle.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        projectToggle.setForeground(new java.awt.Color(204, 204, 204));
        projectToggle.setText("PROJECTS / INTERNSHIPS");
        projectToggle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        projectToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectToggleActionPerformed(evt);
            }
        });

        experienceToggle.setBackground(new java.awt.Color(51, 51, 51));
        experienceToggle.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        experienceToggle.setForeground(new java.awt.Color(204, 204, 204));
        experienceToggle.setText("EXPERIENCE");
        experienceToggle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        experienceToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experienceToggleActionPerformed(evt);
            }
        });

        eduUniversityToggle.setBackground(new java.awt.Color(51, 51, 51));
        eduUniversityToggle.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        eduUniversityToggle.setForeground(new java.awt.Color(204, 204, 204));
        eduUniversityToggle.setText("EDUCATIONAL DETAILS UNIVERSITY");
        eduUniversityToggle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        eduUniversityToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eduUniversityToggleActionPerformed(evt);
            }
        });

        confirmationToggle.setBackground(new java.awt.Color(51, 51, 51));
        confirmationToggle.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        confirmationToggle.setForeground(new java.awt.Color(204, 204, 204));
        confirmationToggle.setText("CONFIRMATION");
        confirmationToggle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        confirmationToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmationToggleActionPerformed(evt);
            }
        });

        saveGeneralInfo.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        saveGeneralInfo.setText("SAVE & CONTINUE");
        saveGeneralInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        saveGeneralInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGeneralInfoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("FIRST NAME");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));

        userFirstName.setBackground(new java.awt.Color(204, 204, 204));
        userFirstName.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        userFirstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("LAST NAME");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));

        userLastName.setBackground(new java.awt.Color(204, 204, 204));
        userLastName.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        userLastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText(" MOBILE NO.");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));

        userDob.setBackground(new java.awt.Color(204, 204, 204));
        userDob.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        userDob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("DATE OF BIRTH");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));

        userPhoneNo.setBackground(new java.awt.Color(204, 204, 204));
        userPhoneNo.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        userPhoneNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("ADDRESS");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));

        userAddress.setBackground(new java.awt.Color(204, 204, 204));
        userAddress.setColumns(20);
        userAddress.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        userAddress.setRows(5);
        userAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jScrollPane1.setViewportView(userAddress);

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("E-MAIL");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        userEmail.setBackground(new java.awt.Color(204, 204, 204));
        userEmail.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        userEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        userEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userEmailActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HOBBIES");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        userSkills.setBackground(new java.awt.Color(204, 204, 204));
        userSkills.setColumns(20);
        userSkills.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        userSkills.setRows(5);
        userSkills.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jScrollPane2.setViewportView(userSkills);

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SKILLS");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));

        userHobbies.setBackground(new java.awt.Color(204, 204, 204));
        userHobbies.setColumns(20);
        userHobbies.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        userHobbies.setRows(5);
        userHobbies.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jScrollPane4.setViewportView(userHobbies);

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 204));
        jButton7.setText("EDUCATIONAL DETAILS SSC / HSC");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        userId.setEditable(false);
        userId.setBackground(new java.awt.Color(51, 51, 51));
        userId.setForeground(new java.awt.Color(51, 51, 51));
        userId.setBorder(null);
        userId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userDob, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(userId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(eduUniversityToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(239, 239, 239))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(115, 115, 115))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(saveGeneralInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(129, 129, 129))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(projectToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(experienceToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmationToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(experienceToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmationToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eduUniversityToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(userId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                .addComponent(saveGeneralInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(123, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userDob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userEmailActionPerformed

    private void confirmationToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmationToggleActionPerformed
    Confirmation CO = new Confirmation();
    String _id = userId.getText();
    CO.get_edu_confirm_detail(_id);

CO.show();
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_confirmationToggleActionPerformed

    private void saveGeneralInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGeneralInfoActionPerformed
EducationDetailsHS EDHS = new EducationDetailsHS();
        String _id = userId.getText();
        String _userFirstName = userFirstName.getText();
	String _userLastName = userLastName.getText();
        String _userSkills = userSkills.getText();
        String _userHobbies = userHobbies.getText();
        String _userEmail = userEmail.getText();
        String _userDob = userDob.getText();
        String _userPhoneNo = userPhoneNo.getText();
        String _userAddress = userAddress.getText();
        
        Transaction obj = new Transaction();
        obj.set_general_info(_id, _userFirstName, _userLastName, _userAddress, _userPhoneNo, _userDob, _userEmail, _userHobbies, _userSkills);
        
        EDHS.get_edu_school_detail(_id);
        
EDHS.show();
dispose();
        

// TODO add your handling code here:
    }//GEN-LAST:event_saveGeneralInfoActionPerformed

    private void eduUniversityToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eduUniversityToggleActionPerformed
   EducationalDetailsUni EDU = new EducationalDetailsUni();
   String _id = userId.getText();
   EDU.get_edu_university_detail(_id);
EDU.show();
dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_eduUniversityToggleActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
EducationDetailsHS EDHS = new EducationDetailsHS();
String _id = userId.getText();
EDHS.get_edu_school_detail(_id);

EDHS.show();
dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void experienceToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experienceToggleActionPerformed
ExperienceDetails EXP = new ExperienceDetails();
   String _id = userId.getText();
   EXP.get_edu_experience_detail(_id);
EXP.show();
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_experienceToggleActionPerformed

    private void projectToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectToggleActionPerformed
ProjectDetails PJ = new ProjectDetails();
String _id = userId.getText();
PJ.get_edu_intern_detail(_id);
PJ.show();
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_projectToggleActionPerformed

    private void userIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIdActionPerformed

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
            java.util.logging.Logger.getLogger(GeneralDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

             GeneralDetails gd = new GeneralDetails();
             new GeneralDetails().setVisible(true);
             
             }
        });
    }
    
//    void set_user_detail(String id, String user_firstname, String user_lastname)
//    {
//       String _userFirstName = user_firstname ;
//       String _userLastName = user_lastname ;
//       String _userid = id ;
//
//       userFirstName.setText(_userFirstName);
//       userLastName.setText(_userLastName);
//       userId.setText(_userid);
//    }
    
    void get_general_detail(String id)
    {
       try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/resume","root","Dalbir@P3517");
            
            String check_query = "Select * from generalinfo Where userid='" + id + "'";
            java.sql.PreparedStatement ps = con.prepareStatement(check_query);
            java.sql.ResultSet checkResultSet = ps.executeQuery(check_query);
            

            
                        
            if (checkResultSet.next() == true) {
                
            String query = "Select * from generalinfo Where userid='" + id + "'";
            java.sql.PreparedStatement pcs = con.prepareStatement(query);
            java.sql.ResultSet resultSet = pcs.executeQuery(query);
                
            String _userid = "" ;
            String _userFirstName = "" ;
            String _userLastName = "" ;
            String _userAddress = "";
            String _userPhoneNo = "";
            String _userDob = "";
            String _userEmail = "";
            String _userHobbies = "";
            String _userSkills = "";
                
              while (resultSet.next()) {
                    _userid = resultSet.getString("userid");
                    _userFirstName = resultSet.getString("userFirstName");
                    _userLastName = resultSet.getString("userLastName");
                    _userAddress = resultSet.getString("userAddress");
                    _userPhoneNo = resultSet.getString("userPhoneNo");
                    _userDob = resultSet.getString("userDob");
                    _userEmail = resultSet.getString("userEmail");
                    _userHobbies = resultSet.getString("userHobbies");
                    _userSkills = resultSet.getString("userSkills");

                    userFirstName.setText(_userFirstName);
                    userLastName.setText(_userLastName);
                    userAddress.setText(_userAddress);
                    userPhoneNo.setText(_userPhoneNo);
                    userDob.setText(_userDob);
                    userEmail.setText(_userEmail);
                    userHobbies.setText(_userHobbies);
                    userSkills.setText(_userSkills);
                    userId.setText(_userid);
             }
                
          } 
            if (checkResultSet.next() == false) {
                
            String user_query = "Select * from user Where id='" + id + "'";
            java.sql.PreparedStatement pst = con.prepareStatement(user_query);
            java.sql.ResultSet rs = pst.executeQuery(user_query);
            String _userid = "" ;
            String _userFirstName = "" ;
            String _userLastName = "" ;
                while (rs.next()) {
                    _userid = rs.getString("id");
                    _userFirstName = rs.getString("userFirstName");
                    _userLastName = rs.getString("userLastName");
                }
                userFirstName.setText(_userFirstName);
                userLastName.setText(_userLastName);
                userId.setText(_userid);     
            }
            
           con.close();
          
	}catch(Exception e){ System.out.println(e);} 
        
    }
    
//    void view_user_detail(String id, String user_firstname, String user_lastname, String user_address, String user_phone_no, String user_dob, String user_email, String user_hobbies, String user_skills)
//    {
//            String _userid = id ;
//            String _userFirstName = user_firstname ;
//            String _userLastName = user_lastname ;
//            String _userAddress = user_address;
//            String _userPhoneNo = user_phone_no;
//            String _userDob = user_dob;
//            String _userEmail = user_email;
//            String _userHobbies = user_hobbies;
//            String _userSkills = user_skills;
//
//       userFirstName.setText(_userFirstName);
//       userLastName.setText(_userLastName);
//       userAddress.setText(_userAddress);
//       userPhoneNo.setText(_userPhoneNo);
//       userDob.setText(_userDob);
//       userEmail.setText(_userEmail);
//       userHobbies.setText(_userHobbies);
//       userSkills.setText(_userSkills);
//       userId.setText(_userid);
//    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmationToggle;
    private javax.swing.JButton eduUniversityToggle;
    private javax.swing.JButton experienceToggle;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton projectToggle;
    private javax.swing.JButton saveGeneralInfo;
    private javax.swing.JTextArea userAddress;
    private javax.swing.JTextField userDob;
    private javax.swing.JTextField userEmail;
    private javax.swing.JTextField userFirstName;
    private javax.swing.JTextArea userHobbies;
    private javax.swing.JTextField userId;
    private javax.swing.JTextField userLastName;
    private javax.swing.JTextField userPhoneNo;
    private javax.swing.JTextArea userSkills;
    // End of variables declaration//GEN-END:variables
}
