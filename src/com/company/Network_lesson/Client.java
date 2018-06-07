package com.company.Network_lesson;

import java.io.*;
import java.net.Socket;
import java.net.SocketAddress;

public class Client {
    public static void main(String[]args){
        try (Socket client = new Socket("192.168.43.83", 11000);
             PrintWriter server = new PrintWriter(client.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
             BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));) {

            String message;
            server.println(fromUser.readLine());
            while (true) {
                message = reader.readLine();
                if (message != null && message.equalsIgnoreCase("bye")) {
                    break;
                } else {
                    System.out.println(message);
                    server.println(fromUser.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
