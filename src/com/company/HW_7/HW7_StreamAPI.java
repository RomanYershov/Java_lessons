package com.company.HW_7;

import java.lang.reflect.Array;
import java.util.*;

import java.util.stream.Stream;

public class HW7_StreamAPI {


    public static void main(String[] args) {

        Stream.iterate(200, n -> n + 2)
                .limit(20).skip(10).sorted((o1, o2) -> o2.compareTo(o1))
                .map(v -> {
                    char arr[] = Integer.toString(v).toCharArray();
                    char resArr[] = new char[arr.length];
                    for (int i = arr.length - 1, j = 0; i >= 0; i--) {
                        resArr[j++] = arr[i];
                    }
                    return new String(resArr);
                }).forEach(System.out::println);





   /*   Collections.reverse(Arrays.asList(arrStr));
        for (String str: arrStr ) {
            System.out.println(str);
        }*/

        /*for (int i = arrStr.length - 1; i >= 0; i-- ) {
            System.out.println(arrStr[i]);
        }*/


        /*Integer a  =  Stream.iterate(1,n -> n + 1)
        .limit(10).reduce(1,(n,n2) -> n + n2);

        Stream.generate(() -> {

            return 1 ;
        });

        System.out.println(a);*/

        String[] strings = new String[]{"hello", "my", "friends"};

        Sorted sorted = (String[] strings1) -> {
            Collections.reverse(Arrays.asList(strings1));
            return strings1;
        };

        for (String str : sorted.sortArray(strings)) {
            System.out.println(str);
        }


    }

}

interface Sorted {
    String[] sortArray(String[] strings);
}
