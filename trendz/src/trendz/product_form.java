
package trendz;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class product_form extends javax.swing.JFrame {
    


    public product_form() {
        this.setUndecorated(false);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        
        this.setSize(x,y);
        id.setText(Trendz.temp);
        fetch();
        if(Trendz.flag2==0)
        bill_create();
        
    }
    public void reset()
    {
        pid.setText("");
        name.setText("");
        type.setText("");
        mrp.setText("");
        qty.setValue(1);
    }
    public void fetch()
{
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
        String q="select * from inventory where stock!=?";
        PreparedStatement pst4=myConn.prepareStatement(q);
        pst4.setInt(1,0);
        ResultSet rs=pst4.executeQuery();
        
        items.setModel(DbUtils.resultSetToTableModel(rs));
        
    }
      catch(Exception e){
            e.printStackTrace();
        }
}
    public void bill_create()
    {
            try
         {
                   // pst.setInt(1, Trendz.cid);
                   Class.forName("com.mysql.jdbc.Driver");
                     Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
                           String query3="INSERT INTO bill(cust_id,admin_id) values(?,?)";
                    PreparedStatement pst3 = myConn.prepareStatement(query3);
                   // System.out.print(Trendz.cid);
                    pst3.setInt(1,Trendz.cid);
                    pst3.setInt(2,Trendz.admin_id);
                    pst3.executeUpdate();
                    String query5 = "SELECT MAX(bill_id) FROM bill";
                    PreparedStatement pst5 = myConn.prepareStatement(query5);
                    ResultSet rs5=pst5.executeQuery();
                    if(rs5.next())
                    {
                        Trendz.bill_id=rs5.getInt("MAX(bill_id)");
                    }
    }       catch(Exception e){
            e.printStackTrace();
        }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        qty = new javax.swing.JSpinner();
        submit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mrp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bill = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        items = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("PRODUCT NAME :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        name.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 270, 50));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("PRODUCT TYPE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("QUANTITY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, -1, -1));

        qty.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        qty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 700, 60, 50));

        submit.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        submit.setForeground(java.awt.Color.black);
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 800, 170, 70));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("MRP");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, -1, -1));

        mrp.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        mrp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mrpKeyReleased(evt);
            }
        });
        getContentPane().add(mrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, 170, 60));

        jLabel6.setBackground(java.awt.Color.darkGray);
        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 70)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Product Details");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 560, 70));

        bill.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        bill.setForeground(java.awt.Color.black);
        bill.setText("Proceed to bill");
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });
        getContentPane().add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 800, 210, 70));

        items.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        items.setForeground(java.awt.Color.black);
        items.setModel(new javax.swing.table.DefaultTableModel(
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
        items.setIntercellSpacing(new java.awt.Dimension(5, 2));
        items.setRowHeight(25);
        jScrollPane1.setViewportView(items);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 710, 180));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("PID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, 50));

        pid.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        pid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pidFocusLost(evt);
            }
        });
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        getContentPane().add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 170, 50));

        type.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 270, 50));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 90, 30));

        back.setText("<<back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trendz/kk.jpg"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(2000, 1400));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
    try
    {                
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
            String query2="SELECT stock FROM inventory WHERE item_id=?";
            
            PreparedStatement pst2=myConn.prepareStatement(query2);
            pst2.setString(1,pid.getText());
            System.out.print(pid.getText());
            ResultSet rs=pst2.executeQuery();
            if(rs.next())
            {
                int y=rs.getInt("stock");
                 int result=y-(int)qty.getValue();
               
                if(result>=0)
                {
                      String query = "insert into product(pid,prod_name,prod_type,mrp,qty,total_cost) values(?,?,?,?,?,?)";
                      PreparedStatement pst = myConn.prepareStatement(query);
                      pst.setString(1,pid.getText());
                      pst.setString(2,name.getText());
                      pst.setString(3,type.getText());
                      pst.setString(4,mrp.getText());
                      pst.setInt(5,(int)qty.getValue());
                      stk=(int)qty.getValue();
                      System.out.println(stk);
                      ttotal=stk*mrp1;
                      pst.setInt(6,ttotal);
                      pst.executeUpdate();
                      
                      int item_id = 0;
                      
                      String query5 = "SELECT MAX(id) FROM product";
                      PreparedStatement pst5 = myConn.prepareStatement(query5);
                      ResultSet rs5=pst5.executeQuery();
                      if(rs5.next())
                      {
                         item_id=rs5.getInt("MAX(id)");
                         System.out.print(item_id);
                      }
                      
                      String query4="INSERT INTO link values(?,?)";
                      PreparedStatement pst4=myConn.prepareStatement(query4);
                      pst4.setInt(1,item_id);
                      pst4.setInt(2,Trendz.bill_id);
                      pst4.executeUpdate();                     
               
                      String query3="update inventory set stock=? where item_id=?";
                      PreparedStatement pst3=myConn.prepareStatement(query3); 
                      pst3.setInt(1,result);
                      pst3.setString(2,pid.getText());
                      pst3.executeUpdate();
                      
                      //Trendz.bill_id2=Trendz.bill_id;
                }
                else
                {
                         JOptionPane.showMessageDialog(null, "Sorry!Not enough stock");
                 }
            }
            fetch();
            reset();
    }//GEN-LAST:event_submitActionPerformed
