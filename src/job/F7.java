/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinay
 */
public class F7 extends javax.swing.JFrame {

    /**
     * Creates new form F7
     */
    public F7() {
        initComponents();
    }
    public F7(String user_id) {
     initComponents();
      
    User_id1.setText(user_id);
  }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jobTitle = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        company = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        months = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        job_type1 = new javax.swing.JComboBox<>();
        User_id1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Help us match you with your next job");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(21, 125, 210, 14);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(21, 196, 228, 39);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Rs");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(21, 425, 21, 30);

        salary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryKeyTyped(evt);
            }
        });
        getContentPane().add(salary);
        salary.setBounds(47, 430, 106, 21);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(12, 484, 94, 44);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Job Preferences");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(21, 84, 176, 34);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Desired Job Title");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(21, 152, 149, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Desired Job Type");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(21, 268, 153, 35);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Desired Salary");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(21, 373, 130, 34);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Work Experience");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(346, 22, 194, 34);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Job Title");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(346, 63, 87, 22);

        jobTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobTitleActionPerformed(evt);
            }
        });
        jobTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jobTitleKeyTyped(evt);
            }
        });
        getContentPane().add(jobTitle);
        jobTitle.setBounds(346, 91, 318, 32);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("COMPANY");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(346, 141, 92, 26);

        company.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        company.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                companyKeyTyped(evt);
            }
        });
        getContentPane().add(company);
        company.setBounds(346, 174, 318, 33);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Location");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(346, 225, 77, 22);

        location.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        location.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                locationKeyTyped(evt);
            }
        });
        getContentPane().add(location);
        location.setBounds(346, 253, 318, 38);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Time Period");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(346, 304, 107, 22);

        description.setColumns(20);
        description.setRows(5);
        description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descriptionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(description);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(346, 455, 260, 110);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setText("Save ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(648, 455, 100, 40);

        Update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(0, 51, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update);
        Update.setBounds(769, 455, 120, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Description");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(346, 411, 108, 22);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("per year");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(165, 428, 66, 23);

        months.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        months.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                monthsKeyTyped(evt);
            }
        });
        getContentPane().add(months);
        months.setBounds(346, 358, 155, 35);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("In Month's");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(523, 371, 93, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("User_id");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(12, 22, 66, 44);

        job_type1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        job_type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Time", "Contract", "Part Time", "Temporary" }));
        job_type1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                job_type1ActionPerformed(evt);
            }
        });
        getContentPane().add(job_type1);
        job_type1.setBounds(21, 321, 142, 23);

        User_id1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        User_id1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                User_id1KeyTyped(evt);
            }
        });
        getContentPane().add(User_id1);
        User_id1.setBounds(90, 22, 183, 44);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(124, 484, 94, 44);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(12, 546, 97, 47);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 51, 204));
        jButton8.setText("Reset");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(124, 546, 94, 47);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 0, 0));
        jButton10.setText("NEXT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(240, 660, 103, 35);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\vmall\\Pictures\\Screenshots\\Screenshot (36).png")); // NOI18N
        jPanel3.add(jLabel16);
        jLabel16.setBounds(550, 30, 920, 420);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 204));
        jButton9.setText("Reset");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(780, 520, 104, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(650, 520, 104, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 2040, 1370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jobTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobTitleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
            
           String sql = "insert into job_preferences values(?,?,?,?)";
           
           
           
            PreparedStatement pstmt3 = conn.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Connected");
            
           pstmt3.setString(1,User_id1.getText());
            pstmt3.setString(2,jTextField3.getText());
            
            String job_type;
           job_type = job_type1.getSelectedItem().toString();
           pstmt3.setString(3,job_type);
           
           pstmt3.setString(4,salary.getText());
        
            pstmt3.execute();
          
            
            JOptionPane.showMessageDialog(null,"insertion successfull");
            conn.close();    
     }
      catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
}     
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void job_type1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_job_type1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_job_type1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
            
           String sql = "insert into work_experience values(?,?,?,?,?,?)";
           
           
           
            PreparedStatement pstmt3 = conn.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Connected");
            
           pstmt3.setString(1,User_id1.getText());
            pstmt3.setString(2,jobTitle.getText());
            pstmt3.setString(3,company.getText());
            pstmt3.setString(4,location.getText());
           pstmt3.setString(5,months.getText());
            pstmt3.setString(6,description.getText());
            pstmt3.execute();
          
            
            JOptionPane.showMessageDialog(null,"insertion successfull");
            conn.close();    
     }
      catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
}     
           
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
      String sql="update job_preferences set job_title=?,job_type=?,salary=?  where  user_id=?";
      PreparedStatement pstmt1 = conn.prepareStatement(sql);
      JOptionPane.showMessageDialog(null, "Connected");
     
      
      
         
            pstmt1.setString(1, jTextField3.getText());
            
           String job_type;
           
             
            job_type = job_type1.getSelectedItem().toString();
            
            
             pstmt1.setString(2, job_type);
            pstmt1.setString(3, salary.getText());
           pstmt1.setString(4,User_id1.getText());
           
            User_id1.requestFocusInWindow();
            pstmt1.executeUpdate();
            
           
      
      
      JOptionPane.showMessageDialog(null," JOB_Preferences Records UPdated Succssfully... ");



}
catch(Exception ee){
JOptionPane.showMessageDialog(null," Erro="+ee);
}

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
          try {
                 Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
          String sql1="delete from job_preferences where user_id='"+User_id1.getText()+"'";
          
          
     PreparedStatement pstmt1 = conn.prepareStatement(sql1);
      JOptionPane.showMessageDialog(null, "Connected");
      
      
     
      
           pstmt1.executeUpdate(sql1);
          JOptionPane.showMessageDialog(null," JOB_Preferences Records Deleted Successfully... ");
           
          jTextField3.setText(" ");
         
          salary.setText(" ");
         
       
          User_id1.requestFocusInWindow();
}

