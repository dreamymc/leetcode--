
import java.util.Scanner;

public class IntegerToRoman {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        if (num == 0 && num > 3999) {
        } else {
            System.out.println(intToRoman(num));
        }
        scan.close();
    }

    public static String intToRoman(int num) {
        String[] romanOnes = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] romanTens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] romanHundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] romanThousands = {"", "M", "MM", "MMM"};
        char ones, tens, hundreds, thousands;
        String number = Integer.toString(num);
        String result = "";

        switch (number.length()) {
            case 1:
                ones = number.charAt(0);
                result += romanOnes[Character.getNumericValue(ones)];
                return result;
            case 2:
                tens = number.charAt(0);
                result += romanTens[Character.getNumericValue(tens)];
                ones = number.charAt(1);
                result += romanOnes[Character.getNumericValue(ones)];
                return result;
            case 3:
                hundreds = number.charAt(0);
                result += romanHundreds[Character.getNumericValue(hundreds)];
                tens = number.charAt(1);
                result += romanTens[Character.getNumericValue(tens)];
                ones = number.charAt(2);
                result += romanOnes[Character.getNumericValue(ones)];
                return result;
            case 4:
                thousands = number.charAt(0);
                result += romanThousands[Character.getNumericValue(thousands)];
                hundreds = number.charAt(1);
                result += romanHundreds[Character.getNumericValue(hundreds)];
                tens = number.charAt(2);
                result += romanTens[Character.getNumericValue(tens)];
                ones = number.charAt(3);
                result += romanOnes[Character.getNumericValue(ones)];
                return result;
        }
        return null;
    }
}
