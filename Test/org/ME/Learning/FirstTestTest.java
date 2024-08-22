package org.ME.Learning;

import static org.junit.jupiter.api.Assertions.*;

class FirstTestTest {

    @org.junit.jupiter.api.Test
    void NUm1TimesNum2Test(){
        var ft = new FirstTest();  // var here is a local variable and can be used instead of the class name when creating an Object

        assertEquals(3,ft.divide(6,2));
    }
}