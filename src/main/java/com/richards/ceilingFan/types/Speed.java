package com.richards.ceilingFan.types;

public enum Speed {
    HIGH(3),
    MEDIUM(2),
    LOW(1),
    OFF(0);

    private final int value;

    private Speed(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
