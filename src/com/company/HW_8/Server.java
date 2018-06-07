package com.company.HW_8;

//import jdk.internal.jline.internal.InputStreamReader;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class Server {
    public static void main(String[]args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(11000);
            Socket accept = serverSocket.accept();
            while (true){
                try (BufferedReader reader = new BufferedReader(new  InputStreamReader(accept.getInputStream()));
                     PrintWriter writer = new PrintWriter(accept.getOutputStream(), true);){
                         String message;

                         do{
                             message = reader.readLine();
                             writer.println("Ответ сервера \"" + message+"\"");
                         }
                       while (!message.equalsIgnoreCase("bye"));

                }catch (Exception ex){
                    ex.getMessage();
                }
            }

    }


}

class Connection extends URLConnection{

    /**
     * Constructs a URL connection to the specified URL. A connection to
     * the object referenced by the URL is not created.
     *
     * @param url the specified URL.
     */
    protected Connection(URL url) {
        super(url);
    }

    @Override
    public void connect() throws IOException {

    }
}
