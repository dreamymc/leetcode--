public class plusone {
    public static void main(String[] ukiyo) {
        int[] digits = { 7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6 };
        for (int x : plusOne(digits))
            System.out.print(x + " ");

    }

    public static int[] plusOne(int[] digits) {
        StringBuilder s = new StringBuilder();
        for (int each : digits)
            s.append(each);
        long n = Long.parseLong(s.toString()) + 1;
        String x = Long.toString(n);
        digits = new int[x.length()];
        for (int i = 0; i < x.length(); i++)
            digits[i] = Integer.parseInt("" + x.charAt(i));
        return digits;
    }

}
