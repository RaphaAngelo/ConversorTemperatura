public class ConversorTemperatura {
    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) / 1.8;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = fahrenheitParaCelsius(fahrenheit);
        System.out.printf("Temperatura em Celsius: %.2f°C%n", celsius);
        sc.close();
    }
}