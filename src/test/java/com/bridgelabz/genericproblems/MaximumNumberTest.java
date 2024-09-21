package com.bridgelabz.genericproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class MaximumNumberTest {
    //TC1.1 : Given Max Number at 1st Position return the Same Number
    @Test
    public void WhenGivenMaxAtFirstPosition_ShouldReturnMax() {
        Assertions.assertEquals(15, MaximumNumber.findMax(15, 5, 3),"Max should be 15");
    }

    //TC1.2 : Given Max Number at 2nd Position return the Same Number
    @Test
    public void WhenGivenMaxAtSecondPosition_ShouldReturnMax() {
        Assertions.assertEquals(20, MaximumNumber.findMax(5, 20, 15), "Max should be 20");
         }
}
