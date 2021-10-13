package io.demo.junit;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){

        Calculator calculator = new Calculator();
        int add = calculator.add(1, 2);
//        Assert.assertEquals(1,add);
    }
}
