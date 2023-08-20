package Week6;
import java.util.Scanner;

public class submission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sales = new double[7];

        int day = 1;
        do {
            while (true) {
                try {
                    System.out.print("Enter sales for day " + day + ": ");
                    double saleAmount = Double.parseDouble(scanner.nextLine());
                    sales[day - 1] = saleAmount;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid sale amount.");
                }
            }
            day++;
        } while (day <= 7);

        double totalSales = 0;
        double highestSale = sales[0];

        for (double sale : sales) {
            totalSales += sale;
            if (sale > highestSale) {
                highestSale = sale;
            }
        }

        double averageSales = totalSales / 7;

        System.out.println("\nSales Data:");
        System.out.printf("Average Sales: $%.2f%n", averageSales);
        System.out.printf("Highest Sale: $%.2f%n", highestSale);

        scanner.close();
    }
}
