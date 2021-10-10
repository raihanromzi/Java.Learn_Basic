package oop.constructor.artistSong;

import java.text.ParseException;

public class DriverSong {
    public static void main(String[] args) throws ParseException {
        Artist a1 = new Artist("Budi doremi", "1984-09-19");
        Artist a2 = new Artist("Ed sheeran", "1991-02-17");

        a1.displayInfo();
        System.out.println("");
        a2.displayInfo();

        Song song1 = new Song("Melukis Senja", a1, "2020-06-29");
        Song song2 = new Song("Photograph",a2,"2015-05-10");

        System.out.println("");
        System.out.println("");
        song1.displayInfo();
        System.out.println("");
        song2.displayInfo();
    }

}
