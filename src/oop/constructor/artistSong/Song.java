package oop.constructor.artistSong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Song {
    private String title;
    private Artist artist;
    private Date release;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist.getName();
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getRelease() throws ParseException {
        String oldFormat = "yyyy-MM-dd";
        String newFormat = "dd MMMM yyyy";

        SimpleDateFormat dateFormat = new SimpleDateFormat(oldFormat);
        String strRelease = dateFormat.format(this.release);

        Date dateRelease = dateFormat.parse(strRelease);
        dateFormat.applyPattern(newFormat);
        strRelease = dateFormat.format(dateRelease);

        return strRelease;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public Song(String title, Artist artist, String _release) throws ParseException {
        this.title = title;
        this.artist = artist;
        this.release = new SimpleDateFormat("yyyy-MM-dd").parse(_release);
    }

    public void displayInfo() throws ParseException {
        System.out.println("Title\t:\t" + getTitle());
        System.out.println("Artist\t:\t" + getArtist());
        System.out.println("Release :\t" + getRelease());

        Date date = new Date();
        LocalDate nowDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate tmp = this.release.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int yearDiff = nowDate.getYear() - tmp.getYear();
        System.out.println("Artist age is " + (this.artist.getAge() - yearDiff) + " When song released");
    }
}
