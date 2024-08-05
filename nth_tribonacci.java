import java.util.Scanner;

public class nth_tribonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        System.out.println("Answer is: " + getTrib(n));
        scan.close();
    }

    public static int getTrib(int n) {
        if (n == 0)
            return 0;

        if (n < 3)
            return 1;

        int x = 0, y = 1, z = 1, ans = 0;

        for (int i = 3; i <= n; i++) {
            ans = x + y + z;
            x = y;
            y = z;
            z = ans;
        }
        return ans;
    }
}
