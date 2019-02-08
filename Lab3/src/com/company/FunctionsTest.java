package com.company;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {

    private static Functions funcTest;
    private static String testEnCours;

    @org.junit.jupiter.api.BeforeAll
    static void setUp() {
        funcTest = new Functions();
    }

    @org.junit.jupiter.api.Test
    void add() {
        // Arrange
        final int expected = 2 + 4;

        // Act
        final int actual = funcTest.add(2,4);

        // Assert
        testEnCours = "TestAdd";
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void sub() {
        // Arrange
        final int expected = 2 - 4;

        // Act
        final int actual = funcTest.sub(2,4);

        // Assert
        testEnCours = "TestSub";
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.AfterEach
    void finTest() {
        System.out.println("Le test " + testEnCours + " est ok");
    }
}