package com.example.song;

import java.util.*;
import com.example.song.Song;

public interface SongRepository {
    ArrayList<Song> getallsongs();

    Song addsongs(Song addsong);

    Song getparticularsong(int songId);

    Song updatesong(int songid, Song getexistingaddedsong);

    Song deletesong(int songid);
}
// Write your code here