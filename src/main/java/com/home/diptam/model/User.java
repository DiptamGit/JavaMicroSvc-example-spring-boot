package com.home.diptam.model;

public class User {

    private String firstName;
    private String lastName;
    private String role;
    private String hostName;

    public User(){}

    public User(String firstName, String lastName, String role, String hostName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.hostName = hostName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }


}
