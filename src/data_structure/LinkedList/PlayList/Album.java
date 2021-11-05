package data_structure.LinkedList.PlayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration){
        if(findSong(songTitle) != null){
            return false;
        } else {
            Song newSong = new Song(songTitle,duration);
            songs.add(newSong);
            return true;
        }
    }

    private Song findSong(String songTitle){
        for(int i = 0; i < songs.size(); i++){
            String find = songs.get(i).getTitle();
            if(find.equals(songTitle)){
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        if(trackNumber <=0) {
            return false;
        } else {
            Song song = songs.get(trackNumber - 1);
            playlist.add(song);
            return true;
        }
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist){
        Song song = findSong(songTitle);
        if(findSong(songTitle) == null){
            return false;
        } else {
            playlist.add(song);
            return true;
        }
    }

}
