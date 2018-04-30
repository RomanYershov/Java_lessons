package com.company.Transport;

/**
 * Created by ЕршовР on 30.04.2018.
 */
public class Automobile extends Transport {
    public Automobile(String name){
        super(name);
    }

    @Override
    public void moveOn() throws TransportException {
        System.out.println("Автомобиль двигается");
        throw new TransportException("sdafsddf");
    }
}
