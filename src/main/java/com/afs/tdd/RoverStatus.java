package com.afs.tdd;

public class RoverStatus {
    private final int locationX;
    private final int locationY;

    public RoverStatus(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public int getLocationY() {
        return locationY;
    }
}
