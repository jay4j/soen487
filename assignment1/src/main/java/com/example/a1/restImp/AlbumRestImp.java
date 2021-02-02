package com.example.a1.restImp;

import com.example.a1.rest.Album;
import com.example.a1.rest.AlbumRest;
import com.example.a1.rest.Artist;
import java.util.concurrent.CopyOnWriteArrayList;


public class AlbumRestImp implements AlbumRest {
    public static CopyOnWriteArrayList<Album> albumList = new CopyOnWriteArrayList<>() ;
    static{

        Artist taylor = ArtistRestImp.getArtistByName("Taylor Alison Swift");
        Artist katy = ArtistRestImp.getArtistByName("Katy Perry");

        albumList.add(new Album("Reputation","After a tough time with the media, Swift’s tucked away in her" +
                " bunker for Reputation, firing shots at the world with songs like ‘This Is Why We Can’t Have Nice Things’ " +
                "and ‘Look What You Made Me Do’. Swift is putting as much effort into self-expression as into crafting" +
                " good songs and Reputation ends up as a disorienting mix of pop songs and darker, more personal material. " +
                "I listen to Reputation more than her early country albums, but it’s a little disappointing after two" +
                "near-perfect pop albums.","2017","Taylor Alison Swift"));
        albumList.add(new Album(" Speak Now","2010’s Speak Now is notable as the album that Swift wrote " +
                "alone, without any collaborators. Speak Now is a fan favourite on account of personal songs like ‘Dear John’" +
                " and ‘Back to December’, but it’s also in need of an editor as its fourteen songs stretch out to nearly " +
                "70 minutes.There’s plenty of strong material within the long running time, like the punchy ‘Mine’ and " +
                "the pretty balladry of ‘Enchanted’.","2010","Taylor Alison Swift"));
        albumList.add(new Album("Witness","Witness is the latest studio album from Perry, just released this past June. " +
                "From the start, it received mix reviews from critics and fans alike. Ramping up to its release, Perry " +
                "dropped three singles: “Chained to the Rhythm,” “Bon Appetit” and “Swish Swish.","2017","Katy Perry"));
        albumList.add(new Album("One of the Boys","With all that she’s accomplished (and given how " +
                "ubiquitous she is across fashion and pop culture these days), it’s hard to believe that Perry has only " +
                "released four studio albums.dropped three singles: “Chained to the Rhythm,” “Bon Appetit” and “Swish Swish.",
                "2008","Katy Perry"));
    }
    @Override
    public CopyOnWriteArrayList<Album> listAlbums() {
        return albumList;
    }

    @Override
    public Album getAlbum(String isrc) {
        for(int i = 0; i < albumList.size();i++){
            if(albumList.get(i).getIsrc().equals(isrc)) return albumList.get(i);
        }
        return null;
    }

    @Override
    public boolean addAlbum(Album album) {
        for(int i = 0; i < albumList.size();i++){
            if(albumList.get(i).getIsrc().equals(album.getIsrc())) return false;
        }
        albumList.add(album);
        return true;
    }

    @Override
    public boolean updateAlbum(Album album) {
        int index = -1;
        for(int i = 0; i < albumList.size();i++){
            Album target = albumList.get(i);
            if(target.getIsrc().equals(album.getIsrc())){
                index = i;
                albumList.set(i,album);
                break;
            }
        }
        return index == -1 ? false : true;
    }

    @Override
    public boolean deleteAlbum(String isrc) {
        int index = -1;
        for(int i = 0; i < albumList.size();i++){
            Album target = albumList.get(i);
            if(target.getIsrc().equals(isrc)){
                index = i;
                albumList.remove(i);
                break;
            }
        }
        return index == -1 ? false : true;
    }
}
