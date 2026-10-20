package co.edu.escuelaing.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathServicesTest {

    @Test
    void squaresPositiveNumber() {
        assertEquals(25, MathServices.square(5));
    }

    @Test
    void squaresNegativeNumber() {
        assertEquals(196, MathServices.square(-14));
    }

    @Test
    void squaresZero() {
        assertEquals(0, MathServices.square(0));
    }
}
