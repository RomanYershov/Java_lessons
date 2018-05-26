package com.company.HW_6;

import java.nio.file.Files;
import java.nio.file.Path;

public class HW_Thread {
    private static Integer count = 0;
    public static void main(String[] args){
        Runnable run_1 = () -> {
            synchronized (count){
                for (int i = 0; i < 10; i++){
                    System.out.println(++count);
                }
            };
        };

        Runnable run_2 = () -> {
            synchronized (count){
                for (int i = 0; i < 10; i++){
                    System.out.println(count--);
                }
            };
        };

        new Thread(run_1).start();
        new Thread(run_2).start();
    }
}
