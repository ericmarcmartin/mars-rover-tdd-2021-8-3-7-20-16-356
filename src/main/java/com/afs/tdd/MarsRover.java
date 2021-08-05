package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if (command.equals("M")) {
            move();
        }
        if (command.equals("L")) {
            turnLeft();
        }
        if (command.equals("R")) {
            turnRight();
        }
    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        String direction = roverStatus.getDirection();

        if (direction.equals("N")) {
            direction = "E";

            roverStatus = new RoverStatus(locationX, locationY, direction);
            return;
        }
        if (direction.equals("S")) {
            direction = "W";

            roverStatus = new RoverStatus(locationX, locationY, direction);
            return;
        }
        if (direction.equals("E")) {
            direction = "S";

            roverStatus = new RoverStatus(locationX, locationY, direction);
        }
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        String direction = roverStatus.getDirection();

        if (direction.equals("N")) {
            direction = "W";

            roverStatus = new RoverStatus(locationX, locationY, direction);
            return;
        }
        if (direction.equals("E")) {
            direction = "N";

            roverStatus = new RoverStatus(locationX, locationY, direction);
            return;
        }
        if (direction.equals("S")) {
            direction = "E";

            roverStatus = new RoverStatus(locationX, locationY, direction);
            return;
        }
        if (direction.equals("W")) {
            direction = "S";

            roverStatus = new RoverStatus(locationX, locationY, direction);
        }
    }

    private void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        roverStatus = new RoverStatus(locationX, locationY + 1, direction);

        if (direction.equals("S")) {
            roverStatus = new RoverStatus(locationX, locationY - 1, direction);
        }
        if (direction.equals("E")) {
            roverStatus = new RoverStatus(locationX + 1, locationY, direction);
        }
        if (direction.equals("W")) {
            roverStatus = new RoverStatus(locationX - 1, locationY, direction);
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
