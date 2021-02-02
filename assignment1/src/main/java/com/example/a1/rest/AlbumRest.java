package com.example.a1.rest;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public interface AlbumRest {
    public CopyOnWriteArrayList<Album> listAlbums();
    public Album getAlbum(String isrc);
    public boolean addAlbum(Album album);
    public boolean updateAlbum(Album album);
    public boolean deleteAlbum(String isrc);

}
