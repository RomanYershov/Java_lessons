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
        } catch (IOException e) {
            e.printStackTrace();
        }
        ServerThread serverThread = new ServerThread(new Socket());
        new Thread(serverThread).start();
    }
}

class ServerThread implements Runnable {
    private Socket accept;

    public ServerThread(Socket socket) {
        accept = socket;
    }

    @Override
    public void run() {
        ServerSocket server;
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Hello", "Hi");
        stringMap.put("blablabla", "aaaaaaa");
        try {
            server = new ServerSocket(11000);
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
                            writer.println("Server return: " + stringMap.get(message));
                        }
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




