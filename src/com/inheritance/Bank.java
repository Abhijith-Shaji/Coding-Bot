package com.inheritance;

import java.util.scanner;


public class Bank {
	private int[] validPins = {1001, 1234, 1212};

    public boolean validatePin(int pin) {
        for (int validPin : validPins) {
            if (validPin == pin) {
                return true;
            }
        }
        return false;
    }
}

class User {
    private int pin;

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
}


