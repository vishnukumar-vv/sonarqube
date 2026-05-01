package com.example;

import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        String message = greet("World");   // ✅ method executed once

        logger.info(message);              // ✅ no method call inside logger
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
