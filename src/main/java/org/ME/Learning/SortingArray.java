package org.ME.Learning;

import java.util.Arrays;

public class SortingArray {

    public int [] sortingArray(int [] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {

            Arrays.sort(inputArray);

        }
        return inputArray;
    }
}
