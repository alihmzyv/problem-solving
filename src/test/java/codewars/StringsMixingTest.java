package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsMixingTest {

    @Test
    void mixTest1() {
        String str1 = "my&friend&Paul has heavy hats! &";
        String str2 = "my friend John has many many friends &";
        String expectedResult = "2:nnnnn/1:aaaa/1:hhh/2:mmm/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss";
        assertEquals(expectedResult, StringsMixing.mix(str1, str2));
    }
}