package com.company.equalsHash;



/**
 * Created by ЕршовР on 30.04.2018.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public int hashCode(){
        return name.hashCode()+age;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj.getClass() != getClass())
            return false;
        Person person = (Person)obj;

        return person.getName().equals(name)&&person.getAge()==age;
    }
}
