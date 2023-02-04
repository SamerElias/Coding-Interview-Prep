package samer.Problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void twoSumTest1() {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};
        int[] actual = TwoSum.twoSum(arr, target);
        assertArrayEquals(expectedResult, actual);
    }

    @Test
    void twoSumTest2() {
        int[] arr = {1, 2, 10, 15, 30, -10};
        int target = 17;
        int[] expectedResult = {1, 3};
        int[] actual = TwoSum.twoSum(arr, target);
        assertArrayEquals(expectedResult, actual);
    }

}