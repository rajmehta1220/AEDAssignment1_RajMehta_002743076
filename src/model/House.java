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
public class House {
    
    private int houseNum;
    private String unitNum;
    private String streetName;
    private String community;
    private String city;
    private long zipcode;
    ArrayList<Person> familiyMembers;
    
    public House(int houseNum,String streetName,
                 String community,String city
                    ){
        
        this.houseNum = houseNum;      
        this.streetName = streetName;
        this.community = community;
        this.city = city;      
        this.familiyMembers=new ArrayList<Person>();
        
    }

    public int getHouseNum() {
        return houseNum;
    }

    

    public String getStreetName() {
        return streetName;
    }

    public String getCommunity() {
        return community;
    }

    public String getCity() {
        return city;
    }

 
    public ArrayList<Person> getFamiliyMembers() {
        return familiyMembers;
    }
    
    public void addPersonToHouse(Person member){
        
        this.getFamiliyMembers().add(member);
    
    }
    
}
