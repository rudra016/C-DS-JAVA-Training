import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double INR_TO_USD_RATE = 0.011;
        final double USD_TO_INR_RATE = 83.72;

        System.out.println("Currency Converter");
        System.out.println("1. Convert INR to USD");
        System.out.println("2. Convert USD to INR");
        System.out.print("Choose an option: ");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter amount in INR: ");
                double inrAmount = scanner.nextDouble();
                double usdAmount = inrAmount * INR_TO_USD_RATE;
                System.out.printf("Amount in USD: %.2f%n", usdAmount);
                break;
            case 2:
                System.out.print("Enter amount in USD: ");
                double usdAmountToConvert = scanner.nextDouble();
                double inrAmountConverted = usdAmountToConvert * USD_TO_INR_RATE;
                System.out.printf("Amount in INR: %.2f%n", inrAmountConverted);
                break;
            default:
                System.out.println("Invalid option. Please choose 1 or 2.");
                break;
        }

        scanner.close();
    }
}
