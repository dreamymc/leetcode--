
public class reverseInteger {

    public static void main(String[] args) {
        int x = 0;
        try {
            x = -321;
        } catch (Exception e) {

        }

        System.out.println(reverse(x));

    }

    public static int reverse(int x) {
        try {
            String xString = Integer.toString(x);
            if (x < 0) {
                xString = xString.substring(1, xString.length());
                StringBuilder reverseX = new StringBuilder(xString);
                reverseX.reverse();
                return Integer.parseInt("-" + reverseX);

            } else {
                StringBuilder reverseX = new StringBuilder(xString);
                reverseX.reverse();
                int result = (Integer.parseInt("" + reverseX));
                return result;
            }
        } catch (Exception e) {

        }
        return 0;

    }

}
