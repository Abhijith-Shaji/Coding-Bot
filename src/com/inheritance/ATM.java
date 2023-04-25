package com.inheritance;


public class ATM {
	 public static void main(String[] args) {
	        Bank bank = new Bank();
	        User user = new User();
	        Scanner sc = new Scanner(System.in);

	        // Set pin from User class
	        System.out.print("Enter a PIN to set: ");
	        int pinToSet = sc.nextInt();
	        user.setPin(pinToSet);
	        System.out.println("PIN set successfully.");

	        // Validate pin from Bank class
	        System.out.print("Enter PIN for validation: ");
	        int pinToValidate = sc.nextInt();
	        if (bank.validatePin(pinToValidate)) {
	            System.out.println("PIN is valid.");
	        } else {
	            System.out.println("PIN is invalid.");
	        }

	        sc.close();
	    }
	}

