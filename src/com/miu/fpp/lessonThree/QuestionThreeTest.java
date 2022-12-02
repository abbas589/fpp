package com.miu.fpp.lessonThree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.miu.fpp.lessonThree.QuestionThree.binarySearch;
import static com.miu.fpp.lessonThree.QuestionTwo.minCharInArray;
import static org.junit.jupiter.api.Assertions.*;

class QuestionThreeTest {


    @Test
    void testThatBinarySearchFindsANumber() {
        int[] testValues = new int[]{1, 2, 13, 4, 5, 6, 0, 55, 24};
        Arrays.sort(testValues);

        int expectedValue = 6;

        int actual = binarySearch(testValues, 0, testValues.length - 1, 13);

        assertEquals(expectedValue, actual);
    }

    @Test
    void testThatBinarySearchDoesNotFindANumber() {
        int[] testValues = new int[]{1, 2, 13, 4, 5, 6, 0, 55, 24};
        Arrays.sort(testValues);

        int expectedValue = -1;

        int actual = binarySearch(testValues, 0, testValues.length - 1, 44);

        assertEquals(expectedValue, actual);
    }

    @Test
    void testBinarySearchWithEmptyArray() {
        int[] testValues = new int[]{};

        int expectedValue = -1;

        int actual = binarySearch(testValues, 0, testValues.length - 1, 44);

        assertEquals(expectedValue, actual);
    }

    @Test
    void testForMInCharInArray() {

        char[] charArray = "abbasirekeolq".toCharArray();
        char expected = 'a';
        char minChar = minCharInArray(charArray, 0, charArray.length - 1);

        assertEquals(expected, minChar);
    }

    @Test
    void testForMInCharInEmptyArray() {
        char[] charArray = "".toCharArray();
        char expected = '\u0000';
        char minChar = minCharInArray(charArray, 0, charArray.length - 1);

        assertEquals(expected, minChar);
    }
}