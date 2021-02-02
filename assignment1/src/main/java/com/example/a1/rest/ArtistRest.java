package com.example.a1.rest;

import java.util.concurrent.CopyOnWriteArrayList;

public interface ArtistRest {
    CopyOnWriteArrayList<Artist> getAllArtists();
    Artist getArtist(String nickName);
    boolean addArtist(Artist artist);
    boolean updateArtist(Artist artist);
    boolean deleteArtist(String nickName);
}
