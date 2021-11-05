package oop.classesConcept.musicApp;

public class Song {
    private String title;
    private String artist;
    private int duration;

    public void setArtist(String artist) {
        if(!artist.isEmpty()){
            this.artist = artist;
        } else {
            System.out.println("Cannot empty");
        }
    }

    public void setDuration(int duration) {
        if(duration > 0 && duration < 300){
            this.duration = duration;
        } else {
            System.out.println("No duration");
        }
    }

    public void setTitle(String title) {
        if(!title.isEmpty()){
            this.title = title;
        } else {
            System.out.println("Cannot empty");
        }
    }

    public void getDuration() {
        int a = this.duration % 60;
        int b = this.duration / 60;
        int c = b % 60;
        b = b / 60;
        System.out.println("Duration   : "+ c + ":" + a);
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public void play(){
        if(duration > 0 && duration < 120){
            System.out.println("Short");
        } else if(duration >= 120 && duration <= 240){
            System.out.println("Intermediate");
        } else if(duration > 240){
            System.out.println("Long");
        }
    }
}
