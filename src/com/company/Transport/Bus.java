package com.company.Transport;

/**
 * Created by ЕршовР on 30.04.2018.
 */
public class Bus implements ITransport {
    @Override
    public void moveOn() throws TransportException {
        System.out.println("Автобус поехал");
    }
}