catch(Exception e){
     e.printStackTrace();
        }
    }
    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased

    }//GEN-LAST:event_formKeyReleased

    private void mrpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mrpKeyReleased
         try
         {
             float x;
             x=Float.parseFloat(mrp.getText());
         } 
         catch(NumberFormatException nfe)
         {
             JOptionPane.showMessageDialog(null,"Wrong Format\nEnter a Number");
             mrp.setText("");
         }       
    }//GEN-LAST:event_mrpKeyReleased

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        // Trendz.bill_id2=Trendz.bill_id;
        // System.out.println(Trendz.bill_id2);
        bill b = new bill();
       b.setVisible(true);  
       dispose();
    }//GEN-LAST:event_billActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
      //System.out.print("x");
        try
        {
            int x;
            x=Integer.parseInt(pid.getText());
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null,"Wrong Format\nEnter a Number");
            pid.setText("");
        }
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
             Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
            
             String query5="SELECT type,name,SP FROM inventory WHERE item_id=?";
             PreparedStatement ps = myConn.prepareStatement(query5);
             ps.setString(1,pid.getText());
             ResultSet rs2=ps.executeQuery();
             if(rs2.next())
             {
                   name.setText(rs2.getString("name"));
                   mrp1=rs2.getInt("SP");
                   mrp.setText(rs2.getString("SP"));
                   type.setText(rs2.getString("type"));
                   System.out.println(rs2.getString("type"));
             }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_pidActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void pidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pidFocusLost
        // TODO add your handling code here:
        
        try
        {
            int x;
            x=Integer.parseInt(pid.getText());
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null,"Wrong Format\nEnter a Number");
            pid.setText("");
        }
        try
        {
                        Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
            
            String query5="SELECT type,name,SP FROM inventory WHERE item_id=?";
             PreparedStatement ps = myConn.prepareStatement(query5);
             ps.setString(1,pid.getText());
             ResultSet rs2=ps.executeQuery();
             if(rs2.next())
             {
                   name.setText(rs2.getString("name"));
                   mrp1=rs2.getInt("SP");
                   System.out.println(mrp1);
                   mrp.setText(rs2.getString("SP"));
                   type.setText(rs2.getString("type"));
             }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_pidFocusLost

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        try
        {
             cust_login f1=new cust_login();
             f1.setVisible(true);
             Class.forName("com.mysql.jdbc.Driver");
             Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");    
             
             String query8="select * from product,link where product.id=link.id and link.bill_id=?";
             PreparedStatement pst8 = myConn.prepareStatement(query8);
             pst8.setInt(1,Trendz.bill_id);
             ResultSet rs8=pst8.executeQuery();
             
             while(rs8.next())
             {
                    String query7="update inventory  set stock=stock+? where item_id=?";
                    PreparedStatement pst5=myConn.prepareStatement(query7);
                    pst5.setInt(1,rs8.getInt("qty"));
                    pst5.setInt(2,rs8.getInt("pid"));
                    pst5.executeUpdate();
                    
                    String query10="delete from product where id=?";
                    PreparedStatement pst10 = myConn.prepareStatement(query10);
                    pst10.setInt(1,rs8.getInt("id"));
                    pst10.executeUpdate();
                    
                    String query11="delete from bill where bill_id=?";
                    PreparedStatement pst11 = myConn.prepareStatement(query11);
                    pst11.setInt(1,Trendz.bill_id);
                    pst11.executeUpdate();
             }
             if(!rs8.next())
             {
                    String query11="delete from bill where bill_id=?";
                    PreparedStatement pst11 = myConn.prepareStatement(query11);
                    pst11.setInt(1,Trendz.bill_id);
                    pst11.executeUpdate();
             }
             dispose();

        } catch(Exception e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(product_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton bill;
    private javax.swing.JLabel id;
    private javax.swing.JTable items;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mrp;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pid;
    private javax.swing.JSpinner qty;
    private javax.swing.JButton submit;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
    String type1;
    int mrp1;
    int ttotal,stk;
}
