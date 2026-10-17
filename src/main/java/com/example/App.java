package com.example;

public class App {

    // Intentionally simple code for Experiment 9 static analysis.
    public static void main(String[] args) {
        System.out.println("Experiment 9 - Jenkins + SonarQube");
        System.out.println("Result: " + calculateResult(10, 20));
    }

    public static int calculateResult(int a, int b) {
        if (a > 0) {
            return a + b;
        } else {
            return 0;
        }
    }

    public static String greet(String name) {
        if (name == null) {
            return "Hello";
        }
        return "Hello, " + name;
    }
}
