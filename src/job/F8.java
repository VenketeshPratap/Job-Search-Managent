/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package job;

import job.NewJFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import com.sun.jndi.ldap.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinay
 */
public class F8 extends javax.swing.JFrame {
java.sql.Connection cn = null;
    ResultSet rs = null;
    Statement st;
    
    
    /**
     * Creates new form F8
     */
    public F8() {
        initComponents();
           
     
           
     }

 public F8(String user_id) {
     initComponents();
    
   User_id1.setText(user_id);
  }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        User_id1 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        Title1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        description1 = new javax.swing.JTextArea();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        onlineprofile = new javax.swing.JTextField();
        Experience = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        skills = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 51));
        getContentPane().setLayout(null);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1490, 160, 160, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 255));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1490, 330, 180, 60);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setText("User_id");
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(870, 0, 180, 50);

        User_id1.setMinimumSize(null);
        getContentPane().add(User_id1);
        User_id1.setBounds(1070, 10, 242, 40);

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 255));
        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(1490, 230, 160, 50);

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 255));
        jButton14.setText("Reset");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(1490, 410, 190, 60);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Online Profile");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 490, 280, 80);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Link Address");
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 580, 88, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Facebook or Linkedin profiles");
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(70, 650, 278, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("eg:Address of your blog,Personnel Homepage,");
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 620, 321, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Awards/Achievements");
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1180, 500, 290, 40);

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 51, 51));
        jButton17.setText("NEXT");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(1670, 510, 180, 90);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Certifications");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1180, 110, 180, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Title");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1230, 160, 130, 40);

        title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title.setMinimumSize(null);
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        jPanel1.add(title);
        title.setBounds(1260, 230, 204, 34);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Description");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1230, 310, 136, 31);

        jScrollPane1.setMinimumSize(null);

        description.setColumns(20);
        description.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(1260, 370, 218, 91);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Title");
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1220, 570, 100, 29);

        Title1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Title1.setMinimumSize(null);
        jPanel1.add(Title1);
        Title1.setBounds(1260, 620, 204, 31);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 255));
        jButton7.setText("Save");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(1510, 620, 120, 60);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(1520, 760, 120, 50);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Date Awarded");
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1210, 700, 168, 30);

        Date.setDateFormatString("yyyy-MM-dd");
        Date.setMinimumSize(null);
        jPanel1.add(Date);
        Date.setBounds(1270, 760, 200, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Description");
        jLabel15.setOpaque(true);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1210, 810, 160, 50);

        jScrollPane2.setMinimumSize(null);

        description1.setColumns(20);
        description1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        description1.setRows(5);
        jScrollPane2.setViewportView(description1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(1230, 870, 200, 90);

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 255));
        jButton15.setText("Update");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(1510, 850, 140, 50);

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 51, 255));
        jButton16.setText("Reset");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(1510, 930, 140, 60);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 255));
        jButton12.setText("Reset");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(650, 750, 140, 37);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 204));
        jButton11.setText("Update");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(430, 740, 160, 37);

        onlineprofile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        onlineprofile.setMinimumSize(null);
        jPanel1.add(onlineprofile);
        onlineprofile.setBounds(80, 690, 268, 32);

        Experience.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Experience.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Less than 1 year", "1 years", "2 years", "3 years", "4 years", "4+ years", " " }));
        Experience.setMinimumSize(null);
        jPanel1.add(Experience);
        Experience.setBounds(510, 190, 220, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Skills");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 100, 100, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Skill");
        jLabel2.setMinimumSize(null);
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 170, 35, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("eg:Microsoft Office,Java,Tally,Python");
        jLabel3.setToolTipText("");
        jLabel3.setMinimumSize(null);
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 210, 227, 15);

        skills.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        skills.setMinimumSize(null);
        jPanel1.add(skills);
        skills.setBounds(60, 240, 227, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 310, 150, 37);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 310, 150, 37);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 51, 255));
        jButton9.setText("Update");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(410, 400, 150, 37);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 255));
        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(650, 400, 150, 37);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Experience");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(450, 100, 220, 60);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(440, 660, 160, 37);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 255));
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(650, 660, 140, 37);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 2610, 1480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_titleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
            
           String sql = "insert into Skills values(?,?,?)";
           
           
           
            PreparedStatement pstmt3 = conn.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Connected");
            
           pstmt3.setString(1,User_id1.getText());
            pstmt3.setString(2,skills.getText());
            
            String experience;
             
            experience = Experience.getSelectedItem().toString();
            pstmt3.setString(3, experience);
            pstmt3.execute();
          
            
            JOptionPane.showMessageDialog(null,"insertion successfull");
            conn.close();    
     }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
}     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
            
           String sql = "insert into onlineprofile values(?,?)";
           
           
           
            PreparedStatement pstmt3 = conn.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Connected");
            
           pstmt3.setString(1,User_id1.getText());
            pstmt3.setString(2,onlineprofile.getText());
            pstmt3.execute(); 
            
               JOptionPane.showMessageDialog(null,"insertion successfull");
            conn.close();    
     }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
}     
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
            
           String sql = "insert into certifications values(?,?,?)";
           
           
           
            PreparedStatement pstmt3 = conn.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Connected");
            
           pstmt3.setString(1,User_id1.getText());
            pstmt3.setString(2,title.getText());
            pstmt3.setString(3,description.getText());
            pstmt3.execute();
            
               JOptionPane.showMessageDialog(null,"insertion successfull");
            conn.close();    
     }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
}     
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
            
           String sql = "insert into awards values(?,?,?,?)";
           
           
           
            PreparedStatement pstmt3 = conn.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Connected");
            
           pstmt3.setString(1,User_id1.getText());
            pstmt3.setString(2,Title1.getText());
            pstmt3.setString(3,((JTextField)Date.getDateEditor().getUiComponent()).getText());
            pstmt3.setString(4,description1.getText());
            pstmt3.execute(); 
            
               JOptionPane.showMessageDialog(null,"insertion successfull");
            conn.close();    
     }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
}     
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           try {
                 Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
          String sql1="delete from skills where user_id='"+User_id1.getText()+"'";
          
          
     PreparedStatement pstmt1 = conn.prepareStatement(sql1);
      JOptionPane.showMessageDialog(null, "Connected");
      
      
     
      
           pstmt1.executeUpdate(sql1);
          JOptionPane.showMessageDialog(null," SKILLS Records Deleted Successfully... ");
           User_id1.setText(" ");
          skills.setText(" ");
         
        
         
       
          User_id1.requestFocusInWindow();
}

