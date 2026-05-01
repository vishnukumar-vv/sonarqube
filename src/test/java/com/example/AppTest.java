package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void greetReturnsHelloName() {
        String result = App.greet("Tester");
        assertEquals("Hello, Tester!", result);
    }
}
