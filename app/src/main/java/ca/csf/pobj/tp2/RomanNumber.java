package ca.csf.pobj.tp2;

import java.security.InvalidParameterException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumber {

    private int number;

    public RomanNumber(int number) {
        if (number <= 0 && number >= 5000) {
            throw new InvalidParameterException("The number must be greater or equal than 1 and lesser or equal than 4999");
        }

        this.number = number;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        int[] powerArray = F.getArrayOfPower(this.number, 4);

        for (int i = 0; i < powerArray.length; i++) {
            if (powerArray[i] != 0) {
                sb.append(transformSingleNumberToRomanAtPower(powerArray[i], 4-i));
            }
        }

        return sb.toString();
    }

    private static String transformSingleNumberToRomanAtPower(int singleDigits, int power) {
        StringBuilder sb = new StringBuilder();

        if (singleDigits >= 1 && singleDigits <= 3) {
            singleDigitsGraterThan0andLesserThan4(sb, singleDigits, power);
        }
        else if (singleDigits == 4) {

            if (power == 1) {
                sb.append("IV");
            }
            else if (power == 2) {
                sb.append("LX");
            }
            else if (power == 3) {
                sb.append("DC");
            }
            else if (power == 4) {
                sb.append("MMMM");
            }

        }
        else if (singleDigits < 9 && singleDigits >= 5) {

            if (power == 1) {
                sb.append("V");
            }
            else if (power == 2) {
                sb.append("L");
            }
            else if (power == 3) {
                sb.append("D");
            }

            singleDigits -= 5;

            singleDigitsGraterThan0andLesserThan4(sb, singleDigits, power);
        }
        else if (singleDigits == 9) {
            if (power == 1) {
                sb.append("IX");
            }
            else if (power == 2) {
                sb.append("XC");
            }
            else if (power == 3) {
                sb.append("CM");
            }
        }

        return sb.toString();
    }

    private static void singleDigitsGraterThan0andLesserThan4(StringBuilder sb, int number, int power) {
        for (int i = 0; i < number; i++) {
            if (power == 1) {
                sb.append("I");
            }
            else if (power == 2) {
                sb.append("X");
            }
            else if (power == 3) {
                sb.append("C");
            }
            else if (power == 4) {
                sb.append("M");
            }
        }
    }
}
