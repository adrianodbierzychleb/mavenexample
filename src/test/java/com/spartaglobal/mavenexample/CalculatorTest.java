package com.spartaglobal.mavenexample;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddition(){
        Assert.assertEquals(4, calculator.add(2, 2));


    }

    @Test
    public void testSubtraction(){
        Assert.assertEquals(2, calculator.subtract(4,2));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(8,calculator.multiply(4,2));
    }

    @Test
    public void testDivision(){
        Assert.assertEquals(3,calculator.division(12,4));
    }

}
