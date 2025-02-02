/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import Login.Login;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amosp
 */
public class Hospital extends javax.swing.JFrame {
private JFrame frame;
    /**
     * Creates new form Hospital
     */
    public Hospital() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtPrescription = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnGP = new javax.swing.JButton();
        btnPrescription = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbxnametablets = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtfDose = new javax.swing.JTextField();
        txtRefNo = new javax.swing.JTextField();
        txtfLOT = new javax.swing.JTextField();
        txtfIssueDate = new javax.swing.JTextField();
        txtfExpDate = new javax.swing.JTextField();
        txtfSideEffects = new javax.swing.JTextField();
        txtfDailyDose = new javax.swing.JTextField();
        txtfInfo = new javax.swing.JTextField();
        txtfStorage = new javax.swing.JTextField();
        txtfMachines = new javax.swing.JTextField();
        txtfHowTo = new javax.swing.JTextField();
        txtfPatientID = new javax.swing.JTextField();
        txtfNHS = new javax.swing.JTextField();
        txtfPatientName = new javax.swing.JTextField();
        txtfPatientAddress = new javax.swing.JTextField();
        txtfDateOfBirth = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtfNumberTablets = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setPreferredSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hospital Management System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1160, 60));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtPrescription.setColumns(20);
        jtxtPrescription.setRows(5);
        jScrollPane1.setViewportView(jtxtPrescription);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 430));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 400, 440));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Prescription");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 750, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 770, 50));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 100, 30));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });
        jPanel4.add(btnDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 100, 30));

        btnGP.setText("GP Appointment");
        btnGP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGPActionPerformed(evt);
            }
        });
        jPanel4.add(btnGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 150, 30));

        btnPrescription.setText("Prescription");
        btnPrescription.setToolTipText("");
        btnPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescriptionActionPerformed(evt);
            }
        });
        jPanel4.add(btnPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 130, 30));

        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });
        jPanel4.add(btnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 100, 30));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel4.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 90, 30));

        btnExit.setText("Exit");
        btnExit.setToolTipText("");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel4.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 130, 30));

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel4.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 120, 30));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 130, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 1160, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Reference No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        cmbxnametablets.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbxnametablets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Make a Selection", "Ibuprofen", "Co-codamol", "Paracetamol", "Amlodipine" }));
        cmbxnametablets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxnametabletsActionPerformed(evt);
            }
        });
        getContentPane().add(cmbxnametablets, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 140, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Name of Tablets");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("LOT:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Dose (mg):");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Possible Side Effects:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Daily Dose:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Exp Date:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Issued Date:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Patient ID:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("NHS Number:");
        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Date of Birth:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Patient Name:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("How to Use Medication:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Driving Using Machines:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Storage Advice:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("Further Information:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setText("Patient Address:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        txtfDose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtfDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, -1));

        txtRefNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtRefNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRefNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtRefNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, -1));

        txtfLOT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtfLOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfLOTActionPerformed(evt);
            }
        });
        getContentPane().add(txtfLOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 200, -1));

        txtfIssueDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtfIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 200, -1));

        txtfExpDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtfExpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfExpDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtfExpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 200, -1));

        txtfSideEffects.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtfSideEffects, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 200, -1));

        txtfDailyDose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtfDailyDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 200, -1));

        txtfInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtfInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfInfoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 150, -1));

        txtfStorage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtfStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 150, -1));

        txtfMachines.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtfMachines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfMachinesActionPerformed(evt);
            }
        });
        getContentPane().add(txtfMachines, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 150, -1));

        txtfHowTo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtfHowTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 150, -1));

        txtfPatientID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtfPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfPatientIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtfPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 150, -1));

        txtfNHS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtfNHS, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 150, -1));

        txtfPatientName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtfPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 150, -1));

        txtfPatientAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtfPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 150, -1));

        txtfDateOfBirth.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtfDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfDateOfBirthActionPerformed(evt);
            }
        });
        getContentPane().add(txtfDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Tablets", "Reference No.", "Dose (mg)", "Number of Tablets", "LOT", "Issued Date", "Exp Date", "Daily Dose", "Possible Side Effects", "Further Information", "Storage Advice", "Administration", "Drivingi and Using Machines", "How to Use Medication", "Patient ID", "NHS Number", "Date of Birth:", "Patient Address:"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 1160, 140));

        txtfNumberTablets.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtfNumberTablets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNumberTabletsActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNumberTablets, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 200, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setText("Number of Tablets");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRefNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRefNoActionPerformed

    private void txtfLOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfLOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfLOTActionPerformed

    private void txtfExpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfExpDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfExpDateActionPerformed

    private void txtfInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfInfoActionPerformed

    private void txtfMachinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfMachinesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfMachinesActionPerformed

    private void txtfPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfPatientIDActionPerformed

    private void txtfDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfDateOfBirthActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() == -1){
            if (jTable1.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "No data to delete", "Hospital Management Systems",
                        JOptionPane.OK_OPTION );
            }else{
                JOptionPane.showMessageDialog(null, "Select a row to delete", "Hospital Management Systems",
                        JOptionPane.OK_OPTION );                
            }
        }else{
            model.removeRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnGPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGPActionPerformed

    }//GEN-LAST:event_btnGPActionPerformed

    private void btnPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescriptionActionPerformed
        String Qty1 = (txtRefNo.getText());
        String Qty2 = (txtfDose.getText());
        String Qty3 = (txtfNumberTablets.getText());
        String Qty4 = (txtfLOT.getText());
        String Qty5 = (txtfDailyDose.getText());
        String Qty6 = (txtfSideEffects.getText());
        String Qty7 = (txtfInfo.getText());
        String Qty8 = (txtfHowTo.getText());
        String Qty9 = (txtfPatientID.getText());
        String Qty10 = (txtfPatientName.getText());
        String Qty11 = (txtfDateOfBirth.getText());
        String Qty12 = (txtfPatientAddress.getText());
        String Qty13 = "";
        
        if(cmbxnametablets.getSelectedItem().equals("Ibuprofen"))
        {
            Qty13 = "Ibuprofen";
        }
        else if(cmbxnametablets.getSelectedItem().equals("Co-codamol"))
        {
            Qty13 = "Co-codamol";
        }
        else if(cmbxnametablets.getSelectedItem().equals("Amlodipine"))
        {
            Qty13 = "Amlodipine";
        }
        else if(cmbxnametablets.getSelectedItem().equals("Paracetamol"))
        {
            Qty13 = "Paracetamol";
        }
        
        jtxtPrescription.setText("");
        jtxtPrescription.append("\t\n\tHospital Management System\n"
        +"\nPatient Name:\t\t" + Qty10
        +"\nDate Of Birth:\t\t" + Qty11
        +"\nPatient Address :\t" + Qty12
        +"\nPrescription:\t\t" + Qty13
        +"\n\nReference No:\t\t" + Qty1
        +"\nDose (mg):\t\t" + Qty2
        +"\nNumber of Tablets:\t" + Qty3
        +"\nLOT:\t\t" + Qty4
        +"\nDaily Dose :\t\t" + Qty5
        +"\nPossible Side Effects:\t" + Qty6
        +"\nFurther Information\t" + Qty7
        +"\nHow to Use Medication\t" + Qty8
        +"\nPatient ID:\t\t" + Qty9
        +"\n\n\tPatient Instruction we have introduced a \n\t free text configuration\n\t"
                + "TEXT REMINDERS FOR APPOINTMENT");
        
        
    }//GEN-LAST:event_btnPrescriptionActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed

    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame,"Do you want to exit?", "Hospital Manager System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                        System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Login iLogin = new Login();
        iLogin.setVisible(true);
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try{
            //named text area jtxtPrescription, Is this correct???
            jtxtPrescription.print();
            
        }catch (PrinterException ex){
            Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void cmbxnametabletsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxnametabletsActionPerformed
        if(cmbxnametablets.getSelectedItem().equals("Ibuprofen"))
        {
            txtRefNo.setText("Ibu8568959");
            txtfDose.setText("2");
            txtfNumberTablets.setText("32");
            txtfLOT.setText("561005875");
            txtfIssueDate.setText("06/05/2018");
            txtfExpDate.setText("04/05/2019");
            txtfDailyDose.setText("4");
            
            txtfSideEffects.setText("Bleeding");
            txtfInfo.setText("Place Dispensary");
            txtfStorage.setText("Less than 20%");
            txtfMachines.setText("No");
            txtfHowTo.setText("Use water, No Alcohol");
            txtfPatientID.setText("P9589454");
            txtfNHS.setText("646564");
        }
        else if(cmbxnametablets.getSelectedItem().equals("Co-codamol")){
            txtRefNo.setText("COCO6758940");
            txtfDose.setText("500");
            txtfNumberTablets.setText("30");
            txtfLOT.setText("B770034");
            txtfIssueDate.setText("06/05/2018");
            txtfExpDate.setText("04/12/2019");
            txtfDailyDose.setText("2");
            
            txtfSideEffects.setText("Dizziness");
            txtfInfo.setText("Place Dispensary");
            txtfStorage.setText("Less than 20%");
            txtfMachines.setText("No");
            txtfHowTo.setText("Use water, No Alcohol");
            txtfPatientID.setText("P9589454");
            txtfNHS.setText("646564");
        }
        else if(cmbxnametablets.getSelectedItem().equals("Paracetamol")){
            txtRefNo.setText("01729214");
            txtfDose.setText("500");
            txtfNumberTablets.setText("16");
            txtfLOT.setText("0204324");
            txtfIssueDate.setText("07/05/2018");
            txtfExpDate.setText("04/05/2019");
            txtfDailyDose.setText("2");
            
            txtfSideEffects.setText("Nausea");
            txtfInfo.setText("Place Dispensary");
            txtfStorage.setText("Less than 25%");
            txtfMachines.setText("No");
            txtfHowTo.setText("Use water, No Alcohol");
            txtfPatientID.setText("P5562454");
            txtfNHS.setText("875564");
        }
        else if(cmbxnametablets.getSelectedItem().equals("Amlodipine")){
            txtRefNo.setText("Am05875");
            txtfDose.setText("5");
            txtfNumberTablets.setText("28");
            txtfLOT.setText("8745475");
            txtfIssueDate.setText("06/05/2018");
            txtfExpDate.setText("04/05/2019");
            txtfDailyDose.setText("1");
            
            txtfSideEffects.setText("Liver Disease");
            txtfInfo.setText("Ability to drive may be affected");
            txtfStorage.setText("No Special Storage");
            txtfMachines.setText("No");
            txtfHowTo.setText("Use water, No Alcohol");
            txtfPatientID.setText("P9129454");
            txtfNHS.setText("6346564");
        }
        else if(cmbxnametablets.getSelectedItem().equals("Make a Selection")){
            cmbxnametablets.setSelectedItem("Make a Selection");
            txtRefNo.setText("");
            txtfDose.setText("");
            txtfNumberTablets.setText("");
            txtfLOT.setText("");
            txtfIssueDate.setText("");
            txtfExpDate.setText("");
            txtfDailyDose.setText("");
            
            txtfSideEffects.setText("");
            txtfInfo.setText("");
            txtfStorage.setText("");
            txtfMachines.setText("");
            txtfHowTo.setText("");
            txtfPatientID.setText("");
            txtfNHS.setText("");
            txtfPatientName.setText("");
            txtfDateOfBirth.setText("");
            txtfPatientAddress.setText("");
        }
    }//GEN-LAST:event_cmbxnametabletsActionPerformed

    private void txtfNumberTabletsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNumberTabletsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNumberTabletsActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        cmbxnametablets.setSelectedItem("Make a Selection");
        txtRefNo.setText("");
        txtfDose.setText("");
        txtfNumberTablets.setText("");
        txtfLOT.setText("");
        txtfIssueDate.setText("");
        txtfExpDate.setText("");
        txtfDailyDose.setText("");
            
        txtfSideEffects.setText("");
        txtfInfo.setText("");
        txtfStorage.setText("");
        txtfMachines.setText("");
        txtfHowTo.setText("");
        txtfPatientID.setText("");
        txtfNHS.setText("");
        txtfPatientName.setText("");
        txtfDateOfBirth.setText("");
        txtfPatientAddress.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{cmbxnametablets.getSelectedItem().toString(),
            txtRefNo.getText(),txtfDose.getText(),txtfNumberTablets.getText(),txtfLOT.getText(),
            txtfIssueDate.getText(),txtfExpDate.getText(),txtfDailyDose.getText(),
            txtfSideEffects.getText(),txtfInfo.getText(),txtfStorage.getText(),
            txtfMachines.getText(),txtfHowTo.getText(),txtfPatientID.getText(),txtfNHS.getText(),
            txtfPatientName.getText(),txtfDateOfBirth.getText(),txtfPatientAddress.getText(),
        });
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed

    }//GEN-LAST:event_btnDoctorActionPerformed

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
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGP;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnPrescription;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbxnametablets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jtxtPrescription;
    private javax.swing.JTextField txtRefNo;
    private javax.swing.JTextField txtfDailyDose;
    private javax.swing.JTextField txtfDateOfBirth;
    private javax.swing.JTextField txtfDose;
    private javax.swing.JTextField txtfExpDate;
    private javax.swing.JTextField txtfHowTo;
    private javax.swing.JTextField txtfInfo;
    private javax.swing.JTextField txtfIssueDate;
    private javax.swing.JTextField txtfLOT;
    private javax.swing.JTextField txtfMachines;
    private javax.swing.JTextField txtfNHS;
    private javax.swing.JTextField txtfNumberTablets;
    private javax.swing.JTextField txtfPatientAddress;
    private javax.swing.JTextField txtfPatientID;
    private javax.swing.JTextField txtfPatientName;
    private javax.swing.JTextField txtfSideEffects;
    private javax.swing.JTextField txtfStorage;
    // End of variables declaration//GEN-END:variables
}
