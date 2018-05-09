package com.company.tests;

public class testmain {
    public static void main(String[] args){

      MyArrayList arrayList = new MyArrayList();
      MyArrayList arrayList2 = new MyArrayList(1,2,3,5,6,7,8,9,4,5,456,5,4);
        arrayList.add(5);
        arrayList.add(123);
        arrayList.set(5, 226);
        System.out.println(arrayList.get(0));

        for (int i = 0; i < arrayList2.getSize(); i++) {
            System.out.println(arrayList2.get(i));
        }

    }

    static int sum(int ...num){
        int sum = 0;
        for (int n:num ) {
            sum += n;
        }
        return sum;
    }

    static int factorial(int x){

        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }


}
