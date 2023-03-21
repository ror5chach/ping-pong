package com.apanicker.pingpong.model;

public class AddUserRequest {

    private final String firstName;
    private final String lastName;

    public AddUserRequest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
