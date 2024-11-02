public class exampleContinue {
    public static void main(String[] args) {
        int max = 100;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                continue;
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
