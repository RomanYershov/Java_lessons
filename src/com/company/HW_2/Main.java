package com.company.HW_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        MP3player player = new MP3player();

        Track track = new Track("Somesing", "Perl", "MP3",new Group("PinkFloyd","Rock"),1990, 34.3);
        Track track1 = new Track("Somesing", "Perl","mp3", new Group("Nirvana","Rock"),1998, 4.3);
        Track track2 = new Track("Tom Day- Haw are you?", "How are you?", "audio",new Group("Tom Day","Pop music"),2017, 4.0);



        player.createPlayList("My songs", track, track1);
        player.getPlayLists().get(0).addTrack(track2);

        player.getPlayLists().get(0).show();



        for (Track tr: player.getPlayLists().get(0).getTracks()) {
            try {
                player.play(tr);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }

        }
    }
}
