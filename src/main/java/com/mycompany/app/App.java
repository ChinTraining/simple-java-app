package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I Love Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Modified from local project !");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
