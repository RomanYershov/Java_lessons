package com.company.HW_6;

 class MyCounter{
    public int x;

    public MyCounter(int x){
        this.x = x;
    }
}

public class HW_Thread {
    private static MyCounter count = new MyCounter(0);


    public static  void counter2() {
        Runnable run = () -> {
           synchronized (count){
               for (int i = 0; i < 10; i++) {
                   System.out.println(count.x--);
               }
           }
        };
        new Thread(run).start();
    }

    public static void counter() {
          Runnable run_1 = () -> {
              synchronized (count){
                  for (int i = 0; i < 10; i++) {
                      System.out.println(++count.x);
                  }
              }
        };
        new Thread(run_1).start();
    };




    public static void main(String[] args) {
       counter();
       counter2();
    }
}
