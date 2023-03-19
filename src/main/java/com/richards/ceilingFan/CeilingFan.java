package com.richards.ceilingFan;

import com.richards.ceilingFan.types.Direction;
import com.richards.ceilingFan.types.Speed;

public class CeilingFan {
    private boolean isOn;
    private int speed;
    private boolean direction;
    private String directionType;
    private final int SPEED_INCREMENT = 1;
    private boolean isChristmas;

    public CeilingFan() {
        this.isOn = true;
        this.speed = Speed.OFF.getValue();
        this.direction = Direction.CLOCKWISE.getDirection();
        this.directionType = Direction.CLOCKWISE.getValue();
        fanInstructions();
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isChristmas() {
        return isChristmas;
    }

    public void setIsChristmas(boolean isChristmas) {
        this.isChristmas = isChristmas;
    }

    public boolean getDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    public String getDirectionType() {
        return directionType;
    }

    public void setDirectionType(String directionType) {
        this.directionType = directionType;
    }

    public int getSPEED_INCREMENT() {
        return SPEED_INCREMENT;
    }

    public void switchOn() {
        this.isOn = true;
        System.out.println("Ceiling Fan switched on.");
    }

    public void switchOff() {
        this.isOn = false;
        this.speed = 0;
        System.out.println("Ceiling Fan switched off.");
    }

    public void fanInstructions() {
        System.out.println("\n*********New Fan Installed*********");
        System.out.println("*********Fan Rotates in two directions: Clockwise and Anticlockwise*********");
        System.out.println("*********Fan operates in three speeds: 1 to 3*********\n");

        System.out.print("\nPress D to pull direction cord\n");
        System.out.print("Press S to pull speed cord\n\n");
    }

    public String pullDirectionCord() {
        this.direction = !this.direction;
        if (this.direction) {
            this.directionType = Direction.CLOCKWISE.getValue();
        } else {
            this.directionType = Direction.ANTICLOCKWISE.getValue();
        }
        return "Fan rotation set to " + this.directionType + " direction with speed " + this.speed;
    }

    /**
     *
     */
    public String pullSpeedCord() {
        if (speed < Speed.HIGH.getValue()) {
            this.speed += SPEED_INCREMENT;
        } else {
            this.speed = Speed.OFF.getValue();
        }
        return "Fan rotating in " + this.directionType + " direction with speed: " + this.speed;
    }

}



