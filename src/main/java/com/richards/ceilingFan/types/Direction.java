package com.richards.ceilingFan.types;

public enum Direction {

    CLOCKWISE(true, "clockwise"),
    ANTICLOCKWISE(false, "anticlockwise");
    private final String value;
    private final boolean direction;

    private Direction(boolean direction, String value) {
        this.value = value;
        this.direction = direction;
    }

    public String getValue() {
        return value;
    }

    public boolean getDirection() {
        return direction;
    }

}
