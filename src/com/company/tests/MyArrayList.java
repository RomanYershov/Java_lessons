package com.company.tests;

public class MyArrayList {
    private int size;
    private int [] array;

 /*   public MyArrayList(){
        size = 1;
        array = new int[size];
    }*/
    public MyArrayList(int size){
        if(size <= 0)size = 1;
        array = new int[size];
        this.size = size;
    }
    public MyArrayList(int ...nums){
        array = nums;
        size = nums.length;
    }


    public int getSize() {
        return size;
    }

    public void set(int index, int el){
        if(index < 0 || index >= size)return;
        array[index] = el;
    }



    public int get(int index){
        if(size == 0) return 0;
        if(index < 0 || index >= size)
            index = 0;
        return array[index];
    }

    public void add(int el){
        int [] newArr = new int[size + 1];
        for (int i = 0; i < size; i++){
            newArr[i] = array[i];
        }
        newArr[size] = el;
        ++size;
        array = newArr;
    }

    public void remove(){

    }
}
