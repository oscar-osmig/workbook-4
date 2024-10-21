package com.pluralsight;

public class Reservations {
    String roomType;
    float price;
    int numberOfNights;
    boolean isWeekend = false;
    float reservationTotal;

    public Reservations(String roomType, float price, int numberOfNights, boolean isWeekend, float reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        if(!this.roomType.equals("king")){
            roomType = "double";
        } else {
            throw new IllegalArgumentException("not one of the type");
        }
        this.roomType = roomType;
    }

    public float getPrice() {
        if (this.roomType.equals("king")){
            price = 139.00f;
        }else {
            price = 124.00f;
        }

        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public float getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(float reservationTotal) {
        if (this.isWeekend){
            reservationTotal *= 1.1f;
        }
        this.reservationTotal = reservationTotal;
    }
}
