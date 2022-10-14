/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author rajmehta
 */
public class PersonDirectory {
    ArrayList<Person> personList;
    System syst;
    
    public PersonDirectory(System syst){
        
        personList = new ArrayList<Person>();
        this.syst = syst;
        
    }
    
    public Person createPerson(String name, LocalDate dob, long contactNo){
        
        //Create person
        Person newPerson = new Person(name, dob, contactNo);
  
        //Add created person to a list
        personList.add(newPerson);
        
        return newPerson;
        
    }
}
