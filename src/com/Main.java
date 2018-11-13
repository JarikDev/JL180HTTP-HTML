package com;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        URLConnection connection = new URL("http://www.google.com").openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("#");
        }
        Map<String,List<String>> headerFields= connection.getHeaderFields();
        for (Map.Entry<String,List<String>> entry : headerFields.entrySet()) {
            System.out.println(entry.getKey()+"/"+entry.getValue());
        }
    }
}

























