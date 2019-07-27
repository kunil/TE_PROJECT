
package trendz;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.Pattern;
import net.proteanit.sql.DbUtils;

public class item_form extends javax.swing.JFrame {
    
    public item_form() {
        this.setUndecorated(false);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        
        this.setSize(x,y);
        fetch();
        
    }
public void fetch()
{
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
        String q="select * from inventory";
        PreparedStatement pst3=myConn.prepareStatement(q);
        ResultSet rs=pst3.executeQuery();
        
        items.setModel(DbUtils.resultSetToTableModel(rs));
        
    }
      catch(Exception e){
            e.printStackTrace();
        }
}
public void reset()
{
    item_id.setText("");
    type.setSelectedIndex(0);
    name.setText("");
    price.setText("");
    jSpinner1.setValue(1);
    sp.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        item_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        admin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        items = new javax.swing.JTable();
        sp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 0, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Item ID : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, -1, -1));

        item_id.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        item_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                item_idFocusLost(evt);
            }
        });
        item_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_idActionPerformed(evt);
            }
        });
        item_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                item_idKeyReleased(evt);
            }
        });
        getContentPane().add(item_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 180, 40));

        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 0, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        type.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Item--", "Sofa Set", "Bedroom Set", "Wadrobes", "Dining Set", "Artefacts", " " }));
        type.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 220, 40));

        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 0, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Item Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        name.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 147, 50));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("Bought For");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

        price.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 147, 40));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("Stock");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, -1, -1));

        submit.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        submit.setForeground(java.awt.Color.black);
        submit.setText("Add item");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 870, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 70)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Item Entry ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 440, 70));

        jSpinner1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 700, -1, -1));

        admin.setBackground(java.awt.Color.black);
        admin.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        admin.setForeground(java.awt.Color.black);
        admin.setText("<<Back");
        admin.setBorderPainted(false);
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 60));

        jScrollPane1.setAutoscrolls(true);

        items.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
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
        items.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jScrollPane1.setViewportView(items);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 730, 200));

        sp.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getContentPane().add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 150, 40));

        jLabel7.setFont(new java.awt.Font("Abyssinica SIL", 0, 36)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Selling For");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/jordan/Downloads/item2.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setPreferredSize(new java.awt.Dimension(1973, 1100));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -143, -1, 1340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_idActionPerformed

         try
        {
            int x;
            x=Integer.parseInt(item_id.getText());
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null,"Wrong Format\nEnter a Number");
            item_id.setText("");
        }
        try
        {
                        Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
            
            String query5="SELECT type,name,CP FROM inventory,product WHERE item_id=?";
             PreparedStatement ps = myConn.prepareStatement(query5);
             ps.setString(1,item_id.getText());
             ResultSet rs2=ps.executeQuery();
             if(rs2.next())
             {
                   name.setText(rs2.getString("name"));
                   price.setText(rs2.getString("CP"));
                   type.setSelectedItem(rs2.getString("type"));
             }
             
             else
             {
                  JOptionPane.showMessageDialog(null,"New Product\nPlease Enter the details below"); 
             }
             
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_item_idActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23"); 
            String query1="select stock from inventory where item_id=?";
            PreparedStatement pst1 = myConn.prepareStatement(query1);
            pst1.setString(1,item_id.getText());
            ResultSet rs=pst1.executeQuery();
            if(rs.next())
            {
                int y=rs.getInt("stock");
                String query2="update inventory set stock=?,SP=? where item_id=?";
                PreparedStatement pst2=myConn.prepareStatement(query2);
                int result=y+(int)jSpinner1.getValue();
                pst2.setInt(1,result);
                pst2.setString(2,sp.getText());
                pst2.setString(3,item_id.getText());
                pst2.executeUpdate();
                JOptionPane.showMessageDialog(null,"Updated succesfully");
            }
            else
            {
                    String query = "insert into inventory values(?,?,?,?,?,?,?)";
                    PreparedStatement pst = myConn.prepareStatement(query);
                    pst.setString(1,item_id.getText());
                    pst.setString(2,types);
                    pst.setString(3,name.getText());
                    pst.setString(4,price.getText());
                    pst.setString(5,sp.getText());  
                    pst.setInt(6,(int)jSpinner1.getValue());
                    pst.setInt(7,Trendz.admin_id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Inserted Successfully"); 
            }
            fetch();
            reset();
    }//GEN-LAST:event_submitActionPerformed
        catch(Exception e){
            e.printStackTrace();
            dispose();
        }
    }
       
    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
         types=type.getSelectedItem().toString();
    }//GEN-LAST:event_typeActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void item_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_item_idKeyReleased
         try
         {
             int x;
             x=Integer.parseInt(item_id.getText());
         } 
         catch(NumberFormatException nfe)
         {
             JOptionPane.showMessageDialog(null,"Wrong Format.Enter a Number");
             item_id.setText("");
             
         }
    }//GEN-LAST:event_item_idKeyReleased

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
         try
         {
             float x;
             x=Float.parseFloat(price.getText());
         } 
         catch(NumberFormatException nfe)
         {
             JOptionPane.showMessageDialog(null,"Wrong Format.\nEnter a Number");
             price.setText("");
             
         }
    }//GEN-LAST:event_priceKeyReleased

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        NewJFrame form=new NewJFrame();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_adminActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        // TODO add your handling code here:
         if(!(Pattern.matches("^[a-zA-Z_ ]+$", name.getText())))
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid name");
        }
    }//GEN-LAST:event_nameKeyReleased

    private void item_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_item_idFocusLost
        // TODO add your handling code here:
        
        try
        {
            int x;
            x=Integer.parseInt(item_id.getText());
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null,"Wrong Format\nEnter a Number");
            item_id.setText("");
        }
        try
        {
                        Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
            
            String query5="SELECT type,name,CP FROM inventory,product WHERE item_id=?";
             PreparedStatement ps = myConn.prepareStatement(query5);
             ps.setString(1,item_id.getText());
             ResultSet rs2=ps.executeQuery();
             if(rs2.next())
             {
                   name.setText(rs2.getString("name"));
                   price.setText(rs2.getString("CP"));
                   type.setSelectedItem(rs2.getString("type"));
             }
             
             else
             {
                   JOptionPane.showMessageDialog(null,"New Product\nPlease Enter the details below"); 
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
                    
    }//GEN-LAST:event_item_idFocusLost

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
            java.util.logging.Logger.getLogger(item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new item_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JTextField item_id;
    private javax.swing.JTable items;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField sp;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables

private  String types;
}
