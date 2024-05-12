package ch.zhaw.iwi.devops.demo;

public class RomanNumerals {
  /*  public String toRoman(int number) {
        if (number >= 50) {
            return "L" + toRoman(number - 50);
        } else if (number >= 10) {
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
    }*/ 
    public String toRoman(int number) {
        String roman = "";
        while (number >= 100) { roman += "C"; number -= 100; }
        while (number >= 50) { roman += "L"; number -= 50; }
        while (number >= 10) { roman += "X"; number -= 10; }
        while (number >= 9) { roman += "IX"; number -= 9; }
        while (number >= 5) { roman += "V"; number -= 5; }
        while (number >= 4) { roman += "IV"; number -= 4; }
        while (number >= 1) { roman += "I"; number -= 1; }
        return roman; 
    }

}
    

