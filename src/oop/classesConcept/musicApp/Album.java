package oop.classesConcept.musicApp;

public class Album {
    private String title;
    private int year;
    private int track;
    public Song[] songs;

    public void setTitle(String title) {
        if(title.isEmpty()){
            System.out.println("Cannot empty");
        } else {
            this.title = title;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        if (!title.isEmpty()) {
            return this.title;
        } else {
            return "Cannot empty";
        }
    }

    public void setTotalSongs(int tot){
        songs = new Song[tot];
    }

    public int getYear() {
        return year;
    }

    public void addSong(Song song) {
        songs[track] = song;
        track++;
    }

    public void displayInfo() {
        System.out.println("Album Info");
        System.out.println("Title : " + getTitle());
        System.out.println("Year : " + getYear());
        System.out.println();
        System.out.println("Song list");
        for (int i = 0; i < songs.length; i++) {
            System.out.println("Title      : " + songs[i].getTitle());
            System.out.println("Artist     : " + songs[i].getArtist());
            songs[i].getDuration();
            System.out.print("Category   : "); songs[i].play();
            System.out.println();
        }
    }
}
