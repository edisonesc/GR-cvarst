/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author edison
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setSize(410, 237);
        setResizable(false);
        formTitle.setHorizontalAlignment(SwingConstants.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minimizeButton = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        formTitle = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        passwordVisibility = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home/minimize_button.png"))); // NOI18N
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(minimizeButton);
        minimizeButton.setBounds(370, 0, 11, 20);

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home/close_button.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(closeButton);
        closeButton.setBounds(390, 0, 11, 20);

        formTitle.setBackground(new java.awt.Color(242, 242, 242));
        formTitle.setFont(new java.awt.Font("Ubuntu Condensed", 0, 13)); // NOI18N
        formTitle.setForeground(java.awt.Color.darkGray);
        formTitle.setText("Login");
        getContentPane().add(formTitle);
        formTitle.setBounds(0, 0, 410, 20);

        jLabel7.setBackground(new java.awt.Color(235, 235, 235));
        jLabel7.setOpaque(true);
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel7MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 410, 20);

        passwordText.setFont(new java.awt.Font("Ubuntu Light", 0, 15)); // NOI18N
        passwordText.setEchoChar('\u2022');
        getContentPane().add(passwordText);
        passwordText.setBounds(150, 100, 210, 28);

        passwordVisibility.setFont(new java.awt.Font("Ubuntu Light", 0, 15)); // NOI18N
        passwordVisibility.setText("show password");
        passwordVisibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordVisibilityActionPerformed(evt);
            }
        });
        getContentPane().add(passwordVisibility);
        passwordVisibility.setBounds(150, 130, 170, 22);

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 0, 15)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 100, 110, 30);

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 0, 15)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 70, 110, 30);

        usernameText.setFont(new java.awt.Font("Ubuntu Light", 0, 15)); // NOI18N
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        getContentPane().add(usernameText);
        usernameText.setBounds(150, 70, 210, 28);

        loginButton.setFont(new java.awt.Font("Ubuntu Light", 0, 13)); // NOI18N
        loginButton.setForeground(java.awt.Color.darkGray);
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(280, 190, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        // TODO add your handling code here:
        this.setState(HomeForm.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_closeButtonMouseClicked

    private void jLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseDragged
        // TODO add your handling code here:

        Point p = evt.getLocationOnScreen();
        this.setLocation(p);
    }//GEN-LAST:event_jLabel7MouseDragged

    private void passwordVisibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordVisibilityActionPerformed
        // TODO add your handling code here:
        if(passwordVisibility.isSelected()){
            System.out.print("showed");
            passwordText.setEchoChar((char)0);

        }
        else if(!passwordVisibility.isSelected()){
            passwordText.setEchoChar('•');
        }
    }//GEN-LAST:event_passwordVisibilityActionPerformed

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private JDialog showMessage(String s, String title, String type){
    
            JOptionPane jop = new JOptionPane(s, (type.equals("S")) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE);
            JDialog dialog = jop.createDialog(title);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            return dialog;
    }
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        int id = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvarst?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement st = cn.createStatement();
            PreparedStatement ps = cn.prepareStatement("select id, username, password from cvarst.GRUsers where username = ? and password = ?");
            ps.setString(1, usernameText.getText().toString());
            ps.setString(2, passwordText.getText().toString());
            ResultSet rs = ps.executeQuery();
            User user = new User();
            if(rs.next()){
                id = rs.getInt("id");
                user.setUserID(id);
                HomeForm homeForm = new HomeForm();
                this.dispose();
                homeForm.setVisible(true);
            }else{
                showMessage("Incorrect Username || Password","Information Error","E");
            }
            System.out.println("connected.");

        }
        catch(Exception e){
            e.printStackTrace();
        }
        
   

    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JCheckBox passwordVisibility;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
