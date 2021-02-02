package com.example.a1.rest;

import java.util.UUID;

public class Album {
    String isrc;
    String title;
    String description;
    String year;
    String artist;

    public Album(){
        this.isrc = createIsrc();
    }
    public Album(String isrc, String title, String description, String year, String artist) {
        this.isrc = isrc;
        this.title = title;
        this.description = description;
        this.year = year;
        this.artist = artist;
    }

    public Album(String title, String description, String year, String artist) {
        this.title = title;
        this.description = description;
        this.year = year;
        this.artist = artist;
        this.isrc = createIsrc();
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "isrc='" + isrc + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", year='" + year + '\'' +
                ", artist=" + artist +
                '}';
    }
    public String createIsrc(){
        return UUID.randomUUID().toString().substring(0,12);
    }
}
