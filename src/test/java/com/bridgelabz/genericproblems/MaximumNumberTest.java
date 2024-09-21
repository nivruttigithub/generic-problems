package com.bridgelabz.genericproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    // TC1.1 : Given Max Number at 1st Position return the Same Number
    @Test
    public void WhenGivenMaxAtFirstPosition_ShouldReturnMax_Integer() {
        Assertions.assertEquals(15, MaximumNumber.findMax(15, 5, 3), "Max should be 15");
    }
   // TC1.2 : Given Max Number at 2nd Position return the Same Number
    @Test
    public void WhenGivenMaxAtSecondPosition_ShouldReturnMax_Integer() {
        Assertions.assertEquals(20, MaximumNumber.findMax(5, 20, 15), "Max should be 20");
    }
    // TC1.3 : Given Max Number at 3rd Position return the Same Number
    @Test
    public void WhenGivenMaxAtThirdPosition_ShouldReturnMax_Integer() {
        Assertions.assertEquals(30, MaximumNumber.findMax(5, 15, 30), "Max should be 30");
    }
    // TC1.1 : Given Max Number at 1st Position return the Same Number
    @Test
    public void WhenGivenMaxAtFirstPosition_ShouldReturnMax() {
        Assertions.assertEquals(15.5f, MaximumNumber.findMax(15.5f, 5.0f, 3.0f), "Max should be 15.5");
    }
    // TC1.2 : Given Max Number at 2nd Position return the Same Number
    @Test
    public void WhenGivenMaxAtSecondPosition_ShouldReturnMax() {
        Assertions.assertEquals(20.2f, MaximumNumber.findMax(5.0f, 20.2f, 15.0f), "Max should be 20.2");
    }

    // TC1.3 : Given Max Number at 3rd Position return the Same Number
    @Test
    public void WhenGivenMaxAtThirdPosition_ShouldReturnMax() {
        Assertions.assertEquals(30.3f, MaximumNumber.findMax(5.0f, 15.0f, 30.3f), "Max should be 30.3");
    }

    // TC1.1 : Given Max String at 1st Position return the Same String
    @Test
    public void WhenGivenMaxStrAtFirstPosition_ShouldReturnMax() {
        Assertions.assertEquals("Peach", MaximumNumber.findMax("Peach", "Apple", "Banana"), "Max should be Peach");
    }

    // TC1.2 : Given Max String at 2nd Position return the Same String
    @Test
    public void WhenGivenMaxStrAtSecondPosition_ShouldReturnMax() {
        Assertions.assertEquals("Zebra", MaximumNumber.findMax("Lion", "Zebra", "Elephant"), "Max should be Zebra");
    }

    // TC1.3 : Given Max String at 3rd Position return the Same String
    @Test
    public void WhenGivenMaxStrAtThirdPosition_ShouldReturnMax() {
        Assertions.assertEquals("Mango", MaximumNumber.findMax("Cherry", "Apricot", "Mango"), "Max should be Mango");
    }
}