catch(Exception ee){
    JOptionPane.showMessageDialog(null,ee);
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
      String sql="update skills set skills=?,Experience=?  where  user_id=?";
      PreparedStatement pstmt1 = conn.prepareStatement(sql);
      JOptionPane.showMessageDialog(null, "Connected");
     
      
      
          pstmt1.setString(3,User_id1.getText());
          pstmt1.setString(1,skills.getText());
          String experience;
           
             
            experience = Experience.getSelectedItem().toString();
          pstmt1.setString(2,experience);
            
          
         
           
            User_id1.requestFocusInWindow();
            pstmt1.executeUpdate();
            
           
      
      
      JOptionPane.showMessageDialog(null," SKILLS Records UPdated Succssfully... ");



}
catch(Exception ee){
JOptionPane.showMessageDialog(null," Erro="+ee);
}
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
             try {
                 Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
          String sql1="delete from onlineprofile where user_id='"+User_id1.getText()+"'";
          
          
     PreparedStatement pstmt1 = conn.prepareStatement(sql1);
      JOptionPane.showMessageDialog(null, "Connected");
      
      
     
      
           pstmt1.executeUpdate(sql1);
          JOptionPane.showMessageDialog(null," ONLINE PROFILE Records Deleted Successfully... ");
           User_id1.setText(" ");
         onlineprofile.setText(" ");
         
        
         
       
          User_id1.requestFocusInWindow();
}

