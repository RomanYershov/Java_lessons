package com.company.StreamAPI_lesson;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {


    static final String[] automobiles = new String[]{"125.5, ferrary",
            "12, Wolkswagen",
            "65000, Rocket",
            "234, BMW",
            "300, Audi"};


    public static void main(String[] args) {

        int result = IntStream.range(0, 200)
                .filter(val -> val % 2 == 0)
                .filter(val -> val % 3 == 0)
                .sum();
        System.out.println(result);

//        Arrays.stream(automobiles).map(s -> {
//            String arr[] = s.split(",");
//            return new Auto(Double.parseDouble(arr[0]), arr[1]);
//        })
//                .sorted(((o1, o2) -> o2.getSpeed().compareTo(o1.getSpeed())))
//                .forEach(auto -> System.out.println(auto.getMark()));
    }


}

class Auto {
    private Double speed;
    private String mark;

    public Auto(Double speed, String mark) {
        this.speed = speed;
        this.mark = mark;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
