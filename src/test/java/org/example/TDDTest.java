package org.example;

import org.example.TDD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TDDTest {
    @Test
    void when_number_smaller_than_zero(){
        //given
        int number = 4;
        boolean result = false;
        //when
        result = TDD.check(number);
        //then
        assertEquals(result, true);
    }
    @Test
    void sumSquareOrSubstract_Test(){
        //given
        int x=2;
        int y=3;
        int sum= x+y;
        int prod=x*y;
        //when
        sum = TDD.sumSquareOrSubstract(x,y);
        prod = TDD.sumSquareOrSubstract(x,y);
        //then
        if (x>y)
        assertEquals(sum,x+y);
        if (x<y)
            assertEquals(prod,x*y);
    }
}
