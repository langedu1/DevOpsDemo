package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void testOneReturnsI() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("I", roman.toRoman(1), "1 should be converted to 'I'");
    }
}
