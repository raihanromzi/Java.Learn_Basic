package oop.classesConcept.musicApp;

public class DriverAlbum {
    public static void main(String[] args) {
        Song song1 = new Song();
        Song song2 = new Song();

        song1.setTitle("Melukis Senja");
        song1.setArtist("Budi Doremi");
        song1.setDuration(240);

        song2.setTitle("Photograph");
        song2.setArtist("Ed Sheeran");
        song2.setDuration(274);

        Album albumA = new Album();

        albumA.setTitle("Pernah Hits");
        albumA.setTotalSongs(2);
        albumA.setYear(2021);

        albumA.addSong(song1);
        albumA.addSong(song2);

        albumA.displayInfo();
    }
}
