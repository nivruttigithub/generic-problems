package com.bridgelabz.genericproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    // TC1.1 : Given Max Number at 1st Position return the Same Number
    @Test
    public void WhenGivenMaxAtFirstPosition_ShouldReturnMax() {
        Assertions.assertEquals(15.5f, MaximumNumber.findMax(15.5f, 5.0f, 3.0f), "Max should be 15.5");
    }
}
