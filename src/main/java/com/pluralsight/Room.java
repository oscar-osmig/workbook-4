package com.pluralsight;

public class Room {
    private  int numberOfBeds;
    private  float roomPrice;
    private  boolean isOccupied;
    private  boolean isDirty;
    private  boolean isAvailable;

    public Room(int numberOfBeds, float roomPrice, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.roomPrice = roomPrice;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public Room() {

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public float getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(float roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isOccupied() {

        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
      return !this.isDirty && !this.isOccupied;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                ", roomPrice=" + roomPrice +
                ", isOccupied=" + isOccupied +
                ", isDirty=" + isDirty +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public boolean checkIn(){
        if(this.isDirty == false && this.isOccupied == false){
            this.isDirty = true;
            this.isOccupied = true;
            return true;
        }else {
            return false;
        }

    }
    public void checkOut(){
        this.isDirty = false;
    }

    public void cleanRoom(){
        this.isDirty = false;
    }

}
