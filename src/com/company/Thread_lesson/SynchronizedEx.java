package com.company.Thread_lesson;

import com.company.HW_2.MP3player;
import com.company.labrab.Apple;

public class SynchronizedEx {
    private static MP3player mp3player = new MP3player();


    public static void main(String[] args) {
        Runnable r = () -> {
        synchronized (mp3player){
            for (int i = 1; i <= 3; i++) {
                mp3player.createPlayList("live" + " " + i);
            }
        }


        };
        Runnable r2 = () -> {
            synchronized (mp3player) {
                mp3player.createPlayList("Relax");
            }


        };
        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r2);
        Thread thread3 = new Thread(r2);
        Thread thread4 = new Thread(r);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mp3player.showAllPlaylists();


    }

}
