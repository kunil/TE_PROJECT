
package trendz;

//import java.sql.Date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class bill extends javax.swing.JFrame {

    String sum;
    
     public void fetch()
{
    try
    {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
        String q="select pid,prod_name,prod_type,mrp,qty,total_cost from product,link where product.id=link.id and link.bill_id=?";
        PreparedStatement pst=myConn.prepareStatement(q);
        pst.setInt(1,Trendz.bill_id);
        System.out.println(Trendz.bill_id);
        ResultSet rs=pst.executeQuery();
        
        billt.setModel(DbUtils.resultSetToTableModel(rs));
        
    }
      catch(Exception e){
            e.printStackTrace();
        }
}
    
    
    
    
    void showDate()
    {
        Date d= new Date();
        SimpleDateFormat s= new SimpleDateFormat("yyyy-MM-dd");
        date.setText(s.format(d));
        
    }
    void showTime()
    {  dispose();
              Date d= new Date();
        SimpleDateFormat s= new SimpleDateFormat("HH:mm:ss a");
        time.setText(s.format(d));
           }
    void total()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
        String q="select sum(total_cost) from product,link where product.id=link.id and link.bill_id=?";
        
        PreparedStatement pst=myConn.prepareStatement(q);
        pst.setInt(1,Trendz.bill_id);
        ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
            sum=rs.getString("sum(total_cost)");
            total.setText(sum);
          }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
    
     void cname()
    {
        
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
        String q="select cust_id,fname,lname,number from customer where cust_id=?";
        
         PreparedStatement pst=myConn.prepareStatement(q);
        pst.setInt(1,Trendz.cid);
        ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
            cid.setText(rs.getString("cust_id"));
            fname.setText(rs.getString("fname"));
             lname.setText(rs.getString("lname"));
             number.setText(rs.getString("number"));
             String mystring = Integer.toString(Trendz.admin_id);
             id_admin.setText(mystring);
            
          }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
        
    public bill() {
          this.setUndecorated(false);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        
        this.setSize(x,y);
        
        showDate();
        showTime();
        cname();
        fetch();
        total();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        billt = new javax.swing.JTable();
        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        id_admin = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        billt.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        billt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        billt.setIntercellSpacing(new java.awt.Dimension(2, 2));
        billt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(billt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 1395, 140));

        date.setEditable(false);
        date.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 0, 199, 50));

        time.setEditable(false);
        time.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 0, 167, 50));

        total.setEditable(false);
        total.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 640, 197, 59));

        fname.setEditable(false);
        fname.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 163, 54));

        cid.setEditable(false);
        cid.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });
        getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 55, 50));

        lname.setEditable(false);
        lname.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 165, 54));

        number.setEditable(false);
        number.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 210, 168, 54));

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 780, 118, 32));

        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jButton2.setForeground(java.awt.Color.black);
        jButton2.setText("Delete the Selected Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 880, 350, 79));

        jButton3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jButton3.setForeground(java.awt.Color.black);
        jButton3.setText("Insert New Item");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 880, 256, 79));

        id_admin.setEditable(false);
        id_admin.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        id_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_adminActionPerformed(evt);
            }
        });
        getContentPane().add(id_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, 56, 50));

        jTextField2.setEditable(false);
        jTextField2.setBackground(java.awt.Color.white);
        jTextField2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jTextField2.setText("TRENDZ");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 246, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trendz/new.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(2000, 1100));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -23, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try
        {
              Class.forName("com.mysql.jdbc.Driver");
              Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
              String q="UPDATE bill set date=?,time=?,amount=? where bill_id=?";
              PreparedStatement pst=myConn.prepareStatement(q);

              String date1=date.getText();
               pst.setString(1,date1);
              pst.setString(2,time.getText());
              pst.setString(3,sum);
               pst.setInt(4,Trendz.bill_id);
              pst.executeUpdate();
              JOptionPane.showMessageDialog(null,"Transaction Recorded Press ok to print the ");
              cust_login f1=new cust_login();
              f1.setVisible(true);
              dispose();
        }
        
         
         catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_printActionPerformed

    private void billtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billtMouseClicked
             i=billt.getSelectedRow();
             model=billt.getModel();
             
    }//GEN-LAST:event_billtMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            String id=model.getValueAt(i,0).toString();
            String stock=model.getValueAt(i,4).toString();
         try
        {
              Class.forName("com.mysql.jdbc.Driver");
              Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
              String q="delete from product where pid=? ";
              PreparedStatement pst=myConn.prepareStatement(q);
              pst.setString(1,id);
              pst.executeUpdate();
              
              
              String q2="update inventory set stock=stock+? where item_id=?";
              PreparedStatement pst2=myConn.prepareStatement(q2);
              pst2.setString(1,stock);
              pst2.setString(2,id);
              pst2.executeUpdate();
              fetch();
              total();
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                        // TODO add your handling code here:
       Trendz.flag2=1;
        System.out.println(Trendz.bill_id);
        product_form p1 = new product_form();
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void id_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_adminActionPerformed

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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable billt;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField date;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id_admin;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField number;
    private javax.swing.JButton print;
    private javax.swing.JTextField time;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
TableModel model;
int i;
String id;
    class ActionListenerImpl implements ActionListener {

        public ActionListenerImpl() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Date d= new Date();
            SimpleDateFormat s= new SimpleDateFormat("hh:mm:ss a");
            time.setText(s.format(d));
        }
    }
}
