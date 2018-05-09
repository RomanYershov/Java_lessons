package com.company.HW_2;

import java.util.ArrayList;

public abstract class Player {
    private ArrayList<PlayList> playLists;
    private String name;

    public Player(){
        playLists = new ArrayList<PlayList>();
    }

    public void play(Track track) throws AudioFormatException{
        track.info();
        System.out.print("<< PLAY >>");
    }

    public void createPlayList(Track ...tracks){
        PlayList playList = new PlayList();
        playList.setName("playlist_"+playLists.size());
        if(tracks.length > 0){
            for (Track track: tracks ) {
                playList.addTrack(track);
            }
        }
        playLists.add(playList);
    }

    public boolean createPlayList(String name, Track ...tracks){
        int i = 0, size = playLists.size();
        for ( i = 0; i< size; i++){
            if (playLists.get(i).getName().equals(name))
                break;
        }
        if(i < size){
            return false;
        }
        PlayList playList = new PlayList(name);
        if(tracks.length > 0){
            for (Track track: tracks ) {
                playList.addTrack(track);
            }
        }
        playLists.add(playList);
        return true;
    }

    public  ArrayList<PlayList> getPlayLists(){
        return playLists;
    }

    public void showAllPlaylists(){
        for (PlayList playList: playLists) {
            System.out.println(playList.getName()+"\n");
        }
    }

    public boolean addTrack(PlayList playList, Track ...tracks){
        if(tracks.length == 0)
            return false;
        for (Track track:tracks) {
            playList.addTrack(track);
        }
        return true;
    }
}
