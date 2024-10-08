/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shanaka Rajapakshe
 */
public class HRAssistant extends javax.swing.JFrame {

    /**
     * Creates new form HR
     */
    public HRAssistant() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtepfNo = new javax.swing.JTextField();
        cmbOption = new javax.swing.JComboBox();
        btnsearchemployee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Enter ");

        txtepfNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        cmbOption.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EID", "Department", "Designation", "Name" }));

        btnsearchemployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsearchemployee.setText("Search");
        btnsearchemployee.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnsearchemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchemployeeActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp Name", "DOB", "Address", "EPF", "Contact Number", "Department", "Designation"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(jLabel8)
                            .addGap(35, 35, 35)
                            .addComponent(txtepfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(cmbOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(btnsearchemployee))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtepfNo)
                        .addComponent(cmbOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsearchemployee)))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Search Employee", jPanel5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTabbedPane3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchemployeeActionPerformed

        // Get the table model and remove all rows
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0); // This removes all rows

        String text = txtepfNo.getText();
        String option = cmbOption.getSelectedItem().toString();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields Could not be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            File file = new File("Employee.txt");
            FileReader reader;
            try {
                reader = new FileReader(file);
                BufferedReader buffer = new BufferedReader(reader);
                String line = null;
                String[] arr = null;
                switch (option) {
                    case "EID":
                        while ((line = buffer.readLine()) != null) {
                            arr = line.split(",");
                            if (arr.length >= 6 && arr[3].equals(text)) {
                                Object[] row = {arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]};
                                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                                model.addRow(row);
                                continue;
                            }
                        }
                        break;
                    case "Department":
                        while ((line = buffer.readLine()) != null) {
                            arr = line.split(",");
                            if (arr.length >= 6 && arr[5].equals(text)) {
                                Object[] row = {arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]};
                                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                                model.addRow(row);
                                continue;
                            }
                        }
                        break;
                    case "Designation":
                        while ((line = buffer.readLine()) != null) {
                            arr = line.split(",");
                            if (arr.length >= 6 && arr[6].equals(text)) {
                                Object[] row = {arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]};
                                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                                model.addRow(row);
                                continue;
                            }
                        }
                        break;
                    case "Name":
                        while ((line = buffer.readLine()) != null) {
                            arr = line.split(",");
                            if (arr.length >= 6 && arr[0].equals(text)) {
                                Object[] row = {arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]};
                                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                                model.addRow(row);
                                continue;
                            }
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "invalid data", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(HR.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(HR.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnsearchemployeeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginForm ob = new LoginForm();
        ob.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearchemployee;
    private javax.swing.JComboBox cmbOption;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtepfNo;
    // End of variables declaration//GEN-END:variables
}
