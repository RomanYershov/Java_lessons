package com.company.HW_2;

import java.util.ArrayList;

public class PlayList {
    private String name;
    private ArrayList<Track> playList;

    public PlayList(){
        name = "";
        playList = new ArrayList<>();
    }

    public PlayList(String name){
        this.name = name;
        playList = new ArrayList<Track>();
    }



    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void addTrack(Track track){
        playList.add(track);
    }
    public ArrayList<Track> getTracks(){
        return playList;
    }

    public void show(){
        System.out.println("\nplay list: "+this.name+"\n__________________________________________\n");
        for (int i = 0; i < playList.size(); i++) {
            System.out.println(i+1+". ");
            playList.get(i).info();
        }
    }
}