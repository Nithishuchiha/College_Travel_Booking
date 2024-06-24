package com.college_project.backend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RideDetails {
    @Id
    int rideId;
    String departurePlace;
    String destinationPlace;
    Date date;
    String stop1;
    String stop2;
    String stop3;
    int availableSeats;
    int pricePerSeat;
    String carType;
    int carNumber;

    public String getDeparturePlace() {
        return departurePlace;
    }
    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }
    public String getDestinationPlace() {
        return destinationPlace;
    }
    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getStop1() {
        return stop1;
    }
    public void setStop1(String stop1) {
        this.stop1 = stop1;
    }
    public String getStop2() {
        return stop2;
    }
    public void setStop2(String stop2) {
        this.stop2 = stop2;
    }
    public String getStop3() {
        return stop3;
    }
    public void setStop3(String stop3) {
        this.stop3 = stop3;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public int getPricePerSeat() {
        return pricePerSeat;
    }
    public void setPricePerSeat(int pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public int getCarNumber() {
        return carNumber;
    }
    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
    public void setId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

}
