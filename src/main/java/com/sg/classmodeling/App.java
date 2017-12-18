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
public class App {
    public static void main(String[] args) {
        double longForGps = 41.7759;
        double latForGps = 33.5541;
        
        // creating objects for House
        House pentHouse = new House("524W 59th St. 10th ave, Manhattan NY 10019", 1, 4, "750 sq.ft", 2050);
        House gpsMapping = new House(longForGps, latForGps);
        House design3d = new House("Autocad", 2, "750 sq.ft");
        
        System.out.println("There are this many bedrooms avail: " + pentHouse.getNumOfBedrooms());
        System.out.println("The penthouse is " + pentHouse.getAreaOfHouse());
        System.out.println("The location is " + gpsMapping.getLongitude() + ", " + gpsMapping.getLatitude());
        
        
        // creating objects for Airplane
        Airplane flightSimulator = new Airplane("Boeing 727", 250, 270, 15, true);
//        Airplane airTraffic = new Airplane();
        
        System.out.println("Aircraft " + flightSimulator.getName() + " " + "enabled with " 
                + flightSimulator.isIsAutopilot() + " is preparing to land.");
        // creating objects for Car
        Car inventory = new Car();
        Car2 videoGame = new Car2();
    }
}
