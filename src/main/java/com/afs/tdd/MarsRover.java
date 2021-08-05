package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if (command.length() > 1) {
            executeCommands(command);
        }
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

    private void executeCommands(String command) {
        char[] commandArray = command.toCharArray();
        for(char commandChar : commandArray){
            executeCommand(String.valueOf(commandChar));
        }
    }

    private void turnRight() {
        locationX = roverStatus.getLocationX();
        locationY = roverStatus.getLocationY();
        direction = roverStatus.getDirection();

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
        if (direction.equals("W")) {
            direction = "N";

            roverStatus = new RoverStatus(locationX, locationY, direction);
        }
    }

    private void turnLeft() {
        locationX = roverStatus.getLocationX();
        locationY = roverStatus.getLocationY();
        direction = roverStatus.getDirection();

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
        locationX = roverStatus.getLocationX();
        locationY = roverStatus.getLocationY();
        direction = roverStatus.getDirection();

        if (direction.equals("S")) {
            roverStatus = new RoverStatus(locationX, --locationY, direction);
        }
        if (direction.equals("N")) {
            roverStatus = new RoverStatus(locationX, ++locationY, direction);
        }
        if (direction.equals("E")) {
            roverStatus = new RoverStatus(++locationX, locationY, direction);
        }
        if (direction.equals("W")) {
            roverStatus = new RoverStatus(--locationX, locationY, direction);
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
