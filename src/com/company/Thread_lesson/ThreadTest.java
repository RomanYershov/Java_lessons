package com.company.Thread_lesson;

import com.company.HW_2.AudioFormatException;
import com.company.HW_2.PlayList;
import com.company.HW_2.Player;
import com.company.HW_2.Track;

import java.util.ArrayList;

public class ThreadTest extends Thread {
    @Override
    public  void run(){
        int i = 0;
        while (i < 100){
            System.out.println("test");
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
    ThreadTest myThread = new ThreadTest();

    myThread.start();



        int i = 0;
        while (i < 100){
            System.out.println("main");
            myThread.sleep(200);
            i++;
        }
    }
}

class NewThread implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while (i <= 10){
            System.out.println(i);
            ++i;
        }
    }

    NewThread thread = new NewThread(){
      public void run(){

        }
    };

    public static void main(String[] args){
//        Runnable newThread = new NewThread();
//        Thread t = new Thread(newThread);
       // t.start();

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Вывод строки ");
//            }
//        };

//        Runnable run = () -> {
//            System.out.println("Вывод строки ");
//
//        };
//
//        new Thread(run);
       // new Thread(() -> System.out.println("Вывод строки 1")).start();
        //new Thread(NewThread::someMethod).start();//ссылка на метод
    }

    public static void someMethod(){
        System.out.println("Вывод строки 2");
    }

}
