/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package ui;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;
import parser.Parser;

/**
 *
 * @author rajmehta
 */
public class DoctorPanel extends javax.swing.JPanel {

    PatientDirectory patDir;
    DoctorDirectory docDir;
    ArrayList<Patient> patientList;
    DefaultTableModel model;
    DefaultTableModel model1;
    Patient patient;
    Patient patient1;
    Parser parser = new Parser();
    boolean logged_in = false;
    Doctor d_pat;
    long patient_id_check;
    
    /** Creates new form DotorPanel */
    public DoctorPanel() {
        initComponents();
    }

    public DoctorPanel(PatientDirectory patDir, DoctorDirectory docDir){
        initComponents();
        
        this.patDir = patDir;
        patientList = patDir.getPatientList();
        this.docDir = docDir;  
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        person_dir_table = new javax.swing.JTable();
        add_vitals_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        blood_pressure = new javax.swing.JTextField();
        heart_rate = new javax.swing.JTextField();
        weight_ui = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        symptoms_ui = new javax.swing.JTextArea();
        doc_id = new javax.swing.JTextField();
        doc_pass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        login_doctor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        person_directory_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        view_encounter = new javax.swing.JTable();
        view_encounter_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 118, 82));

        jLabel2.setFont(new java.awt.Font("Zapfino", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Diagnose and Leave encounter record based on vital signs");

        jPanel2.setBackground(new java.awt.Color(10, 77, 55));

        person_dir_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Patient Age"
            }
        ));
        jScrollPane3.setViewportView(person_dir_table);

        add_vitals_button.setText("Add Vitals");
        add_vitals_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_vitals_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Blood Pressure:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Heart Rate:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Weight:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Symptoms:");

        symptoms_ui.setColumns(20);
        symptoms_ui.setRows(5);
        jScrollPane4.setViewportView(symptoms_ui);

        doc_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doc_idActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID:");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pass:");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter Doctor Creds:");

        login_doctor.setText("Login");
        login_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_doctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(blood_pressure, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(heart_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(81, 81, 81))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(85, 85, 85)
                                .addComponent(weight_ui, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(add_vitals_button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(doc_id, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(doc_pass))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(login_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(blood_pressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heart_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(weight_ui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(doc_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add_vitals_button)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(doc_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(login_doctor))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Add Encounters", jPanel2);

        jPanel1.setBackground(new java.awt.Color(10, 77, 55));

        person_directory_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(person_directory_table);

        view_encounter.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(view_encounter);

        view_encounter_button.setText("View Encounters");
        view_encounter_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_encounter_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(view_encounter_button)
                .addGap(361, 361, 361))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(view_encounter_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("View Encounters", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add_vitals_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_vitals_buttonActionPerformed
        // TODO add your handling code here:
   
        if(logged_in){
            if(person_dir_table.getSelectedRow()<0){
                JOptionPane.showMessageDialog(this, "Please select a Patient");
            }
            else{
                patient_id_check= (long)model.getValueAt(person_dir_table.getSelectedRow(), 0);
                System.out.println("Patient ID Check: "+patient_id_check);
           
                for(Patient p : d_pat.getPatientsAssignToDoctor()){
                    if(patient_id_check == p.getId()){
                        patient = p;
                    }
                }
                
                if(!parser.checkNull(blood_pressure.getText()) && !parser.isInteger(blood_pressure.getText())){
                    JOptionPane.showMessageDialog(this, "Type Mismached for BP");
                }
                
                if(!parser.checkNull(heart_rate.getText()) && !parser.isInteger(heart_rate.getText())){
                    JOptionPane.showMessageDialog(this, "Type Mismached for HR");
                }
                
                if(!parser.checkNull(weight_ui.getText()) && !parser.isInteger(weight_ui.getText())){
                    JOptionPane.showMessageDialog(this, "Type Mismached for Weight");
                }
                
                float bloodPressure = Float.parseFloat(blood_pressure.getText());
                float heartRate = Float.parseFloat(heart_rate.getText());
                float weight = Float.parseFloat(weight_ui.getText());
                String symptoms = symptoms_ui.getText();
                
                

                patient.getEncounterHistory().addEncounter(new VitalSigns(bloodPressure, heartRate, weight, symptoms));
                JOptionPane.showMessageDialog(this, "Visit saved successfully!");

            }//end else
        }//logged if
        else{
            JOptionPane.showMessageDialog(this, "Please Log in First");
        }
    }//GEN-LAST:event_add_vitals_buttonActionPerformed

    private void view_encounter_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_encounter_buttonActionPerformed
        // TODO add your handling code here:
        if(person_dir_table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "Please select a Patient");
        }
        else{
            
            DefaultTableModel model2 = (DefaultTableModel) view_encounter.getModel();
            model2.setRowCount(0);
            
            long patient_id_check= (long)model1.getValueAt(person_directory_table.getSelectedRow(), 0);
            System.out.println("Patient ID Check: "+patient_id_check);
            
            for(Patient i:patientList){
                if(patient_id_check == i.getId()){
                    patient1 = i;
                }
            }

            ArrayList<Encounter> patient_encounter = patient1.getPatientEncounterHistory();
            for(Encounter e:patient_encounter){
                Object[] row = new Object[4];
                row[0] = e.getLastVisitDate();
                row[1] = e.getId();
                row[2]=e.getVital().getBloodPressure();
                row[3]= e.getVital().getSymptoms();
                model2.addRow(row);
            }
        
        }//end else
    }//GEN-LAST:event_view_encounter_buttonActionPerformed

    private void doc_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doc_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doc_idActionPerformed

    private void login_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_doctorActionPerformed
        // TODO add your handling code here:

        if(doc_id.getText().isEmpty() || doc_pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Cannot keep login fields empty");
        }
        else{
        long docid_cred = Long.parseLong(doc_id.getText());
        String docpass_cred = String.valueOf(doc_pass.getText());
        for(Doctor d: docDir.getDoctorList()){
            
            System.out.println("Given: "+docpass_cred+ " Obj: "+d.getDocPass());
            System.out.println("GivenId: "+docid_cred+ " ObjID: "+d.getId());
            if(d.getId() == docid_cred && (d.getDocPass() == null ? docpass_cred == null : d.getDocPass().equals(docpass_cred))){
                System.out.print("Validation Matched");
                d_pat = d;
                logged_in =true; 
                
            }
        }
        if(!logged_in){
            JOptionPane.showMessageDialog(this, "Incorrect Login Details");
        }
        
        for(Patient p : d_pat.getPatientsAssignToDoctor()){
                if(patient_id_check == p.getId()){
                    patient = p;
            }
         }

        model = (DefaultTableModel) person_dir_table.getModel();
        model.setRowCount(0);
        
        model1 = (DefaultTableModel) person_directory_table.getModel();
        model1.setRowCount(0);
                    
        for(Patient p:d_pat.getPatientsAssignToDoctor()){
            Object[] row= new Object[3];
            row[0]= p.getId();
            row[1]= p.getPerson().getName();
            row[2]= p.getPerson().getAge();
            model.addRow(row);
            model1.addRow(row);
        
        }
        }
    }//GEN-LAST:event_login_doctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_vitals_button;
    private javax.swing.JTextField blood_pressure;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField doc_id;
    private javax.swing.JPasswordField doc_pass;
    private javax.swing.JTextField heart_rate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton login_doctor;
    private javax.swing.JTable person_dir_table;
    private javax.swing.JTable person_directory_table;
    private javax.swing.JTextArea symptoms_ui;
    private javax.swing.JTable view_encounter;
    private javax.swing.JButton view_encounter_button;
    private javax.swing.JTextField weight_ui;
    // End of variables declaration//GEN-END:variables

}
