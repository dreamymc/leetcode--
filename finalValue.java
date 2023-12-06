public class finalValue {
    public static void main(String[] args) {
        String operations[] = { "++X","++X","X++" };
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0; for (String each : operations) if (each.contains("++")) x++; else x--; return x;
    }
}
