package trendz;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class cust_form extends javax.swing.JFrame {
    
    public void kk()
    {
        if(Trendz.flag==0)
        {
           String mystring = Long.toString( Trendz.no);
             
            number.setText(mystring);
            number.setEditable(false);
        
        }
        else
        {
            number.setText("");
            number.setEditable(true);
        }
    }
    public boolean  dd()
    {
         x=datep.getDate();
       
         boolean a=(x==null);
         //z1=x.toString();
         System.out.print(a);
         //System.out.print(datep.getDateFormatString());
         if(a)
         {
             //System.out.println("oh yes");
             JOptionPane.showMessageDialog(null,"Please Enter a date");
             return false;
    }
         else
         {
              SimpleDateFormat Date_Format = new  SimpleDateFormat("yyyy-MM-dd");
              z=Date_Format.format(x);
         return true;
    }}
    
    
    public boolean state_validation()
    {
       
        if(state.getSelectedIndex()==0)
        {
            
              JOptionPane.showMessageDialog(null,"Please select a state"); 
             
             return false;
        }
        return true;
    }
    
    
    public boolean select_validation()
    {
        System.out.print(city.getSelectedItem());
        if(city.getSelectedIndex()==0)
        {
            System.out.print("x");
              JOptionPane.showMessageDialog(null,"Please select a city"); 
             
             return false;
        }
        return true;
    }
    
    public boolean email_validation()
    {
        if(!(Pattern.matches("^[a-zA-Z0-9.]+[@]{1}+[a-zA-Z]+[.]{1}+[a-zA-Z]+$",email.getText())))
        {
             JOptionPane.showMessageDialog(null,"Enter a valid email id"); 
             email.setText("");
             return false;
        }
        return true;
    }
    
    public boolean mobile_validation()
    {
        if(Trendz.flag==1)
        {
          if((x1<7000000000L ||x1>9999999999L))
            {
                   JOptionPane.showMessageDialog(null,"Enter a valid mobile number");  
                   number.setText("");
                   return false;
            } 
        }
          return true;
    }
    
    
    public boolean check()
    {
        if(fname.getText().equals("") || lname.getText().equals("")|| number.getText().equals("")||email.getText().equals("")||locality.getText().equals(""))
        { 
            JOptionPane.showMessageDialog(null,"NO FIELD CANT BE LEFT EMPTY"); 
             return false;
        }
          
        else
        {
           
             return true;
        }
           
    }
    public cust_form() {
               this.setUndecorated(false);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
       
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        
        this.setSize(x,y);
        kk();
       // id.setText(Trendz.temp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ins_btn = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        city = new javax.swing.JComboBox<>();
        state = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        locality = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        datep = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ins_btn.setText("Sign In");
        ins_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ins_btnActionPerformed(evt);
            }
        });
        getContentPane().add(ins_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, 130, 64));

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 710, 122, 64));

        jLabel9.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("CITY :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 90, -1));

        city.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html><font color=\"gray\">--Select item--</font></html>", "Pune", "Mumbai", "Ahemdabad", "Banglore", "Chennai" }));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 520, 226, 47));

        state.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html><font color=\"gray\">--Select item--</font></html>", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Maharashtra" }));
        state.setEnabled(isEnabled());
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });
        getContentPane().add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 340, 43));

        jLabel6.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("STATE :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 100, 39));

        jLabel8.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("LOCALITY :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 150, -1));

        locality.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        locality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localityActionPerformed(evt);
            }
        });
        getContentPane().add(locality, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 340, 61));

        email.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 340, 46));

        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("EMAIL-ID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 140, -1));

        datep.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        getContentPane().add(datep, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 400, 288, 53));

        jLabel7.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("BIRTHDATE :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, 180, 40));

        jLabel5.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("LAST NAME :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        lname.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lnameFocusLost(evt);
            }
        });
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnameKeyReleased(evt);
            }
        });
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 340, 55));

        number.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numberFocusLost(evt);
            }
        });
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberKeyReleased(evt);
            }
        });
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(1133, 300, 230, 50));

        jLabel10.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("MOBILE NO :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, -1, -1));

        fname.setBackground(java.awt.Color.white);
        fname.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameFocusLost(evt);
            }
        });
        fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fnameMouseExited(evt);
            }
        });
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
        });
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 340, 40));

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("FIRST NAME :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 180, 30));

        buttonGroup1.add(female);
        female.setForeground(java.awt.Color.black);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 190, -1, -1));

        buttonGroup1.add(other);
        other.setForeground(java.awt.Color.black);
        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });
        getContentPane().add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 190, -1, -1));

        buttonGroup1.add(male);
        male.setForeground(java.awt.Color.black);
        male.setSelected(true);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 190, 80, 30));

        jLabel4.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("GENDER :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, -1, -1));

        back.setBackground(java.awt.Color.white);
        back.setForeground(java.awt.Color.black);
        back.setText("<<  BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 50));

        jLabel2.setFont(new java.awt.Font("Samanata", 1, 48)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("CUSTOMER DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 610, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trendz/red-cube-wallpaper-PIC-XFC019521_4_2200x1200.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -23, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ins_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ins_btnActionPerformed

       // dd();
        if(check()&&mobile_validation()&&email_validation()&& select_validation()&& state_validation()&&dd())
        {
           
        try{
             //System.out.print("hello"+Trendz.no);
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trendz","root","jordan23");
            String query = "insert into customer(fname,lname,gender,number,email,locality,city,state,birthdate,admin_id) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = myConn.prepareStatement(query);
               //pst.setInt(1,fname.getText());
                   
                    pst.setString(1,fname.getText());
                    pst.setString(2,lname.getText());
                    pst.setString(3,gender);
                    
                    pst.setString(4,number.getText());
                   
                    pst.setString(5,email.getText());
                    pst.setString(6,locality.getText());
                    pst.setString(7,city1);
                    pst.setString(8,state_selected);
                    pst.setString(9,z);
                    pst.setInt(10,Trendz.admin_id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Inserted Successfully");
                    
            /*String query2="select cust_id from customer where number=?";
            PreparedStatement pst2=myConn.prepareStatement(query2);
            long x=Long.parseLong(number.getText());
                    pst2.setLong(1,x);
                    ResultSet rs=pst2.executeQuery();
                    if(rs.next())
                     {
                         Trendz.cid=rs.getInt("cust_id");
                         System.out.print("yo"+Trendz.cid);
                     }
                      else
                    {
                          System.out.print("yo"+Trendz.cid);
                          System.out.print(x);
                    }*/
 
                   
                    product_form p1 = new product_form();
                    p1.setVisible(true);
                     dispose();
                    
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }

    }//GEN-LAST:event_ins_btnActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
                    gender="Male";
                    
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
         gender="Female";
    }//GEN-LAST:event_femaleActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
          gender="LGBT";
        // TODO add your handling code here:
    }//GEN-LAST:event_otherActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        state_selected=state.getSelectedItem().toString();
    }//GEN-LAST:event_stateActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        fname.setText("");
        lname.setText("");
        email.setText("");
        locality.setText("");
        number.setText("");
        buttonGroup1.clearSelection();
        state.setSelectedIndex(0);
        city.setSelectedIndex(0);
    }//GEN-LAST:event_resetActionPerformed

    private void localityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localityActionPerformed
        // TODO add your handling code here: 
        if(locality.getText().equals(""))
            {  
                 JOptionPane.showMessageDialog(null,"Name cannot be left null");
            }  
        
    }//GEN-LAST:event_localityActionPerformed

    private void numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyReleased
        if(Trendz.flag==1)
        {
        try
         {
             x1=Long.parseLong(number.getText());
         } 
         catch(NumberFormatException nfe)
         {
             JOptionPane.showMessageDialog(null,"Wrong Format.Enter a Number");
             number.setText("");       
         }
        }
    }//GEN-LAST:event_numberKeyReleased

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyReleased
       
    }//GEN-LAST:event_fnameKeyReleased

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
            
    }//GEN-LAST:event_emailFocusLost

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
            city1=(String)city.getSelectedItem();
    }//GEN-LAST:event_cityActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
                        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void numberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberFocusLost
        // TODO add your handling code here:

        
    }//GEN-LAST:event_numberFocusLost

    private void fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusLost

    }//GEN-LAST:event_fnameFocusLost

    private void fnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameMouseExited

    private void lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameKeyReleased

    private void lnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameFocusLost

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
                  cust_login form1= new cust_login();
                   form1.setVisible(true);
                   dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cust_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cust_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cust_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cust_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cust_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> city;
    private com.toedter.calendar.JDateChooser datep;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JButton ins_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField locality;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField number;
    private javax.swing.JRadioButton other;
    private javax.swing.JButton reset;
    private javax.swing.JComboBox<String> state;
    // End of variables declaration//GEN-END:variables
private String gender;
private String state_selected;
private String city1;
public long x1;
String z;
Date x;
String z1;
}
