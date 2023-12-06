

public class multiplyString {
    public static void main(String[] ukiyo) {
        new multiplyString();
    }

    public multiplyString() {
        exe();
    }

    private void exe() {
        String num1 = "123456789";
        String num2 = "987654321";
        System.out.println(multiply(num1, num2));

    }

    public String multiply(String num1, String num2) {
        return  (""+Integer.parseInt(num1)*Integer.parseInt(num2));
    }
}