package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.SongService;
import com.example.song.Song;
/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
@RestController
public class SongController {
    SongService a = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getallsongs() {
        return a.getallsongs();
    }

    @PostMapping("/songs")
    public Song addsongs(@RequestBody Song addsong) {
        return a.addsongs(addsong);
    }

    @GetMapping("/songs/{songId}")
    public Song getparticularsong(@PathVariable("songId") int songid) {
        return a.getparticularsong(songid);
    }

    @PutMapping("/songs/{songId}")
    public Song updatesong(@PathVariable("songId") int songid, @RequestBody Song getexistingaddedsong) {
        return a.updatesong(songid, getexistingaddedsong);
    }

    @DeleteMapping("/songs/{songId}")
    public Song deletesong(@PathVariable("songId") int songid) {
        return a.deletesong(songid);
    }

}
