package com.pluralsight;

public class Reservations {
    String roomType;
    float price;
    int numberOfNights;
    boolean isWeekend = false;
    float reservationTotal;

    public Reservations(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

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
            this.price = 139.00f;
        }else {
            this.price = 124.00f;
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
        return price * numberOfNights;
    }


    @Override
    public String toString() {
        return "Reservations{" +
                "roomType='" + roomType + '\'' +
                ", price=" + getPrice() +
                ", numberOfNights=" + numberOfNights +
                ", isWeekend=" + isWeekend +
                ", reservationTotal=" + getReservationTotal() +
                '}';
    }
}
