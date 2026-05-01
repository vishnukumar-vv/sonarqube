package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGreet() {
        assertEquals("Hello, Vishnu!", App.greet("Vishnu"));
    }

    @Test
    void testMain() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
