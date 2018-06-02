package com.company.HW_7;

import java.lang.reflect.Array;

import java.util.*;
import java.util.stream.Stream;
import java.math.BigInteger;
import java.util.Optional;
import java.util.function.Supplier;

public class HW7_StreamAPI {


    public static void main(String[] args) {
        System.out.println("Exercise 1:\n");

        Stream.iterate(200, n -> n + 2)
                .limit(20).skip(10)
                .map(v -> {
                    char arr[] = Integer.toString(v).toCharArray();
                    char resArr[] = new char[arr.length];
                    for (int i = arr.length - 1, j = 0; i >= 0; i--) {
                        resArr[j++] = arr[i];
                    }
                    return new String(resArr);
                }).sorted((o1, o2) -> o2.compareTo(o1))
                .forEach(System.out::println);




        int sum = Stream.generate(
                new Supplier<BigInteger>() {
                    private BigInteger first = BigInteger.ZERO;
                    private BigInteger second = BigInteger.ONE;

                    @Override
                    public BigInteger get() {
                        BigInteger newValue = first.add(second);
                        first = second;
                        second = newValue;
                        return newValue;
                    }
                }).mapToInt(BigInteger::intValue)
                .filter(val -> val % 2 == 0)
                .limit(10)
                .sum();


        System.out.println("\nExercise 2: sum = "+sum);
    }
}


