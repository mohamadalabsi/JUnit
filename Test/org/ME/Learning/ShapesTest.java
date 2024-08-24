package org.ME.Learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {

    @Test
    void computeSquareArea() {
        var shapes = new Shapes();

        assertEquals(5, shapes.computeSquareArea(3),"it did not  pass   the Test");

    }
}