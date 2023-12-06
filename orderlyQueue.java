import java.util.Arrays;

public class orderlyQueue {
    public static void main(String[] ukiyo) {
        new orderlyQueue();
    }

    public orderlyQueue() {
        exe();
    }

    private void exe() {
        String s = "cba";
        int k = 1;
        System.out.println(orderlyQueue(s, k));
    }

    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String min = s;
            for (int i = 1; i < s.length(); i++) {
                String rotated = s.substring(i) + s.substring(0, i);
                if (rotated.compareTo(min) < 0) {
                    min = rotated;
                }
            }
            return min;
        } else {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }
    }

}
