package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExempleTestTest {
    @Test
    void exempleTest(){
        final int CHOSEN_NUMBER = 5;
        ExempleTest exempleTest = new ExempleTest(CHOSEN_NUMBER);
        assertEquals(CHOSEN_NUMBER, exempleTest.getNumber());
    }

}