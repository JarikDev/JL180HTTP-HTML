package com;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Socket {
    public static void main(String[] args) {
        try (java.net.Socket s = new java.net.Socket()) {
            s.connect(new InetSocketAddress("india.colorado.edu", 13), 2000);
            InputStream inStream = s.getInputStream();
            Scanner in = new Scanner(inStream);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
