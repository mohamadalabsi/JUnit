package org.ME.Learning;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

class SortingArrayTest {

    @Test
    void sortingArrayTest() {
        int []inputArray ={4,56,3,1,6,5,34,3,65,5,3,2,56,5,43};

        var Obj = new SortingArray();

        assertTimeout(Duration.ofMillis(10),()-> Obj.sortingArray(inputArray)); // check the performance of my class

    }
}