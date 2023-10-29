import java.lang.StringBuilder;
public class Main {

    public static void main(String[] args) {


        class Solution {
            public String intToRoman(int num) {
                StringBuilder result = new StringBuilder();

                if (((num - (num % 1000)) % 1000) == 0) {
                    int n = (num - (num % 1000)) / 1000; // how much m's
                    result.append("M".repeat(Math.max(0, n)));

                    num = num % 1000;
                }

                if ((num - (num % 900)) == 900) {
                    result.append("CM");
                    num = num % 900;
                }

                if (num < 500 && (num - (num % 400)) == 400) {
                    result.append("CD");
                    num = num % 400;
                } else if (num >= 500) {
                    result.append("D");
                    num = num % 500;
                }

                if (((num - (num % 100)) % 100) == 0) {
                    int n = (num - (num % 100)) / 100; // how much c's

                    result.append("C".repeat(Math.max(0, n)));

                    num = num % 100;
                }

                if ((num - (num % 90)) == 90) {
                    result.append("XC");
                    num = num % 90;
                } else if (num >= 50) {
                    result.append("L");
                    num = num % 50;
                }

                if (num < 50 && (num - (num % 40)) == 40) {
                    result.append("XL");
                    num = num % 40;
                }

                if (((num - (num % 10)) % 10) == 0) {
                    int n = (num - (num % 10)) / 10; // how much x's

                    result.append("X".repeat(Math.max(0, n)));

                    num = num % 10;
                }

                if ((num - (num % 9)) == 9) {
                    result.append("IX");
                    return result.toString();
                } else if (num >= 5) {
                    result.append("V");
                    num = num % 5;
                }

                if (num == 4) {
                    result.append("IV");
                    return result.toString();
                }

                result.append("I".repeat(Math.max(0, num)));

                return result.toString();
            }
        }



    }
}