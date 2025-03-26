package ims.apptest.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    calculator calculator = new calculator();

    @Test
    public void testAdd(){
        int sum = calculator.add(2,2);
        assertEquals(4, sum);
    }
}