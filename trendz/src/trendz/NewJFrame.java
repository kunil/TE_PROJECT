/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trendz;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jordan
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        this.setUndecorated(false);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
             level.setVisible(false);
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        
        this.setSize(x,y);
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        update = new javax.swing.JButton();
        Transaction1 = new javax.swing.JButton();
        month = new javax.swing.JButton();
        level = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        update.setForeground(java.awt.Color.black);
        update.setText("Update The Stock");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 1000, 170));

        Transaction1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        Transaction1.setForeground(java.awt.Color.black);
        Transaction1.setText("Click To Display The Transactions Above the Specified Range");
        Transaction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Transaction1ActionPerformed(evt);
            }
        });
        getContentPane().add(Transaction1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 1000, 170));

        month.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        month.setForeground(java.awt.Color.black);
        month.setText("Click To Display All The Transactions On A Particular Date");
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 1000, 170));

        level.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        level.setForeground(java.awt.Color.black);
        level.setText("Click To Display All The Customers Of A Level");
        level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelActionPerformed(evt);
            }
        });
        getContentPane().add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 1010, 170));

        admin.setText("ADMIN");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, 116, 44));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trendz/bill2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         item_form form1;
        form1 = new item_form();
        form1.setVisible(true);
        dispose();
    }//GEN-LAST:event_updateActionPerformed

    private void Transaction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Transaction1ActionPerformed
        // TODO add your handling code here:
        Trendz.range=JOptionPane.showInputDialog("Enter the range");
        System.out.println(Trendz.range);
       
        transaction form1;
        form1 = new transaction();
        form1.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_Transaction1ActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
         dispose();
         day d1=new day();
         d1.setVisible(true); 
    }//GEN-LAST:event_monthActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
         admin form=new admin();
        form.setVisible(true);
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    private void levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelActionPerformed
        // TODO add your handling code here:
        Trendz.level=JOptionPane.showInputDialog("Enter the level");
        System.out.println(Trendz.level);
        dispose();
        level l1=new level();
        l1.setVisible(true);
    }//GEN-LAST:event_levelActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Transaction1;
    private javax.swing.JButton admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton level;
    private javax.swing.JButton month;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
