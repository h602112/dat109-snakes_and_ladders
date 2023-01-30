package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    public void testRoll() {
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getFaceValue() >= 1 && dice.getFaceValue() <= 6);
    }

}