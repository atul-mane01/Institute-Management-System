
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SATISH
 */
public class newadmission extends javax.swing.JFrame {

    /**
     * Creates new form newaddmission
     */
    public newadmission() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
         dates d=new dates();
        doa.setText(d.st.format(d.date1));
        doa.disable();
         p1.setBackground(new Color(0,0,0,100));
          p2.setBackground(new Color(0,0,0,100));
          setSize(1650,1080);
         course.setText("Bsc(ECS)");
         course.disable();
          Duartion.setText("3 Years");
           Duartion.disable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        add_no = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        course = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        p2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        select = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fsc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        initf = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Duartion = new javax.swing.JTextField();
        doa = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1167, 635));
        getContentPane().setLayout(null);

        p1.setBorder(javax.swing.BorderFactory.createTitledBorder("New Admssion"));
        p1.setForeground(new java.awt.Color(102, 255, 255));

        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("1 . Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("personal Detail");

        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setText("2. Admission No");

        add_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_noActionPerformed(evt);
            }
        });
        add_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                add_noKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                add_noKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("   3 .Date Of Birth");

        jLabel7.setForeground(new java.awt.Color(102, 255, 255));
        jLabel7.setText("4. Address ");

        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(102, 255, 255));
        jLabel8.setText("5. Phone No ");

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(102, 255, 255));
        jLabel9.setText("6 . E-mail ID ");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(102, 255, 255));
        jLabel10.setText("7 . Qualification ");

        course.setText(" ");
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(51, 51, 51)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_no, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(24, 24, 24)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(add_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        getContentPane().add(p1);
        p1.setBounds(140, 80, 380, 500);

        p2.setBorder(javax.swing.BorderFactory.createTitledBorder("Management Simplified "));
        p2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText(" 8. Cource Detai l");

        select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCS-I", "BCS-II", "BCS-III" }));
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(51, 255, 255));
        jLabel12.setText("9 . Date Of Admission");

        jLabel13.setForeground(new java.awt.Color(51, 255, 255));
        jLabel13.setText("10. Fee Prescribed");

        jLabel16.setForeground(new java.awt.Color(51, 255, 255));
        jLabel16.setText("11 . Initial Fee :");

        initf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initfActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(51, 255, 255));
        jLabel17.setText("12 . Cource Duration ");

        Duartion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuartionActionPerformed(evt);
            }
        });

        doa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17))
                        .addGap(56, 56, 56)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Duartion, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(select, 0, 156, Short.MAX_VALUE)
                            .addComponent(fsc)
                            .addComponent(initf)
                            .addComponent(doa))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(doa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(fsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(initf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Duartion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(p2);
        p2.setBounds(590, 140, 390, 370);

        Submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit.setText("Save");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(360, 620, 109, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(540, 620, 100, 30);

        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(710, 620, 83, 31);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
   name.setText(null);
   add_no.setText(null);
   add.setText(null);
   phone.setText(null);
   email.setText(null);
   fsc.setText(null);
   initf.setText(null);
   Duartion.setText(null);
   dob.setText(null);   
    }//GEN-LAST:event_resetActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                new main_page().setVisible(true);
                dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        connection c=new connection();
          try
          {
              PreparedStatement ps=c.con.prepareStatement("insert into addmission values(?,?,?,?,?,?,?,?,?,?,?,?)");
              ps.setString(1,name.getText());
              ps.setString(2,add_no.getText());
              ps.setString(3,dob.getText());
              ps.setString(4,add.getText());
              ps.setString(5,phone.getText());
              ps.setString(6,email.getText());
              ps.setString(7,course.getText());
              String s;
              s =(String)select.getSelectedItem();
              ps.setString(8,s);
              ps.setString(9,doa.getText());
              ps.setString(10,fsc.getText());
              ps.setString(11,initf.getText());
              ps.setString(12,Duartion.getText());
              ps.executeUpdate();
              JOptionPane.showMessageDialog(null,"Recods Inserted Succcessfully");
           if(select.getSelectedItem().equals("BCS-I"))
          {
              PreparedStatement ps1=c.con.prepareStatement("insert into BCS_I values(?,?,?,?,?)");
              ps1.setString(1,name.getText());
              ps1.setInt(2,Integer.parseInt(add_no.getText()));
              ps1.setString(3,dob.getText());
              ps1.setString(4,add.getText());
              ps1.setInt(5,Integer.parseInt(phone.getText()));
              ps1.executeQuery();
              JOptionPane.showMessageDialog(null,"Recods Inserted Successfully");
          }
          else if(select.getSelectedItem().equals("BCS-II"))
          {
              try
              {
              PreparedStatement ps2=c.con.prepareStatement("insert into BCS_II values(?,?,?,?,?)");
              ps2.setString(1,name.getText());
              ps2.setInt(2,Integer.parseInt(add_no.getText()));
              ps2.setString(3,dob.getText());
              ps2.setString(4,add.getText());
              ps2.setInt(5,Integer.parseInt(phone.getText()));
              ps2.executeUpdate();
              JOptionPane.showMessageDialog(null,"Recods Inserted Successfully");
              }
              catch(HeadlessException | NumberFormatException | SQLException e)
              {
               System.out.println(e);
              }
              }
          else if(select.getSelectedItem().equals("BCS-III"))
          {
              try
              {
            
              PreparedStatement ps3=c.con.prepareStatement("insert into BCS_III values(?,?,?,?,?)");
              ps3.setString(1,name.getText());
              ps3.setInt(2,Integer.parseInt(add_no.getText()));
              ps3.setString(3,dob.getText());
              ps3.setString(4,add.getText());
              ps3.setInt(5,Integer.parseInt(phone.getText()));
              ps3.executeUpdate();
              JOptionPane.showMessageDialog(null,"Recods Inserted Successfully");
              }
              catch(Exception e)
              {
              System.out.println(e);
              }
              }
          }
          
        catch(HeadlessException | NumberFormatException | SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void DuartionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuartionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DuartionActionPerformed

    private void doaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doaActionPerformed

    private void add_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_noActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
        
        if(select.getSelectedItem()=="BCS-I")
        {
        fsc.setText("15000");
        }
       else if(select.getSelectedItem()=="BCS-II")
        {
        fsc.setText("16000");   
        }
       else if(select.getSelectedItem()=="BCS-III")
        {
        fsc.setText("17000");   
        }
    }//GEN-LAST:event_selectActionPerformed

    private void initfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initfActionPerformed
        // TODO add your handling code here:
        //String s=Integer.toString((Integer.parseInt(fsc.getText()))-(Integer.parseInt(initf.getText())));
        //jLabel6.setText(s);
        //System.out.print(s);
    }//GEN-LAST:event_initfActionPerformed

    private void add_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add_noKeyReleased
        // TODO add your handling code here:
        char h=evt.getKeyChar();
        if((!Character.isDigit(h)||h==KeyEvent. VK_BACKSPACE || h==KeyEvent.VK_DELETE))
        {
          evt.consume();
        }
    }//GEN-LAST:event_add_noKeyReleased

    private void add_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add_noKeyTyped
        // TODO add your handling code here:
         char h=evt.getKeyChar();
        if((!Character.isDigit(h)||h==KeyEvent. VK_BACKSPACE || h==KeyEvent.VK_DELETE))
        {
          evt.consume();
        }
    }//GEN-LAST:event_add_noKeyTyped

    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyTyped
        // TODO add your handling code here:
         char h=evt.getKeyChar();
        if((!Character.isDigit(h)||h==KeyEvent. VK_BACKSPACE || h==KeyEvent.VK_DELETE))
        {
          evt.consume();
        }
    }//GEN-LAST:event_phoneKeyTyped

    private void dobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobKeyTyped
        // TODO add your handling code here:
         char h=evt.getKeyChar();
        if((!Character.isDigit(h)||h==KeyEvent. VK_BACKSPACE || h==KeyEvent.VK_DELETE))
        {
          evt.consume();
        }
    }//GEN-LAST:event_dobKeyTyped

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
            java.util.logging.Logger.getLogger(newadmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newadmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newadmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newadmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new newadmission().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Duartion;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField add;
    private javax.swing.JTextField add_no;
    private javax.swing.JTextField course;
    private javax.swing.JTextField doa;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fsc;
    private javax.swing.JTextField initf;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JTextField phone;
    private javax.swing.JButton reset;
    private javax.swing.JComboBox<String> select;
    // End of variables declaration//GEN-END:variables
}
