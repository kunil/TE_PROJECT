
package trendz;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static trendz.Trendz.temp;

public class cust_login extends javax.swing.JFrame {

    
    public void id()
    {
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
           
            String query5 = "SELECT MAX(cust_id)+1 FROM customer";
            
            PreparedStatement pst5 = myConn.prepareStatement(query5);
                  
           
             ResultSet rs5=pst5.executeQuery();
             if(rs5.next())
             {
                 
                Trendz.temp=rs5.getString("MAX(cust_id)+1");
                Trendz.cid=Integer.parseInt(temp);
                
                System.out.println(Trendz.cid);
             }
        }
        
         catch(Exception e){
            e.printStackTrace();
        }    
        
    }
    
     public void id_old()
    {
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
           
            String query6 = "SELECT cust_id FROM customer where number = ?";
            PreparedStatement pst6 = myConn.prepareStatement(query6);
             pst6.setString(1,mobile.getText());
           
             ResultSet rs6=pst6.executeQuery();
             if(rs6.next())
             {
                 
                Trendz.temp=rs6.getString("cust_id");
               // System.out.println(Trendz.temp);
             }
        }
        
         catch(Exception e){
            e.printStackTrace();
        }    
        
    }

    public cust_login() {
        this.setUndecorated(false);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        Trendz.flag=0;
        Trendz.flag2=0;
        
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        
        this.setSize(x,y);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        new_user = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 0, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("ENTER THE CUSTOMERS MOBILE NUMBER");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 1020, 66));

        mobile.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        mobile.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mobileMouseMoved(evt);
            }
        });
        mobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobileFocusLost(evt);
            }
        });
        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobileKeyReleased(evt);
            }
        });
        getContentPane().add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 590, 90));

        submit.setBackground(java.awt.Color.black);
        submit.setForeground(java.awt.Color.white);
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 150, 50));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        new_user.setBackground(java.awt.Color.black);
        new_user.setForeground(java.awt.Color.white);
        new_user.setText("New User");
        new_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_userActionPerformed(evt);
            }
        });
        getContentPane().add(new_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 420, 150, 50));

        admin.setBackground(java.awt.Color.black);
        admin.setForeground(java.awt.Color.white);
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trendz/wallpaper2you_242496_2000x1100.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
        
    }//GEN-LAST:event_mobileActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
            String query = "select number from customer where number=? ";
            PreparedStatement pst = myConn.prepareStatement(query);
            pst.setString(1,mobile.getText());           
            ResultSet rs=pst.executeQuery();
            if(rs.next()&&(x>7000000000L &&x<9999999999L))
            {
                id_old();
                JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFUL\nCust ID: "+Trendz.temp);
                 String query2="select cust_id from customer where number=?";
                     PreparedStatement pst2=myConn.prepareStatement(query2);
                    pst2.setString(1,mobile.getText());
                    ResultSet rs2=pst2.executeQuery();
                    if(rs2.next())
                     {
                         Trendz.cid=rs2.getInt("cust_id");
                         
                     }
                    
                product_form p1 = new product_form();
                p1.setVisible(true);
            }
            else if((x>7000000000L &&x<9999999999L))
            {
                 Trendz.no=x;
                 id();
                 JOptionPane.showMessageDialog(null,"NEW USER\nCust ID: "+Trendz.temp);
                 cust_form form = new cust_form();
                 form.setVisible(true);             
            } 
            else
            {
                dispose();
                cust_login form1 = new cust_login();
                 form1.setVisible(true); 
            }      
            dispose();
            myConn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }                                
    }//GEN-LAST:event_submitActionPerformed

    private void mobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyReleased
         try
         {
             //long y = 7000000000L;
             x=Long.parseLong(mobile.getText());
             
         } 
         catch(NumberFormatException nfe)
         {
             JOptionPane.showMessageDialog(null,"Wrong Format.Enter a Number");
             mobile.setText("");
             
         }
    }//GEN-LAST:event_mobileKeyReleased

    private void new_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_userActionPerformed
                 id();
                 Trendz.flag=1;
                // Trendz.cid=Trendz.temp;
                 JOptionPane.showMessageDialog(null,"NEW USER"+"\n"+"CUST ID:"+Trendz.temp);
                 cust_form form = new cust_form();
                 form.setVisible(true);   
                 dispose();
    }//GEN-LAST:event_new_userActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
            admin form=new admin();
            form.setVisible(true);
            dispose();
    }//GEN-LAST:event_adminActionPerformed

    private void mobileMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileMouseMoved

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped

    }//GEN-LAST:event_mobileKeyTyped

    private void mobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileFocusLost

        
        if(x<7000000000L ||x>9999999999L)
             {
                 JOptionPane.showMessageDialog(null,"Wrong Format.Enter a Number");
             mobile.setText("");
             }
    }//GEN-LAST:event_mobileFocusLost

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cust_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cust_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cust_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cust_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cust_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mobile;
    private javax.swing.JButton new_user;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
long x;
}
