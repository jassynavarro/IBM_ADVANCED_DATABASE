package ibm_project;

public class logIn extends javax.swing.JFrame {
    
    public logIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 17, 50));
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(740, 410));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(47, 65, 106));
        jPanel1.setMinimumSize(new java.awt.Dimension(320, 273));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pass.png"))); // NOI18N
        jPanel1.add(pass_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 235, -1, 50));

        hide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide1MouseClicked(evt);
            }
        });
        jPanel1.add(hide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 255, 30, 20));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visible.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 256, 30, 20));

        email.setBackground(new java.awt.Color(47, 65, 106));
        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(null);
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 190, 30));

        password.setBackground(new java.awt.Color(47, 65, 106));
        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        password.setName(""); // NOI18N
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 160, 30));
        password.getAccessibleContext().setAccessibleName("");

        logIn.setBackground(new java.awt.Color(2, 25, 47));
        logIn.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        logIn.setForeground(new java.awt.Color(255, 255, 255));
        logIn.setText("LOG IN");
        logIn.setBorder(null);
        jPanel1.add(logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 140, 40));
        logIn.getAccessibleContext().setAccessibleName("");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("_______________________________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 230, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_______________________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 230, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ibm_connect.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 40, 320, 90));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("  X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 30));

        email_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
        jPanel1.add(email_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 167, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 310, 390));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IBM LOGIN LOGO .png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 420));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 420));

        jPanel3.setBackground(new java.awt.Color(0, 17, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 330, 420));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_icon1;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel hide1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logIn;
    private javax.swing.JLabel pass_icon;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
