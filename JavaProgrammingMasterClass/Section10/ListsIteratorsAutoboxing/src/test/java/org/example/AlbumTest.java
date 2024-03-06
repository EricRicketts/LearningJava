package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class AlbumTest {

    ArrayList<Album> albums = new ArrayList<>();
    LinkedList<Song> playList;

    @BeforeEach
    public void setUp() {
        playList = new LinkedList<>();
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);
    }

    @Test
    public void testAddNonExistingSong() {
        Assertions.assertTrue(albums.get(0).addSong("Foo Bar", 7.05));
    }

    @Test
    public void testAddExistingSong() {
        Assertions.assertFalse(albums.get(1).addSong("Snowballed", 4.51));
    }

    @Test
    public void testAddExistingSongToPlaylistByName() {
        Assertions.assertTrue(albums.get(0).addToPlayList("Holy man", playList));
    }

    @Test
    public void testAddNonExistentSongToPlayListByName() {
        Assertions.assertFalse(albums.get(0).addToPlayList("Knowing Me, Knowing You", playList));
    }

    @Test
    public void testAddExistingSongToPlaylistByTrackNumber() {
        Assertions.assertTrue(albums.get(1).addToPlayList(3, playList));
    }

    @Test
    public void testAddNonExistentSongToPlaylistByTrackNumber() {
        Assertions.assertFalse(albums.get(1).addToPlayList(24, playList));
    }

    @Test
    public void testLowerEdgeCase() {
        Assertions.assertTrue(albums.get(0).addToPlayList(1, playList));
    }

    @Test
    public void testUpperEdgeCase() {
        Assertions.assertTrue(albums.get(1).addToPlayList(9, playList));
        Assertions.assertFalse(albums.get(1).addToPlayList(10, playList));
    }

}
