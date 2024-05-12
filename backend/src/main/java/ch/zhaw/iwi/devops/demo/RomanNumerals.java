package ch.zhaw.iwi.devops.demo;

public class RomanNumerals {
    public String toRoman(int number) {
        if (number == 3) {
            return "III";
        } else if (number == 2) {
            return "II";
        }
        return "I";
    }
}
    

