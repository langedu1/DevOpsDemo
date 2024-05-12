package ch.zhaw.iwi.devops.demo;

public class RomanNumerals {
    public String toRoman(int number) {
        if (number >= 10) {
            return "X" + toRoman(number - 10);
        } else if (number == 9) {
            return "IX";
        } else if (number == 6) {
            return "VI";
        } else if (number == 5) {
            return "V";
        } else if (number == 4) {
            return "IV";
        } else if (number == 3) {
            return "III";
        } else if (number == 2) {
            return "II";
        } 
        return "I";
    }

}
    

