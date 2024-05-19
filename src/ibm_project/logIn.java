package ibm_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
        

public class logIn extends javax.swing.JFrame {
    
    Connection conn = null;
    
    public logIn() {
        initComponents();
        conn = DBConnection.ConnectDB("jdbc:mysql://localhost:3306/aybiem", "root", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass_icon = new javax.swing.JLabel();
        hide1 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        logIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        email_icon1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 17, 50));
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(735, 410));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(735, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pass.png"))); // NOI18N
        getContentPane().add(pass_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, 50));

        hide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hide1.setAlignmentX(0.5F);
        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide1MouseClicked(evt);
            }
        });
        getContentPane().add(hide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 239, 30, 50));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visible.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, 30));

        email.setBackground(new java.awt.Color(47, 65, 106));
        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email");
        email.setBorder(null);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 190, 30));

        password.setBackground(new java.awt.Color(47, 65, 106));
        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        password.setToolTipText("");
        password.setBorder(null);
        password.setName(""); // NOI18N
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 160, 30));
        password.getAccessibleContext().setAccessibleName("");

        logIn.setBackground(new java.awt.Color(2, 25, 47));
        logIn.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        logIn.setForeground(new java.awt.Color(255, 255, 255));
        logIn.setText("LOG IN");
        logIn.setBorder(null);
        logIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });
        getContentPane().add(logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 140, 40));
        logIn.getAccessibleContext().setAccessibleName("");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("__________________________________");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 260, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("__________________________________");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 260, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ibm_connect.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 320, 90));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("  X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 30, 30));

        email_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
        getContentPane().add(email_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login background (1).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        password.setEchoChar((char)8226);
        hide1.setVisible(true);
        hide1.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void hide1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MouseClicked
        password.setEchoChar((char)0);
        hide1.setVisible(false);
        hide1.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_hide1MouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
        if(password.getText().equals("Password")){
            password.setText("");
            password.setEchoChar((char)8226);
        }
        else {
            password.selectAll();
        }
    }//GEN-LAST:event_passwordFocusGained

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
        if(email.getText().equals("Email")){
            email.setText("");
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
        if(email.getText().equals("")){
            email.setText("Email");
        }
        
    }//GEN-LAST:event_emailFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        // TODO add your handling code here:
        if (password.getText().equals("")) {
            password.setText("Password");
            password.setEchoChar((char)0);
        }
    }//GEN-LAST:event_passwordFocusLost

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
//        System.out.print("Button clicked");

        String userEmail = email.getText();
        String userPassword = new String(password.getPassword()); // Convert char[] to String
        
        if (userEmail.equals("Email") || userPassword.equals("Password")) {
            // Show error message
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter email and password.");
            return;
            
        }
          // Define the connection parameters
          String dbUrl = "jdbc:mysql://localhost:3306/aybiem"; // JDBC URL for connecting to the database
          String dbUser = "root"; // Database username
          String dbPass = ""; // Database password (blank in this case)
          
          try {
              // Load the MySQL JDBC driver
              Class.forName("com.mysql.cj.jdbc.Driver");
              
              // Establish the connection to the database
              Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
              System.out.println("Connection successful!");
              
              // Prepare the SQL query to check the user's credentials
              String sql = "SELECT * FROM login WHERE email = ? AND password = ?";
              //used to safely insert values into the SQL statement.
              //'?' as placeholders for parameters to be set later
              PreparedStatement pst = conn.prepareStatement(sql); 
              pst.setString(1, userEmail); // sets the first placeholder (?) to userEmail
              pst.setString(2, userPassword); // sets the second placeholder (?) to userPassword
              
              ResultSet rs = pst.executeQuery(); //execute insertion
              
              if (rs.next()) {
                // Successful login
                javax.swing.JOptionPane.showMessageDialog(this, "Login successful!");
                // Redirect to the next page or perform another action
               } else {
                // Login failed
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid email or password.");
               }
            
               rs.close();
               pst.close();
               conn.close();
              
          } catch(Exception e){
              // Handle any exceptions that occur during the database connection or query execution
              e.printStackTrace();
              javax.swing.JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage());
              
          }
    }//GEN-LAST:event_logInActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_icon1;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel hide1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logIn;
    private javax.swing.JLabel pass_icon;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
