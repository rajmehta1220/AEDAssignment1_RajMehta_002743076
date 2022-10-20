/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rajmehta
 */
public class Patient {
    
    private long id;
    Person person;
    static long count = 0;
    private String userPass;
    EncounterHistory encounterHistory;
    
    public Patient(){}
    
    public Patient(Person person){   
        count += 1;
        this.id = count;
        this.person = person;
        this.userPass = (person.getName()).concat("123");
        
        //Create patient specific encounter history 
        this.encounterHistory = createEncounterHistory();
        
    }
    
    public EncounterHistory createEncounterHistory(){
        
        return new EncounterHistory(this);
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }
    
    public ArrayList<Encounter> getPatientEncounterHistory(){
        
        return this.encounterHistory.getEncounterList();
        
    }
    
    public long getId() {
        return id;
    }
    
    public boolean matchByName(String name){
        
        return this.person.matchByName(name);
    }
    
    public boolean matchById(int id){
        
        return this.getId() == id;
    }
    
    public boolean matchByContact(long contact){
        return this.person.getContactNo() == contact;
    }
    
    public Person getPerson() {
        return person;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
