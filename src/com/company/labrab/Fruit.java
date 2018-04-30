package com.company.labrab;

import com.company.Transport.ValidFruitException;

/**
 * Created by ЕршовР on 30.04.2018.
 */
public abstract class Fruit {
    private String name;
    private String color;

    public Fruit(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public abstract void checkValid() throws ValidFruitException;

}
