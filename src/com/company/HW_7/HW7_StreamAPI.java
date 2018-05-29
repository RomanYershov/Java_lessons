package com.company.HW_7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HW7_StreamAPI {
    public static void main(String[] args) {
        Stream.iterate(200, n -> n + 2)
                .limit(20).skip(10)
                .map(v -> {
                    char arr[] = Integer.toString(v).toCharArray();
                    char resArr[] = new char[arr.length];
                    for (int i = arr.length - 1, j = 0; i >= 0; i--) {
                        resArr[j++] = arr[i];
                    }
                    return new String(resArr);
                })
                .forEach(System.out::println);


//        IntStream.range(200, 300)
//                .filter(value -> value % 2 == 0)
//                .limit(20).skip(10)
//                .map(v -> {
//                    char arr[] = Integer.toString(v).toCharArray();
//                    char resArr[] = new char[arr.length];
//                    for (int i = arr.length - 1, j = 0; i >= 0; i--) {
//                        resArr[j++] = arr[i];
//                    }
//                    String res = new String(resArr);
//
//                    return Integer.parseInt(res);
//                })
//              .forEach(value -> System.out.println(value));


    }
}
