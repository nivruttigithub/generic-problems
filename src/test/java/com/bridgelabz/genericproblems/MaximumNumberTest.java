package com.bridgelabz.genericproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    //Integer
    @Test
    public void WhenGivenThreeIntegers_ShouldReturnMax_Integer() {
        MaximumNumber<Integer> maxNum = new MaximumNumber<>(10, 20, 15);
        Assertions.assertEquals(20, maxNum.findMax(), "Max should be 20");
    }

    //Float
    @Test
    public void WhenGivenThreeFloats_ShouldReturnMax_Float() {
        MaximumNumber<Float> maxNum = new MaximumNumber<>(5.5f, 10.5f, 9.9f);
        Assertions.assertEquals(10.5f, maxNum.findMax(), "Max should be 10.5");
    }

    //String
    @Test
    public void WhenGivenThreeStrings_ShouldReturnMax_String() {
        MaximumNumber<String> maxNum = new MaximumNumber<>("Apple", "Peach", "Banana");
        Assertions.assertEquals("Peach", maxNum.findMax(), "Max should be Peach");
    }
}
