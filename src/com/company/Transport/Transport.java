package com.company.Transport;

/**
 * Created by ЕршовР on 30.04.2018.
 */
public abstract class Transport {
    private String name;
    public Transport(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move() throws Exception{
        System.out.println("Транспорт начал движуху!!!");
        moveOn();
    }

    public abstract void moveOn() throws Exception;
}
