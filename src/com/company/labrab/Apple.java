package com.company.labrab;

import com.company.Transport.ValidFruitException;

/**
 * Created by ЕршовР on 30.04.2018.
 */
public class Apple extends Fruit {
    private String sort;
    private int cost;

    public Apple(String name, String color, String sort, int cost) {
        super(name, color);
        this.sort = sort;
        this.cost = cost;
    }

    public String getSort(){
        return sort;
    }

    public int getCost(){
        return cost;
    }

    public int hashCode(){
        return getName().hashCode()+getColor().hashCode()+getSort().hashCode()+cost;
    }

    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if(obj.getClass() != getClass())
            return false;

        Apple eqApple = (Apple)obj;

        return  eqApple.getName().equals(getName())
                && eqApple.getColor().equals(getColor())
                && eqApple.getSort().equals(getSort())
                &&getCost() == cost;

    }

    public void checkValid() throws ValidFruitException{
      if(sort.isEmpty() || cost < 0){
          throw new ValidFruitException("Некорректные данные");
      }
        else System.out.println("Яблоко");
    }
}
