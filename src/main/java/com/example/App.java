package com.example;

import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        String message = greet("World");

        if (message != null && !message.isEmpty()) {
            logger.info(message);
        }
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}