package BasicExercises.Object_Oriented_Programming;

import java.util.ArrayList;
import java.util.Random;

public class Object_Oriented_Programming15 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса MusicLibrary с коллекцией песен и методов для добавления и
        удаления песен, а также для воспроизведения случайной песни.
         */

//        MusicLibrary musicLibrary = new MusicLibrary();
//
//        Song song1 = new Song("Numb", "Linkin Park");
//        Song song2 = new Song("In the End", "Linkin Park");
//        Song song3 = new Song("Faint", "Linkin Park");
//
//        musicLibrary.addSong(song1);
//        musicLibrary.addSong(song2);
//        musicLibrary.addSong(song3);
//
//        musicLibrary.listOfSongs();
//
//        musicLibrary.randomSong();
    }
}


//class MusicLibrary {
//
//    private ArrayList<Song> songs;
//
//    public MusicLibrary() {
//        this.songs = new ArrayList <Song>();
//    }
//
//    public void addSong(Song song) {
//        songs.add(song);
//    }
//
//    public void removeSong(Song song) {
//        songs.remove(song);
//    }
//
//    public void listOfSongs() {
//
//        System.out.println("List of songs: ");
//        for (Song song : songs) {
//            System.out.println(song.getSongTitle() + ", executor: " + song.getExecutor());
//        }
//    }
//
//    public void randomSong() {
//        Random randomGenerator = new Random();
//        int index = randomGenerator.nextInt(songs.size());
//        System.out.println("\nRandom song:\n" + songs.get(index).getSongTitle() + ", executor: " + songs.get(index).getExecutor());
//    }
//}
//
//class Song {
//
//    private String songTitle;
//    private String executor;
//
//    public Song(String songTitle, String executor) {
//        this.songTitle = songTitle;
//        this.executor = executor;
//    }
//
//    public String getSongTitle() {
//        return songTitle;
//    }
//
//    public void setSongTitle(String songTitle) {
//        this.songTitle = songTitle;
//    }
//
//    public String getExecutor() {
//        return executor;
//    }
//
//    public void setExecutor(String executor) {
//        this.executor = executor;
//    }
//}