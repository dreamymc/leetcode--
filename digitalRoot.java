public class digitalRoot {
    public static void main(String[] ukiyo) {
        new digitalRoot();
    }

    public digitalRoot() {
        exe();
    }

    private void exe() {
        int num = 38;
        System.out.println(addDigits(num));
    }

    public int addDigits(int num) {
        if (num == 0)
            return 0;
        else if (num % 9 == 0)
            return 9;
        else
            return num % 9;
    }
}
