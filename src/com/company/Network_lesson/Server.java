package com.company.Network_lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(11000);
            ServerThread serverThread = new ServerThread(serverSocket);
            while (true)
                new Thread(serverThread).start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class ServerThread implements Runnable {
    private Socket accept;
    private ServerSocket server;

    public ServerThread(ServerSocket server) {
        this.server = server;
    }

    @Override
    public void run() {
//        Map<String, String> stringMap = new HashMap<>();
//        stringMap.put("Hello", "Hi");
//        stringMap.put("blablabla", "aaaaaaa");
        try {
            accept = server.accept();
            while (true) {
                try (
                        BufferedReader reader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                        PrintWriter writer = new PrintWriter(accept.getOutputStream(), true);
                ) {
                    String message;
                    while (true) {
                        message = reader.readLine();
                        if (message != null && message.equalsIgnoreCase("bye")) {
                            writer.println("bye");
                            break;
                        } else {
                            writer.println("Server return: " + message);
                        }
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




