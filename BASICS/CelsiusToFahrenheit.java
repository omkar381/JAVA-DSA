import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9 / 5) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f\n", tempF);

        input.close();
    }
}
