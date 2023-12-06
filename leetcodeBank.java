import java.util.Scanner;

public class leetcodeBank {
    public static void main(String[] _dreamymc) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("n = ");
            int n = scan.nextInt();
            System.out.println(totalMoney(n));
        }
    }

    public static int totalMoney(int n) {
        int result = 0;
        int added = 0;
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            if (counter == 7) {
                counter = 1;
                added++;
            }
            result = result + counter + added;
            counter++;
        }
        return result;
    }
}
