package com.bhalash.hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloAskName {
    public static void main(String[] args) {
        try {
            final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");
            final String name = reader.readLine();
            reader.close();
            System.out.println("Hello " + name);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
