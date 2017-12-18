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
class Airplane {
    private String name;
    private int occupancy;
    private int numOfSeats;
    private int flightAttendants;
    private boolean isAutopilot;
    
    public Airplane(String name_, int occupancy_, 
            int numOfSeats_, int flightAttendants_, boolean isAutoPilot_) {
        this.name = name_;
        this.occupancy = occupancy_;
        this.numOfSeats = numOfSeats_;
        this.flightAttendants = flightAttendants_;
        this.isAutopilot = isAutoPilot_;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getFlightAttendants() {
        return flightAttendants;
    }

    public void setFlightAttendants(int flightAttendants) {
        this.flightAttendants = flightAttendants;
    }

    public boolean isIsAutopilot() {
        return isAutopilot;
    }

    public void setIsAutopilot(boolean isAutopilot) {
        this.isAutopilot = isAutopilot;
    }
    
}
