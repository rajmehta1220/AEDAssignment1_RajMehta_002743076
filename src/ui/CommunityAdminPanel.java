/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author rajmehta
 */
public class CommunityAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminPanel
     */
    
    City city;
    DefaultTableModel model;
    DefaultTableModel model1;
    String[] communityDropboxList;
    String selectedCommunity;
    Community community;
    Hospital hospital;
    House house;
    
    public CommunityAdminPanel() {
        initComponents();
    }
    
    public CommunityAdminPanel(City city, String[] communityDropboxList) {
        initComponents();
        this.city = city;
        this.communityDropboxList = communityDropboxList;
        
        community_dropbox.removeAllItems();
        for(String s:communityDropboxList){
            community_dropbox.addItem(s);
        }
        
    model = (DefaultTableModel) hospital_table.getModel();
    model1 = (DefaultTableModel) house_table.getModel();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        hospital_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        house_table = new javax.swing.JTable();
        community_dropbox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        create_hospital_btn = new javax.swing.JButton();
        create_new_house = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hospital_dropbox = new javax.swing.JComboBox<>();
        update_hospital = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        update_hospital_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        house_dropbox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        update_house = new javax.swing.JTextField();
        update_house_btn = new javax.swing.JButton();
        search_comm_btn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Zapfino", 0, 18)); // NOI18N
        jLabel1.setText("Modify the information under a Community");

        hospital_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hosp num", "StreetName", "City", "ZipCode"
            }
        ));
        jScrollPane1.setViewportView(hospital_table);

        house_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "House Num", "Street Name", "City", "No of members"
            }
        ));
        jScrollPane2.setViewportView(house_table);

        community_dropbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Communities");

        create_hospital_btn.setText("Create New Hospital");

        create_new_house.setText("Create New House");

        jLabel3.setText("Modify:");

        hospital_dropbox.setEditable(true);
        hospital_dropbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "hospNum", "streetName", "zipCode" }));

        jLabel4.setText("New Value:");

        update_hospital_btn.setText("Update Hospital");
        update_hospital_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_hospital_btnActionPerformed(evt);
            }
        });

        jLabel5.setText("Modify:");

        house_dropbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "houseNum", "streetName" }));

        jLabel6.setText("New Value:");

        update_house_btn.setText("Update House");

        search_comm_btn.setText("Search");
        search_comm_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_comm_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(create_hospital_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(create_new_house, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hospital_dropbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(update_hospital, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(update_hospital_btn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(house_dropbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(update_house, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(update_house_btn)
                                        .addGap(70, 70, 70)))))
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(community_dropbox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(search_comm_btn)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(128, 128, 128))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(community_dropbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(search_comm_btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(hospital_dropbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_hospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(update_hospital_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_hospital_btn)
                    .addComponent(create_new_house))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(house_dropbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(update_house, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(update_house_btn)
                        .addGap(74, 74, 74))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void search_comm_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_comm_btnActionPerformed
        // TODO add your handling code here:
        selectedCommunity = String.valueOf(community_dropbox.getSelectedItem());
        
        for(Community c: city.getCommList()){
            if(selectedCommunity == c.getCommName())
                community = c;
        }
        
        model.setRowCount(0);
        for(Hospital h: community.getHospitalList()){
            Object[] row = new Object[4];
            row[0]= h.getHospNum();
            row[1]= h.getStreetName();
            row[2]= h.getCity();
            row[3]= h.getZipcode();
            model.addRow(row);
        }
        model1.setRowCount(0);
        for(House h: community.getHouseList()){
            Object[] row = new Object[4];
            row[0]= h.getHouseNum();
            row[1]= h.getStreetName();
            row[2]= h.getCity();
            row[3]= (h.getFamiliyMembers()).size();
            model1.addRow(row);
        }
    }//GEN-LAST:event_search_comm_btnActionPerformed

    private void update_hospital_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_hospital_btnActionPerformed
        // TODO add your handling code here:
        
        if(hospital_table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "Please select a Hospital");
        }
        else{
            int hospNum_check= (int)model.getValueAt(hospital_table.getSelectedRow(), 0);
            String hospupdate_str = update_hospital.getText();
  
            for(Hospital i:community.getHospitalList()){
                if(hospNum_check == i.getHospNum()){
                    hospital = i;
                }
            }
        
        String hospitalUpdateCriteria = String.valueOf(hospital_dropbox.getSelectedItem());
        if(hospitalUpdateCriteria == " "){
            JOptionPane.showMessageDialog(this,"Select Valid Dropbox Item");
        }
        else{
            if(hospitalUpdateCriteria == "hospNum"){
                int new_hospNum = Integer.parseInt(hospupdate_str);
                hospital.setHospNum(new_hospNum);
                populateHospTable();
            }
            
            if(hospitalUpdateCriteria == "streetName"){
                String new_streetName = hospupdate_str;
                hospital.setStreetName(new_streetName);
                populateHospTable();
            }
            
            if(hospitalUpdateCriteria == "zipCode"){
                long new_zipCode = Long.parseLong(hospupdate_str);
                hospital.setZipcode(new_zipCode);
                populateHospTable();
            }
            
        }
     }
    }//GEN-LAST:event_update_hospital_btnActionPerformed

    
public void populateHospTable(){
    for(Community c: city.getCommList()){
            if(selectedCommunity == c.getCommName())
                community = c;
        }
        
        model.setRowCount(0);
        for(Hospital h: community.getHospitalList()){
            Object[] row = new Object[4];
            row[0]= h.getHospNum();
            row[1]= h.getStreetName();
            row[2]= h.getCity();
            row[3]= h.getZipcode();
            model.addRow(row);
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> community_dropbox;
    private javax.swing.JButton create_hospital_btn;
    private javax.swing.JButton create_new_house;
    private javax.swing.JComboBox<String> hospital_dropbox;
    private javax.swing.JTable hospital_table;
    private javax.swing.JComboBox<String> house_dropbox;
    private javax.swing.JTable house_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton search_comm_btn;
    private javax.swing.JTextField update_hospital;
    private javax.swing.JButton update_hospital_btn;
    private javax.swing.JTextField update_house;
    private javax.swing.JButton update_house_btn;
    // End of variables declaration//GEN-END:variables
}