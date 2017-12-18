/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classmodeling;

/**
 *
 * @author ZZZ
 */
public class House {
    
    private String address;
    private int numOfBedrooms;
    private int numOfResidents;
    private String areaOfHouse;
    private double rent;
    
    private double longitude;
    private double latitude;
    
    private String designSoftware;
    
    // make a constructor for house details
    public House(String addressIn, int numOfBedroomsIn, int numOfResidentsIn, String areaOfHouseIn, double rentIn) {
        this.address = addressIn;
        this.numOfBedrooms = numOfBedroomsIn;
        this.numOfResidents = numOfResidentsIn;
        this.areaOfHouse = areaOfHouseIn;
        this.rent = rentIn;
    }
    
    // making 2nd constructor for GPS mapping
    public House(double longitude_, double latitude_) {
        this.longitude = longitude_;
        this.latitude = latitude_;
    }
    
    // making 3rd constructor for 3d design
    public House(String designSoftware_, int numOfBedrooms_, String areaOfHouse_) {
        this.designSoftware = designSoftware_;
        this.numOfBedrooms = numOfBedrooms_;
        this.areaOfHouse = areaOfHouse_;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public int getNumOfResidents() {
        return numOfResidents;
    }

    public void setNumOfResidents(int numOfResidents) {
        this.numOfResidents = numOfResidents;
    }

    public String getAreaOfHouse() {
        return areaOfHouse;
    }

    public void setAreaOfHouse(String areaOfHouse) {
        this.areaOfHouse = areaOfHouse;
    }
    
    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDesignSoftware() {
        return designSoftware;
    }

    public void setDesignSoftware(String designSoftware) {
        this.designSoftware = designSoftware;
    }
    
    public void slogan() {
        System.out.println("A home where families grow as one");
    }
    
}
