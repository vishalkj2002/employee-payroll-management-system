/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee.payroll;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author vishal
 */
public class Allowance extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form Allowance
     */
    public Allowance() {
        initComponents(); // Only call once
        conn = db.java_db();

        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed.");
        }

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        Update_table();
        lbl_empName.setText(String.valueOf(Emp.empName));
    }
    
    private void Update_table() {
        try {
            String sql = "SELECT * FROM allowance";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_allowance.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
            } catch (Exception e) {
                e.printStackTrace();  // Better error handling in finally block
            }
        }
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
        jLabel2 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_basicsalary = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_department = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_allowance = new javax.swing.JTable();
        txt_overtime = new javax.swing.JTextField();
        txt_medical = new javax.swing.JTextField();
        txt_bonus = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_other = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_totalot = new javax.swing.JTextField();
        txt_rph = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        lbl_empName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 48)); // NOI18N
        jLabel1.setText("Allowance");

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel2.setText("Employee ID:");

        txt_search.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel3.setText("Employee ID:");

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel4.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel5.setText("Surname:");

        jLabel6.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel6.setText("Date of Birth:");

        jLabel7.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel7.setText("Basic Salary:");

        jLabel8.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel8.setText("Department:");

        txt_basicsalary.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N

        txt_id.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N

        txt_firstname.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });

        txt_department.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N

        txt_surname.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N

        txt_dob.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N

        table_allowance.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_allowance);

        txt_overtime.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        txt_overtime.setText("0");
        txt_overtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_overtimeActionPerformed(evt);
            }
        });

        txt_medical.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        txt_medical.setText("0");
        txt_medical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_medicalActionPerformed(evt);
            }
        });

        txt_bonus.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        txt_bonus.setText("0");
        txt_bonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bonusActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel9.setText("Overtime:");

        txt_other.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        txt_other.setText("0");

        jLabel10.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel10.setText("Medical:");

        jLabel11.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel11.setText("Bonus:");

        jLabel12.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel12.setText("Other:");

        jLabel13.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel13.setText("Total Overtime:");

        jLabel14.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel14.setText("Rate per Hour:");

        txt_totalot.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        txt_totalot.setText("0");

        txt_rph.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        txt_rph.setText("0");
        txt_rph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rphActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jLabel15.setText("Total Amount:");

        lbl_total.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lbl_total.setText("0.00");

        jButton1.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel17.setText("Logged In As:");

        lbl_empName.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(622, 622, 622))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_empName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_surname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_department)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(txt_basicsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_medical)
                                    .addComponent(txt_overtime)
                                    .addComponent(txt_bonus)
                                    .addComponent(txt_other, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_total)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_rph)
                                    .addComponent(txt_totalot, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(txt_basicsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_overtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_medical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_bonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_other, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(lbl_total)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_totalot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_rph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lbl_empName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_medicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_medicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_medicalActionPerformed

    private void txt_rphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rphActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rphActionPerformed

    private void txt_overtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_overtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_overtimeActionPerformed

    private void txt_bonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bonusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            int value = Emp.empId;
            String value1 = txt_basicsalary.getText();
            String value2 = txt_bonus.getText();
            String value3 = txt_medical.getText();
            String value4 = txt_other.getText();
            String value5 = txt_rph.getText();
            String value6 = txt_totalot.getText();
            String value7 = lbl_total.getText();
            String value8 = txt_id.getText();
            String value9 = txt_firstname.getText();
            String value10 = txt_surname.getText();
            
            String sql = "INSERT INTO allowance (created_by, emp_id, overtime, medical, bonus, other, salary, rate, total_allowance, firstname, surname) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            pst = conn.prepareStatement(sql);
            
            pst.setInt(1, value);                  // created_by
            pst.setString(2, value8);              // emp_id
            pst.setString(3, value6);              // overtime
            pst.setString(4, value3);              // medical
            pst.setString(5, value2);              // bonus
            pst.setString(6, value4);              // other
            pst.setString(7, value1);              // salary
            pst.setString(8, value5);              // rate
            pst.setString(9, value7);              // total_allowance
            pst.setString(10, value9);             // firstname
            pst.setString(11, value10);            // surname
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Allowance added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch(Exception e) {
                
            }
        }
        Update_table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                // Clear previous data
                clearFields();

                // Query to fetch the data
                String sql = "SELECT * FROM staff_information WHERE id=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_search.getText());
                
                rs = pst.executeQuery();

                // If data is found, set the fields
                if (rs.next()) {
                    txt_id.setText(rs.getString("id"));
                    txt_firstname.setText(rs.getString("first_name"));
                    txt_surname.setText(rs.getString("surname"));
                    txt_dob.setText(rs.getString("Dob"));
                    txt_department.setText(rs.getString("Department"));
                    txt_basicsalary.setText(rs.getString("Salary"));
                } else {
                    // Handle no data found case
                    JOptionPane.showMessageDialog(null, "No record found with the given ID.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            } finally {
                try {
                    rs.close();
                    pst.close();
                } catch (Exception e) {
                    // Log or handle any exceptions here
                }
            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int salary = Integer.parseInt(txt_basicsalary.getText());
        int overtime = Integer.parseInt(txt_overtime.getText());
        
        double eight = 8;
        double days = 25;
        double dbop = 0;
        double overtimeRate = 1.5;
        
        double Total_Overtime = overtime * overtimeRate;
        String x = String.valueOf(Total_Overtime);
        txt_totalot.setText(x);
        
        dbop = salary / days / eight;
        String s = String.valueOf(dbop);
        txt_rph.setText(s);
        
        int med = Integer.parseInt(txt_medical.getText());
        int bonus = Integer.parseInt(txt_bonus.getText());
        int other = Integer.parseInt(txt_other.getText());
        int f = med + bonus + other;
        double calc = Total_Overtime * dbop + f;
        String c = String.valueOf(calc);
        lbl_total.setText(c);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txt_id.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_basicsalary.setText("");
        txt_dob.setText("");
        txt_department.setText("");
        txt_medical.setText("0");
        txt_bonus.setText("0");
        txt_other.setText("0");
        txt_totalot.setText("0");
        txt_rph.setText("0");
        txt_overtime.setText("0");
        lbl_total.setText("0.00");
        txt_search.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Allowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Allowance().setVisible(true);
            }
        });
    }
    
    private void clearFields() {
        txt_id.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_dob.setText("");
        txt_department.setText("");
        txt_basicsalary.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_empName;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JTable table_allowance;
    private javax.swing.JTextField txt_basicsalary;
    private javax.swing.JTextField txt_bonus;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_medical;
    private javax.swing.JTextField txt_other;
    private javax.swing.JTextField txt_overtime;
    private javax.swing.JTextField txt_rph;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_totalot;
    // End of variables declaration//GEN-END:variables
}
