/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    EncounterHistory encounterHistory;
    
    public Patient(Person person){
        
        count += 1;
        this.id = count;
        this.person = person;
        
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
    
    public boolean checkByName(String name){
        
        return this.person.checkByName(name);
    }
    
    public boolean checkById(int id){
        
        return this.getId() == id;
    }
    
    public Person getPerson() {
        return person;
    }
}
