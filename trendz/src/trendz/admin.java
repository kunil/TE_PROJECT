
package trendz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Toolkit;


public class admin extends javax.swing.JFrame {

    public admin() {
        this.setUndecorated(false);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        
        this.setSize(x,y);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        customer = new javax.swing.JRadioButton();
        stock = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 130, 50));

        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("PASSWORD:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, 70));

        name.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        name.setForeground(java.awt.Color.black);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 230, 50));

        password.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        password.setForeground(java.awt.Color.black);
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 230, 50));

        submit.setBackground(java.awt.Color.black);
        submit.setForeground(java.awt.Color.white);
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 760, 130, 60));

        buttonGroup1.add(customer);
        customer.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        customer.setForeground(java.awt.Color.black);
        customer.setText("Customer Transactions");
        customer.setContentAreaFilled(false);
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        getContentPane().add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 660, -1, 30));

        stock.setBackground(java.awt.Color.black);
        buttonGroup1.add(stock);
        stock.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        stock.setForeground(java.awt.Color.black);
        stock.setText("Stock update and Information");
        stock.setContentAreaFilled(false);
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        getContentPane().add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, -1, -1));

        jLabel4.setFont(new java.awt.Font("Samanata", 1, 48)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("ADMIN LOGIN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 430, 70));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        exit.setBackground(java.awt.Color.black);
        exit.setForeground(java.awt.Color.white);
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 50));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trendz/260758_2000x1100.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try
        {
            //myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
            String query = "select * from admin where name=? and password=?";
            PreparedStatement pst = myConn.prepareStatement(query);
            pst.setString(1,name.getText());
            pst.setString(2,password.getText());
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"HI "+rs.getString("name")+"\nLOGIN SUCCESSFUL\nPRESS OK TO CONTINUE "); 
                Trendz.admin_id=rs.getInt("admin_id");
                if(result==0)
                {
                     NewJFrame form1;
                     form1 = new NewJFrame();
                     form1.setVisible(true);
                }
                else
                {
                   cust_login form1= new cust_login();
                   form1.setVisible(true);
                }
                dispose();                      
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Password wrong","Error message",JOptionPane.ERROR_MESSAGE);
                name.setText("");
                password.setText("");
                buttonGroup1.clearSelection();
            } 
            myConn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_submitActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
         result=1;
    }//GEN-LAST:event_customerActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        result=0;
    }//GEN-LAST:event_stockActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
            dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyPressed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton customer;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JRadioButton stock;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables

int result;
}
