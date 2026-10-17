package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testCalculateResult() {
        assertEquals(30, App.calculateResult(10, 20));
    }

    @Test
    void testGreet() {
        assertEquals("Hello, Sakshi", App.greet("Sakshi"));
    }
}
