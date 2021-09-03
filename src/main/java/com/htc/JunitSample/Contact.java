package com.htc.JunitSample;

public class Contact {
	 private String firstName;
	    private String lastName;
	    private String phoneNumber;

	    public Contact(String firstName, String lastName, String phoneNumber) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phoneNumber = phoneNumber;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void validateFirstName() {
	        if (this.firstName.isEmpty())
	            throw new RuntimeException("First Name Cannot be null or empty");
	    }

	    public void validateLastName() {
	        if (this.lastName.isEmpty())
	            throw new RuntimeException("Last Name Cannot be null or empty");
	    }

	    public void validatePhoneNumber() {
	        if (this.phoneNumber.isEmpty()) {
	            throw new RuntimeException("Phone Name Cannot be null or empty");
	        }

	        if (this.phoneNumber.length() != 10) {
	            throw new RuntimeException("Phone Number Should be 10 Digits Long");
	        }
	        if (!this.phoneNumber.matches("\\d+")) {
	            throw new RuntimeException("Phone Number Contain only digits");
	        }
	        if (!this.phoneNumber.startsWith("9")) {
	            throw new RuntimeException("Phone Number Should Start with 9");
	        }
	    }
	}
