package com.example.a1.rest;

public class Artist {
    String nickName;
    String firstName;
    String lastName;
    String bio;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Artist(String nickName, String firstName, String lastName, String bio) {
        this.nickName = nickName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }

    public Artist(){}

    @Override
    public String toString() {
        return "Artist{" +
                "nickName='" + nickName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}
