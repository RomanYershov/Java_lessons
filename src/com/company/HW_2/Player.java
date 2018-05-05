package com.company.HW_2;

import java.util.ArrayList;

public abstract class Player {
    private ArrayList<PlayList> playLists;
    private String name;

    public void play(Track track) throws AudioFormatException{
        track.info();
        System.out.print("<< PLAY >>");
    }

    public void createPlayList(String name, Track ...tracks){
        playLists = new ArrayList<PlayList>();
        PlayList playList = new PlayList(name);
        if(tracks.length > 0){
            for (Track track: tracks ) {
                playList.addTrack(track);
            }
        }
        playLists.add(playList);
    }

    public ArrayList<PlayList> getPlayLists(){
        return playLists;
    }

    public void addTrack(PlayList playList, Track track){
        playList.addTrack(track);
    }
}
