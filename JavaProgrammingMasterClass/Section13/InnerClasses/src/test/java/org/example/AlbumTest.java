package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AlbumTest {

    private List<Album> albums = new ArrayList<>();
    private LinkedList<Song> playList = new LinkedList<>();

    @BeforeEach
    public void setUp() {
        Album firstAlbum = new Album("Stormbringer", "Deep Purple");
        firstAlbum.addSong("Stormbringer", 4.6);
        firstAlbum.addSong("Love don't mean a thing", 4.22);
        firstAlbum.addSong("Holy man", 4.3);
        firstAlbum.addSong("Hold on", 5.6);
        firstAlbum.addSong("Lady double dealer", 3.21);
        firstAlbum.addSong("You can't do it right", 6.23);
        firstAlbum.addSong("High ball shooter", 4.27);
        firstAlbum.addSong("The gypsy", 4.2);
        firstAlbum.addSong("Soldier of fortune", 3.13);
        albums.add(firstAlbum);

        Album secondAlbum = new Album("For those about to rock", "AC/DC");
        secondAlbum.addSong("For those about to rock", 5.44);
        secondAlbum.addSong("I put the finger on you", 3.25);
        secondAlbum.addSong("Lets go", 3.45);
        secondAlbum.addSong("Inject the venom", 3.33);
        secondAlbum.addSong("Snowballed", 4.51);
        secondAlbum.addSong("Evil walks", 3.45);
        secondAlbum.addSong("C.O.D.", 5.25);
        secondAlbum.addSong("Breaking the rules", 5.32);
        secondAlbum.addSong("Night of the long knives", 5.12);
        albums.add(secondAlbum);

        playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
//        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
    }

    @Test
    public void testFirstAlbumGetters() {
        Album firstAlbum = albums.getFirst();
        String[] expected = {"Stormbringer", "Deep Purple"};
        String[] actual = {firstAlbum.getName(), firstAlbum.getArtist()};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSecondAlbumGetters() {
        Album lastAlbum = albums.getLast();
        String[] expected = {"For those about to rock", "AC/DC"};
        String[] actual = {lastAlbum.getName(), lastAlbum.getArtist()};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testHeadOfPlayList() {
        Song firstSong = playList.getFirst();
        String[] expected = {"You can't do it right", "6.23"};
        String[] actual = {firstSong.getTitle(), String.valueOf(firstSong.getDuration())};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTailOfPlayList() {
        Song lastSong = playList.getLast();
        String[] expected = {"I put the finger on you", "3.25"};
        String[] actual = {lastSong.getTitle(), String.valueOf(lastSong.getDuration())};
        assertArrayEquals(expected, actual);
    }
}
