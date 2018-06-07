package com.company.HW_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Client {
    public static void main(String[]args) throws IOException {
        URL mailru = new URL("https://mail.ru ");
        URLConnection urlConnection = mailru.openConnection();
        InputStream inputStream = urlConnection.getInputStream();


        withUrlConnection(mailru);
    }

    public static void withHTTPUrlConnection(URL url) throws IOException {
        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
        System.out.println(httpConnection.getRequestMethod());
        System.out.println(httpConnection.getResponseMessage());

        Map<String, List<String>> hdrMap = httpConnection.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nДaлee следует заголовок :");
        for (String k : hdrField) {
            System.out.println("Kлюч : " + k + " Значение: " +
                    hdrMap.get(k));
        }
    }

    public static void withUrlConnection(URL url) throws IOException {
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String str;
        int i = 0;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
            if (++i == 10) {
                break;
            }
        }
    }
}
