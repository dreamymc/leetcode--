public class test1 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Recursive(n));
    }

    public static int Recursive(int n) {
        if (n <= 1)
            return 1;
        else
            return (Recursive(n / 2) + Recursive(n / 4));
    }
}