public class convertTemperature {
    public static void main(String[] ukiyo) {
        new convertTemperature();
    }

    public convertTemperature() {
        exe();
    }

    private void exe() {
        double celsius = 36.50;
        for (double each : convertTemperature(celsius))
            System.out.println(each);
    }

    public double[] convertTemperature(double celsius) {
        return new double[] { celsius + 273.15, celsius * 1.8 + 32 };
    }
}
