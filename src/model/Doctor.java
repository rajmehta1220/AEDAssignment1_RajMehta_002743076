/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;

/**
 *
 * @author rajmehta
 */
public class Doctor {
    private long id;
    Person person;
    static long count = 0;
    String docPass;
    ArrayList<Patient> patientsAssignToDoctor;
    
    public Doctor(Person person){   
        count += 1;
        this.id = count;
        this.person = person;
        this.docPass = (person.getName()).concat("123");
        this.patientsAssignToDoctor = new ArrayList<Patient>();
    }

    public String getDocPass() {
        return docPass;
    }

    public void setDocPass(String docPass) {
        this.docPass = docPass;
    }
   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Doctor.count = count;
    }
    
    public boolean matchByName(String name){
        
        return this.person.matchByName(name);
    }
    
    public boolean matchById(int id){
        
        return this.getId() == id;
    }

    public ArrayList<Patient> getPatientsAssignToDoctor() {
        return patientsAssignToDoctor;
    }

    public void setPatientsAssignToDoctor(ArrayList<Patient> patientsAssignToDoctor) {
        this.patientsAssignToDoctor = patientsAssignToDoctor;
    }
    
    public void BookPatientAppointnent(Patient p){
        this.getPatientsAssignToDoctor().add(p);
        System.out.println("Added Patient "+p.getPerson().getName()+ " to Doctor "+this.getId());
    }
}
