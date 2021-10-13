package io.demo.junit;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        System.out.println("Welcome use Calculate");
        Calculator calculator = new Calculator();
        int add = calculator.add(1, 2);
    }
}
