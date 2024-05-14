package ch.zhaw.iwi.devops.demo;

public class RomanNumerals {
 

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

    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    


}
    

