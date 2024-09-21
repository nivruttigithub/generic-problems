package com.bridgelabz.genericproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    //Integer
    @Test
    public void WhenGivenThreeIntegers_ShouldReturnMax_Integer() {
        MaximumNumber<Integer> maxNum = new MaximumNumber<>(10, 20, 15);
        Assertions.assertEquals(20, maxNum.testMaximum(), "Max should be 20");
    }

    //Float
    @Test
    public void WhenGivenThreeFloats_ShouldReturnMax_Float() {
        MaximumNumber<Float> maxNum = new MaximumNumber<>(5.5f, 10.5f, 9.9f);
        Assertions.assertEquals(10.5f, maxNum.testMaximum(), "Max should be 10.5");
    }

    //String
    @Test
    public void WhenGivenThreeStrings_ShouldReturnMax_String() {
        MaximumNumber<String> maxNum = new MaximumNumber<>("Apple", "Peach", "Banana");
        Assertions.assertEquals("Peach", maxNum.testMaximum(), "Max should be Peach");
    }
    // Integer with more than three elements
    @Test
    public void WhenGivenMoreThanThreeIntegers_ShouldReturnMax_Integer() {
        MaximumNumber<Integer> maxNum = new MaximumNumber<>(10, 20, 5, 30, 15);
        Assertions.assertEquals(30, maxNum.testMaximum(), "Max should be 30");
    }

    // Float with more than three elements
    @Test
    public void WhenGivenMoreThanThreeFloats_ShouldReturnMax_Float() {
        MaximumNumber<Float> maxNum = new MaximumNumber<>(5.5f, 10.5f, 9.9f, 15.6f, 12.2f);
        Assertions.assertEquals(15.6f, maxNum.testMaximum(), "Max should be 15.6");
    }

    // String with more than three elements
    @Test
    public void WhenGivenMoreThanThreeStrings_ShouldReturnMax_String() {
        MaximumNumber<String> maxNum = new MaximumNumber<>("Apple", "Peach", "Banana", "Zebra", "Lion");
        Assertions.assertEquals("Zebra", maxNum.testMaximum(), "Max should be Zebra");
    }
}
