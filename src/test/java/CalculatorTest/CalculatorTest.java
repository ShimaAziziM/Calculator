package CalculatorTest;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.org.calculator.Calculator;

public class CalculatorTest {
    @Test
    void Add_Numbers(){
        Calculator calculator = new Calculator();
        String answar = calculator.add("5.3", "-2");
        Assert.assertEquals(answar, "3.3");


    }

}
