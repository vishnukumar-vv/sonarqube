package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGreet() {
        String result = App.greet("Vishnu");
        assertEquals("Hello, Vishnu!", result);
    }

    @Test
    void testMain() {
        App.main(new String[]{});   // covers main()
    }
}