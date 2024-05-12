package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void testOneReturnsI() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals("I", roman.toRoman(1), "1 should be converted to 'I'");
    }

    @Test
    public void testTwoReturnsII() {
    RomanNumerals roman = new RomanNumerals();
    assertEquals("II", roman.toRoman(2));
    }

    @Test
    public void testThreeReturnsIII() {
    RomanNumerals roman = new RomanNumerals();
    assertEquals("III", roman.toRoman(3));
}
@Test
public void testFourReturnsIV() {
    RomanNumerals roman = new RomanNumerals();
    assertEquals("IV", roman.toRoman(4));
}
@Test
public void testFiveReturnsV() {
    RomanNumerals roman = new RomanNumerals();
    assertEquals("V", roman.toRoman(5));
}
@Test
public void testSixReturnsVI() {
    RomanNumerals roman = new RomanNumerals();
    assertEquals("VI", roman.toRoman(6));
}
@Test
public void testNineReturnsIX() {
    RomanNumerals roman = new RomanNumerals();
    assertEquals("IX", roman.toRoman(9));
}

@Test
public void testTenReturnsX() {
    RomanNumerals roman = new RomanNumerals();
    assertEquals("X", roman.toRoman(10));
}

@Test
public void testFiftyReturnsL() {
    RomanNumerals roman = new RomanNumerals();
    assertEquals("L", roman.toRoman(50));
}

@Test
public void testOneHundredReturnsC() {
    RomanNumerals roman = new RomanNumerals();
    assertEquals("C", roman.toRoman(100));
}

}
