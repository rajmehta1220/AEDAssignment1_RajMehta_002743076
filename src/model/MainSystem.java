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
public class MainSystem {
    
    private ArrayList<City> cityList;
    private HospitalDirectory hospDir;
    private PatientDirectory patDir;
    private PersonDirectory perDir;
    

    public MainSystem() {
        this.cityList = new ArrayList<City>();
    }

    
    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    public City addCity(String cityName){
        City city = new City(cityName);
        cityList.add(city);
        return city;
    }
    
    public void removeCity(City city){
        cityList.remove(city);
    }
    
    public void addNewCity(City city){
        this.getCityList().add(city);
    }
    
    public void PatDirectory(PatientDirectory pd){
        this.patDir = pd;
    }
    
    public void HosDirectory(HospitalDirectory hd){
        this.hospDir = hd;
    }
    
    public void PerDirectory(PersonDirectory perd){
        this.perDir = perd;
    }

    public HospitalDirectory getHospDir() {
        return hospDir;
    }

    public void setHospDir(HospitalDirectory hospDir) {
        this.hospDir = hospDir;
    }

    public PatientDirectory getPatDir() {
        return patDir;
    }

    public void setPatDir(PatientDirectory patDir) {
        this.patDir = patDir;
    }

    public PersonDirectory getPerDir() {
        return perDir;
    }

    public void setPerDir(PersonDirectory perDir) {
        this.perDir = perDir;
    }
    
    
    
    
}
