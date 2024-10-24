package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkInRoom_ifNotDirty_notOccupied(){
        Room room = new Room();

        room.setDirty(false);
        room.setOccupied(false);
        boolean result = room.checkIn();

        assertTrue(result);
    }
    @Test
    public void checkInRoom_failsIfDirty(){
        Room room = new Room();

        room.setDirty(true);
        room.setOccupied(false);
        boolean result = room.checkIn();

        assertFalse(result);
    }

    @Test
    void checkOut_occupiedRoom_() {
    }

    @Test
    void checkOut_occupiedRoom_failure() {
    }

    @Test
    void checkOut_occupiedRoom_successful() {
    }

    @Test
    void cleanRoom() {
    }


}