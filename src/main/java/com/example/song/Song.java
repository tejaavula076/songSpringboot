// Write your code here
package com.example.song;

public class Song {
    private int songid;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;

    public Song(int songid, String songName, String lyricist, String singer, String musicDirector) {
        this.songid = songid;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    public int getsongid() {
        return songid;
    }

    public void setsongid(int songid) {
        this.songid = songid;
    }

    public String getsongName() {
        return songName;
    }

    public void setsongName(String songName) {
        this.songName = songName;
    }

    public String getlyricist() {
        return lyricist;
    }

    public void setlyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    public String getsinger() {
        return singer;
    }

    public void setsinger(String singer) {
        this.singer = singer;
    }

    public String getmusicDirector() {
        return musicDirector;
    }

    public void setmusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }

}