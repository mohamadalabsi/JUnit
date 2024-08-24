package org.ME.Learning;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class TestArray {

    @Test
    void testArray(){
        int [] array1={1,2,4,7,9}  ;
        int [] array2={4,2,7,1,9};

//        Arrays.stream(array2).count(); i will get back to this
        Arrays.sort(array2);
        assertArrayEquals(array1,array2);
    }
}
