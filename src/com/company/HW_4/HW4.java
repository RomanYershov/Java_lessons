package com.company.HW_4;

//import com.sun.tools.jdeprscan.scan.Scan;

import java.io.*;
import java.util.stream.IntStream;

public class HW4 {
    static String PATH = "C:\\Users\\Tom\\Desktop\\File.txt";


    public static void main(String[] args){
       File file = new File(PATH);


/*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);*/

        try(
                FileWriter fileWriter = new FileWriter(file,true);
                ) {
            fileWriter.write("hello test file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
