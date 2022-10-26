import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
@Test

    void sum() {
    //given
    int a = 1;
    int b = 1;
    int expectedResult = 2;

    //when
    int result = Sum.Sum(a,b);
    //then
    assertEquals(expectedResult, result);
    }
}