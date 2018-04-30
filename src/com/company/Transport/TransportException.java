package com.company.Transport;

/**
 * Created by ЕршовР on 30.04.2018.
 */
public class TransportException extends Exception {
    public TransportException(String message){
        super(message);
        System.out.println("Ошибка при работе с транспортом");
    }
}
