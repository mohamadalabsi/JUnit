package org.ME.Learning;

import static org.junit.jupiter.api.Assertions.*;

class FirstTestTest {

    @org.junit.jupiter.api.Test
    void TowPlusTowShouldEqualFour() {
        var ft = new FirstTest();  // var here is a local variable and can be used instead of the class name when  creating an Object

        assertEquals(4, ft.plus(2, 2));
    }
//        assertNotEquals(3,ft.divide(6,2));
//        assertTrue();
//        assertFalse();
//        assertNull();
//        always add more unit testing to make sure that ur code is valid

    @org.junit.jupiter.api.Test
    void TreePlusTreeShouldEqualSix() {
        var ft = new FirstTest();  // var here is a local variable and can be used instead of the class name when  creating an Object

        assertEquals(6, ft.plus(3, 3));
    }
}