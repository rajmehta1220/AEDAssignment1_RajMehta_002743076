/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import java.time.LocalDate;
import java.util.ArrayList;
import model.City;
import model.Community;
import model.Doctor;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.Hospital;
import model.HospitalDirectory;
import model.House;
import model.MainSystem;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

import parser.Parser;
/**
 *
 * @author rajmehta
 */
public class MainFrame extends javax.swing.JFrame {
    MainSystem system;
    City city;
    String[] communityList;
    PatientDirectory patDir;
    Hospital newHospital;
    HospitalDirectory hospDir;
    EncounterHistory encounterDir;
    PersonDirectory pd;
    DoctorDirectory docDir;
    MainSystem sys;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setSize(1200,800);
        hospDir = new HospitalDirectory();
        patDir = new PatientDirectory();
        encounterDir = new EncounterHistory();
        pd = new PersonDirectory();
        docDir = new DoctorDirectory();
        sys = new MainSystem();
        
        
        String dob = "20-Dec-2000";
        Parser parser = new Parser();
        LocalDate date = parser.convertToDate(dob);
        
        
        system = new MainSystem();
        
        Person p1 = pd.createPerson(02323232323, "Raj", date, "Suffolk");//doc
        Person p2 = pd.createPerson(12345, "Het", date, "Suffolk"); //pat
        Person p3 = pd.createPerson(0232, "Sneh", date, "Suffolk"); //pat
        
        Person p4 = pd.createPerson(02323543, "Heet", date, "Sapphire");  //pat
        Person p5 = pd.createPerson(027563334, "Varu", date, "Sapphire"); //doc
        Person p6 = pd.createPerson(1234323, "Dhb", date, "Sapphire"); //doc
        Person p7 = pd.createPerson(12343234, "Sanvi", date, "Sapphire"); //Not Doc nor Pat
        
        
        patDir.createPatient(p2);
        patDir.createPatient(p3);
        patDir.createPatient(p4);
        
        System.out.println("Patients List: ");
        ArrayList<Patient> ptt = patDir.getPatientList();
        for(Patient i:ptt){
            System.out.println(i.getId());
            System.out.println(i.getPerson().getName());
        }

        city = new City("Boston");
        sys.getCityList().add(city);
        system.addNewCity(city);
        Community comm_suffolk = city.newCommunity("Suffolk");
        Community comm_sapphire = city.newCommunity("Sapphire");
        
        House h1 = comm_suffolk.createHouse(1,"111 Huntington Ave", "Suffolk","Boston");
        h1.addPersonToHouse(p3);
        h1.addPersonToHouse(p2);
        House h2 = comm_suffolk.createHouse(2,"222 Huntington Ave", "Suffolk","Boston");
        h2.addPersonToHouse(p1);
       
        House h3 = comm_sapphire.createHouse(45,"222 Sapphire Ave", "Sapphire","Boston");
        h3.addPersonToHouse(p4);
        h3.addPersonToHouse(p5);
        House h4 = comm_sapphire.createHouse(56,"222 Sapphire Ave", "Sapphire","Boston");
        h4.addPersonToHouse(p6);
               
        newHospital = comm_suffolk.createHospital(1,  "112 Huntington Ave","Suffolk", "Boston");
        hospDir.addHospital(newHospital);
        Doctor d = new Doctor(p1);
        newHospital.addDoctorToHospital(d);
        newHospital = comm_sapphire.createHospital(2,  "Sapphire Ave","Sapphire", "Boston");
        Doctor d1 = new Doctor(p6);
        Doctor d2 = new Doctor(p5);
        newHospital.addDoctorToHospital(d1);
        newHospital.addDoctorToHospital(d2);
        hospDir.addHospital(newHospital);
        system.HosDirectory(hospDir);
        
        docDir = new DoctorDirectory();
        docDir.addDoctor(d);
        docDir.addDoctor(d1);
        docDir.addDoctor(d2);
        
        system.PatDirectory(patDir);
        system.PerDirectory(pd);
        
        ArrayList<Community> commList = new ArrayList<Community>();
        commList = city.getCommList();
        
        int size = commList.size();
        communityList = new String[size+1];
        
        commList = city.getCommList();
        
        communityList[0]=" ";
        
        for(int i=0; i<commList.size(); i++){
            communityList[i+1]= commList.get(i).getCommName();
        }
        
        System.out.println("Done");
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
        sysadmin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysadmin_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel1.setText("Select a profile:");

        hospitaladmin_button.setText("Hosp - Admin");
        hospitaladmin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitaladmin_buttonActionPerformed(evt);
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(148, Short.MAX_VALUE))
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
        PatientPanel patientpanel = new PatientPanel(communityList, patDir, newHospital, city, hospDir);
        splitpane.setRightComponent(patientpanel);
    }//GEN-LAST:event_patient_buttonActionPerformed

    private void doctor_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_buttonActionPerformed
        // TODO add your handling code here:
        DoctorPanel doctorpanel = new DoctorPanel(patDir,docDir);
        splitpane.setRightComponent(doctorpanel);

    }//GEN-LAST:event_doctor_buttonActionPerformed

    private void comadmin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comadmin_buttonActionPerformed
        // TODO add your handling code here:
//        CommunityAdminPanel commPanel = new CommunityAdminPanel(city, communityList);
//        splitpane.setRightComponent(commPanel);
        
        CommunityAdministratorPanel commPanel = new CommunityAdministratorPanel(city, communityList, patDir, hospDir,pd, docDir);
        splitpane.setRightComponent(commPanel);
    }//GEN-LAST:event_comadmin_buttonActionPerformed

    private void hospitaladmin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitaladmin_buttonActionPerformed
        // TODO add your handling code here:
        HospitalAdministratorPanel hospPanel = new HospitalAdministratorPanel(system, communityList, patDir, newHospital, city, hospDir, docDir, pd);
        splitpane.setRightComponent(hospPanel);
        
    }//GEN-LAST:event_hospitaladmin_buttonActionPerformed

    private void sysadmin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysadmin_buttonActionPerformed
        // TODO add your handling code here:
        SystemAdminPanel newSystemPanel = new SystemAdminPanel(city, communityList, patDir, hospDir,pd, docDir,sys);
        splitpane.setRightComponent(newSystemPanel);
        splitpane.setDividerLocation(150);
    }//GEN-LAST:event_sysadmin_buttonActionPerformed

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
