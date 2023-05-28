package com.example.a3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A3ApplicationTest {

    @Test
    void elo() {
        A3Application a3Application = new A3Application();
        assertEquals(10, A3Application.elo(5,5));
    }
}