catch(Exception ee){
    JOptionPane.showMessageDialog(null,ee);
}

        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          User_id1.setText(" ");
          jTextField3.setText(" ");
         
          salary.setText(" ");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try {
                 Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
          String sql1="delete from work_experience where user_id='"+User_id1.getText()+"'";
          
          
     PreparedStatement pstmt1 = conn.prepareStatement(sql1);
      JOptionPane.showMessageDialog(null, "Connected");
      
      
     
      
           pstmt1.executeUpdate(sql1);
          JOptionPane.showMessageDialog(null," Work_Experience Records Deleted Successfully... ");
           User_id1.setText(" ");
          jobTitle.setText(" ");
         
          company.setText(" ");
         location.setText(" ");
         months.setText("  ");
         description.setText("  ");
       
          User_id1.requestFocusInWindow();
}

catch(Exception ee){
    JOptionPane.showMessageDialog(null,ee);
}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_search","root","");
      String sql="update work_experience set job_title=?,company=?,location=?,time_period=?,description=?  where  user_id=?";
      PreparedStatement pstmt1 = conn.prepareStatement(sql);
      JOptionPane.showMessageDialog(null, "Connected");
     
      
      
          pstmt1.setString(6,User_id1.getText());
            pstmt1.setString(1,jobTitle.getText());
            pstmt1.setString(2,company.getText());
            pstmt1.setString(3,location.getText());
           pstmt1.setString(4,months.getText());
            pstmt1.setString(5,description.getText());
          
         
           
            User_id1.requestFocusInWindow();
            pstmt1.executeUpdate();
            
           
      
      
      JOptionPane.showMessageDialog(null," Work_Experience Records UPdated Succssfully... ");



}
catch(Exception ee){
JOptionPane.showMessageDialog(null," Erro="+ee);
}
    }//GEN-LAST:event_UpdateActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        User_id1.setText(" ");
            jobTitle.setText(" ");
            company.setText(" ");
            location.setText(" ");
           months.setText(" ");
            description.setText(" ");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void User_id1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_User_id1KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(Character.isDigit(c)|| Character.isWhitespace(c) || Character.isISOControl(c))
        {
            
            User_id1.setEditable(true);
        }else{
            getToolkit().beep();
            User_id1.setEditable(false);
        }
    }//GEN-LAST:event_User_id1KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(c) || Character.isISOControl(c))
        {
            
            jTextField3.setEditable(true);
        }else{
            getToolkit().beep();
            jTextField3.setEditable(false);
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void salaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(Character.isDigit(c)|| Character.isWhitespace(c) || Character.isISOControl(c))
        {
            
            salary.setEditable(true);
        }else{
            getToolkit().beep();
            salary.setEditable(false);
        }
    }//GEN-LAST:event_salaryKeyTyped

    private void jobTitleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jobTitleKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(c) || Character.isISOControl(c))
        {
            
            jobTitle.setEditable(true);
        }else{
            getToolkit().beep();
            jobTitle.setEditable(false);
        }
    }//GEN-LAST:event_jobTitleKeyTyped

    private void companyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_companyKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(c) || Character.isISOControl(c))
        {
            
            company.setEditable(true);
        }else{
            getToolkit().beep();
            company.setEditable(false);
        }
    }//GEN-LAST:event_companyKeyTyped

    private void locationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_locationKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(c) || Character.isISOControl(c))
        {
            
            location.setEditable(true);
        }else{
            getToolkit().beep();
            location.setEditable(false);
        }
    }//GEN-LAST:event_locationKeyTyped

    private void monthsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthsKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(Character.isDigit(c)|| Character.isWhitespace(c) || Character.isISOControl(c))
        {
            
            months.setEditable(true);
        }else{
            getToolkit().beep();
            months.setEditable(false);
        }
    }//GEN-LAST:event_monthsKeyTyped

    private void descriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionKeyTyped

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String user_id = User_id1.getText();
        new F8(user_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(F7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JTextField User_id1;
    private javax.swing.JTextField company;
    private javax.swing.JTextArea description;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jobTitle;
    private javax.swing.JComboBox<String> job_type1;
    private javax.swing.JTextField location;
    private javax.swing.JTextField months;
    private javax.swing.JTextField salary;
    // End of variables declaration//GEN-END:variables
}
