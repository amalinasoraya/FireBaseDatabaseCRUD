package com.example.amalinasoraya.firebasedatabasecrud;

/**
 * Created by amalinasoraya on 02/11/2017.
 */

public class Artist {
    String artistId;
    String artistName;

    public Artist(){}

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
