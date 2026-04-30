package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Maven + GitHub Actions!");
        
        int a = 5;
        int b = 3;
        System.out.println("Sum: " + add(a, b));
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
