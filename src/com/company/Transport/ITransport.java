package com.company.Transport;

/**
 * Created by ЕршовР on 30.04.2018.
 */
public interface ITransport {
    String someValue = "Const";
    default void move(){
        try {
            moveOn();
        }catch (TransportException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Транспорт начал движуху");
    };
    public void moveOn() throws TransportException;
}
