/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import java.time.LocalDate;
import java.util.ArrayList;
import model.*;
import parser.Parser;
/**
 *
 * @author rajmehta
 */
public class MainFrame extends javax.swing.JFrame {

    City city;
    String[] communityList;
    PatientDirectory patDir;
    Hospital newHospital;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        splitpane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        patient_button = new javax.swing.JButton();
        doctor_button = new javax.swing.JButton();
        comadmin_button = new javax.swing.JButton();
        sysadmin_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hospitaladmin_button = new javax.swing.JButton();
        autofill_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patient_button.setText("Patient");
        patient_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_buttonActionPerformed(evt);
            }
        });

        doctor_button.setText("Doctor");
        doctor_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_buttonActionPerformed(evt);
            }
        });

        comadmin_button.setText("Com - Admin");
        comadmin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comadmin_buttonActionPerformed(evt);
            }
        });

        sysadmin_button.setText("Sys - Admin");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel1.setText("Select a profile:");

        hospitaladmin_button.setText("Hosp - Admin");
        hospitaladmin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitaladmin_buttonActionPerformed(evt);
            }
        });

        autofill_button.setText("Autofill");
        autofill_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autofill_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hospitaladmin_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patient_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doctor_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comadmin_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sysadmin_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(autofill_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(patient_button)
                .addGap(18, 18, 18)
                .addComponent(doctor_button)
                .addGap(18, 18, 18)
                .addComponent(comadmin_button)
                .addGap(18, 18, 18)
                .addComponent(hospitaladmin_button)
                .addGap(18, 18, 18)
                .addComponent(sysadmin_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(autofill_button)
                .addContainerGap())
        );

        splitpane.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        splitpane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitpane, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitpane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patient_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_buttonActionPerformed
        // TODO add your handling code here:
        PatientPanel patientpanel = new PatientPanel(communityList, patDir, newHospital, city);
        splitpane.setRightComponent(patientpanel);
    }//GEN-LAST:event_patient_buttonActionPerformed

    private void doctor_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctor_buttonActionPerformed

    private void comadmin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comadmin_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comadmin_buttonActionPerformed

    private void hospitaladmin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitaladmin_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitaladmin_buttonActionPerformed

    private void autofill_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autofill_buttonActionPerformed
        // TODO add your handling code here:
        String dob = "1-Jan-2021";
        Parser parser = new Parser();
        LocalDate date =parser.convertToDate(dob);
        
        Person p1 = new Person(02323232323, "Raj", date, "Suffolk"); //doc
        Person p2 = new Person(02323232323, "Het", date, "Suffolk"); //pat
        Person p3 = new Person(02323232323, "Sneh", date, "Suffolk"); //pat
        
        Person p4 = new Person(02323232323, "Heet", date, "Sapphire");  //pat
        Person p5 = new Person(02323232323, "Varu", date, "Sapphire"); //doc
        Person p6 = new Person(02323232323, "Dhb", date, "Sapphire"); //doc
        
        patDir = new PatientDirectory();
        patDir.createPatient(p2);
        patDir.createPatient(p3);
        patDir.createPatient(p4);
        
        System.out.println("Patients List: ");
        ArrayList<Patient> ptt = patDir.getPatientList();
        for(Patient i:ptt){
            System.out.println(i.getId());
            System.out.println(i.getPerson().getName());
        }
        
        House h1 = new House(1,"111 Huntington Ave", "Suffolk","Boston");
        h1.addPersonToHouse(p3);
        h1.addPersonToHouse(p2);
        House h2 = new House(2,"222 Huntington Ave", "Suffolk","Boston");
        h1.addPersonToHouse(p1);
       
        House h3 = new House(45,"222 Sapphire Ave", "Sapphire","Boston");
        h1.addPersonToHouse(p4);
        h1.addPersonToHouse(p5);
        House h4 = new House(56,"222 Sapphire Ave", "Sapphire","Boston");
        h1.addPersonToHouse(p6);

        city = new City("Boston");
        Community comm_suffolk = city.newCommunity("Suffolk");
        Community comm_sapphire = city.newCommunity("Sapphire");
        
        newHospital = comm_suffolk.createHospital(1,  "112 Huntington Ave","Suffolk", "Boston");
        Doctor d = new Doctor(p1);
        newHospital.addDoctorToHospital(d);
        newHospital = comm_sapphire.createHospital(2,  "Sapphire Ave","Sapphire", "Boston");
        Doctor d1 = new Doctor(p6);
        Doctor d2 = new Doctor(p5);
        newHospital.addDoctorToHospital(d1);
        newHospital.addDoctorToHospital(d2);
        
        ArrayList<Community> commList = new ArrayList<Community>();
        commList = city.getCommList();
        
        int size = commList.size();
        communityList = new String[size+1];
        
        commList = city.getCommList();
        
        communityList[0]=" ";
        
        for(int i=0; i<commList.size(); i++){
            communityList[i+1]= commList.get(i).getCommName();
        }
        
        
//        doctor_community_dropbox.removeAllItems();
//        for(String s:communityList){
//        doctor_community_dropbox.addItem(s);
        
        System.out.println("Done");
        
    }//GEN-LAST:event_autofill_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton autofill_button;
    private javax.swing.JButton comadmin_button;
    private javax.swing.JButton doctor_button;
    private javax.swing.JButton hospitaladmin_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton patient_button;
    private javax.swing.JSplitPane splitpane;
    private javax.swing.JButton sysadmin_button;
    // End of variables declaration//GEN-END:variables
}
