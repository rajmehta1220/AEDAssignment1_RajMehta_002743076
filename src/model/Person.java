/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author rajmehta
 */
public class Person {
    
    private String name;
    private int age;
    private LocalDate dob;
    private long contactNo;

    public Person(String name, LocalDate dob, long contactNo) {
        this.name = name;
        this.age = calculateAge(dob);
        this.dob = dob;
        this.contactNo = contactNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
    
    public boolean checkByName(String name) {
        
        return this.getName().equals(name);
    }
    
    public int calculateAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
    
}
