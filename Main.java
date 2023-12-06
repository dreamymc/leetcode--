

public class Main {
    public static void main(String[] args) {
        String nigga = "12 nigga";
        System.out.println(Integer.parseInt(nigga));
    }

    public int myAtoi(String s) {
        // Remove leading whitespace
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1; // Positive by default
        int index = 0;
        char firstChar = s.charAt(0);

        // Check for sign
        if (firstChar == '-' || firstChar == '+') {
            sign = (firstChar == '-') ? -1 : 1;
            index++;
        }

        int result = 0;

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }

}
