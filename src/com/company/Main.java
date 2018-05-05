package com.company;

import com.company.Transport.Automobile;
import com.company.Transport.Bus;
import com.company.Transport.ITransport;
import com.company.Transport.Transport;
import com.company.equalsHash.Person;
import com.company.labrab.Apple;
import com.company.labrab.CostException;
import com.company.labrab.Fruit;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {

        public static void main(String[] args) {
//            Person person1 = new Person("Roman", 12);
//            Person person2 = new Person("Roman", 12);
//
//            System.out.println(person1.equals(person2));
//
//            Automobile auto = new Automobile();
//
//
//            ITransport bus = new Bus();
//            bus.move();
//            System.out.println(bus.someValue);

//            Apple apple = new Apple("apple","green","d", -5);
//            try {
//                apple.checkValid();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//            System.out.println(apple.hashCode());

            ArrayList<Transport> transports = new ArrayList<>();
            transports.add(new Automobile("BMV"));
            transports.add(new Automobile("Ferrary"));





            //System.out.println(((Automobile)transports.get(1)).getName());

            Iterator<? super Transport> transportIterator = transports.iterator();

            for (Transport i: transports) {
                System.out.println(i.getName());
            }

        }
}
