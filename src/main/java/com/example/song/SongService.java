/*

 * You can use the following import statements
  
 * import org.springframework.http.HttpStatus;
 * import org.springframework.web.server.ResponseStatusException;

 */

package com.example.song;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

import com.example.song.Song;
import com.example.song.SongRepository;

// Don't modify the below code
public class SongService implements SongRepository {
    private static HashMap<Integer, Song> playlist = new HashMap<>();

    public SongService() {
        playlist.put(1, new Song(1, "Butta Bomma", "Ramajogayya Sastry", "Armaan Malik", "Thaman S"));
        playlist.put(2, new Song(2, "Kathari Poovazhagi", "Vijay", "Benny Dayal, Swetha Mohan", "A.R. Rahman"));
        playlist.put(3, new Song(3, "Tum Hi Ho", "Mithoon", "Arijit Singh", "Mithoon"));
        playlist.put(4, new Song(4, "Vizhiyil", "Vairamuthu", "Unni Menon", "A.R. Rahman"));
        playlist.put(5, new Song(5, "Nenjame", "Panchu Arunachalam", "S.P.Balasubrahmanyam", "Ilaiyaraaja"));
    }

    // Don't modify the above code

    // Write your code here
    int incrementsongid = 6;

    @Override
    public ArrayList<Song> getallsongs() {
        Collection<Song> one = playlist.values();
        ArrayList<Song> two = new ArrayList<>(one);
        return two;
    }

    @Override
    public Song addsongs(Song addsong) {
        addsong.setsongid(incrementsongid);
        playlist.put(incrementsongid, addsong);
        incrementsongid += 1;
        return addsong;

    }

    @Override
    public Song getparticularsong(int songId) {
        Song outlist = playlist.get(songId);
        if (outlist == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return outlist;
    }

    @Override
    public Song updatesong(int songid, Song getexistingaddedsong) {
        Song getlisth = playlist.get(songid);
        if (getlisth == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        if (getexistingaddedsong.getsongid() != 0) {
            getlisth.setsongid(getexistingaddedsong.getsongid());
        }
        if (getexistingaddedsong.getsongName() != null) {
            getlisth.setsongName(getexistingaddedsong.getsongName());
        }
        if (getexistingaddedsong.getlyricist() != null) {
            getlisth.setlyricist(getexistingaddedsong.getlyricist());

        }
        if (getexistingaddedsong.getsinger() != null) {
            getlisth.setsinger(getexistingaddedsong.getsinger());
        }
        if (getexistingaddedsong.getmusicDirector() != null) {
            getlisth.setmusicDirector(getexistingaddedsong.getmusicDirector());
        }
        return getlisth;
    }

    @Override
    public Song deletesong(int songid) {
        Song listdelete = playlist.get(songid);
        if (listdelete == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            playlist.remove(songid);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }

    }

}