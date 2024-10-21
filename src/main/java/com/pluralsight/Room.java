package com.pluralsight;

public class Room {
    String numberOfBeds;
    float roomPrice;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;

    public Room(String numberOfBeds, float roomPrice, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.roomPrice = roomPrice;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public String getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(String numberOfBeds) {
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
}