catch(Exception ee){
    JOptionPane.showMessageDialog(null,ee);
}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        skills.setText(" ");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
      String sql="update onlineprofile set profilenames=?  where  user_id=?";
      PreparedStatement pstmt1 = conn.prepareStatement(sql);
      JOptionPane.showMessageDialog(null, "Connected");
     
      
      
          pstmt1.setString(2,User_id1.getText());
          pstmt1.setString(1,onlineprofile.getText());
        
            
          
         
           
            User_id1.requestFocusInWindow();
            pstmt1.executeUpdate();
            
           
      
      
      JOptionPane.showMessageDialog(null," ONLINE PROFILE Records UPdated Succssfully... ");



}
catch(Exception ee){
JOptionPane.showMessageDialog(null," Erro="+ee);
}
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        onlineprofile.setText(" ");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
      String sql="update certifications set title=?,description=?  where  user_id=?";
      PreparedStatement pstmt1 = conn.prepareStatement(sql);
      JOptionPane.showMessageDialog(null, "Connected");
     
      
      
          pstmt1.setString(3,User_id1.getText());
          pstmt1.setString(1,title.getText());
       
          pstmt1.setString(2,description.getText());
            
          
         
           
            User_id1.requestFocusInWindow();
            pstmt1.executeUpdate();
            
           
      
      
      JOptionPane.showMessageDialog(null," Certification Records UPdated Succssfully... ");



}
catch(Exception ee){
JOptionPane.showMessageDialog(null," Erro="+ee);
}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
          try {
                 Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
          String sql1="delete from certifications where user_id='"+User_id1.getText()+"'";
          
          
     PreparedStatement pstmt1 = conn.prepareStatement(sql1);
      JOptionPane.showMessageDialog(null, "Connected");
      
      
     
      
           pstmt1.executeUpdate(sql1);
          JOptionPane.showMessageDialog(null," Certifications Records Deleted Successfully... ");
           User_id1.setText(" ");
         title.setText(" ");
         description.setText(" ");
         
        
         
       
          User_id1.requestFocusInWindow();
}

catch(Exception ee){
    JOptionPane.showMessageDialog(null,ee);
}
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         try {
                 Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
          String sql1="delete from awards where user_id='"+User_id1.getText()+"'";
          
          
     PreparedStatement pstmt1 = conn.prepareStatement(sql1);
      JOptionPane.showMessageDialog(null, "Connected");
      
      
     
      
           pstmt1.executeUpdate(sql1);
          JOptionPane.showMessageDialog(null," AWARDS Records Deleted Successfully... ");
           User_id1.setText(" ");
         Title1.setText(" ");
         description1.setText(" ");
         
        
         
       
          User_id1.requestFocusInWindow();
}

catch(Exception ee){
    JOptionPane.showMessageDialog(null,ee);
}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
             try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
      String sql="update awards set award_name=?,date_awarded=?,description=?  where  user_id=?";
      PreparedStatement pstmt1 = conn.prepareStatement(sql);
      JOptionPane.showMessageDialog(null, "Connected");
     
      
      
          pstmt1.setString(4,User_id1.getText());
          pstmt1.setString(1,Title1.getText());
        pstmt1.setString(2,((JTextField)Date.getDateEditor().getUiComponent()).getText());
          pstmt1.setString(3,description1.getText());
            
          
         
           
            User_id1.requestFocusInWindow();
            pstmt1.executeUpdate();
            
           
      
      
      JOptionPane.showMessageDialog(null," AWARDS Records UPdated Succssfully... ");



}
catch(Exception ee){
JOptionPane.showMessageDialog(null," Erro="+ee);
}
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        Title1.setText(" ");
        description1.setText(" ");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        title.setText(" ");
        description.setText(" ");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        String user_id = User_id1.getText();
        new NewJFrame3(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton17ActionPerformed

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
            java.util.logging.Logger.getLogger(F8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JComboBox<String> Experience;
    private javax.swing.JTextField Title1;
    private javax.swing.JTextField User_id1;
    private javax.swing.JTextArea description;
    private javax.swing.JTextArea description1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField onlineprofile;
    private javax.swing.JTextField skills;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
