package Week6;
import java.util.Scanner;

public class submissionTask {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        final int ARRAY_SIZE = 7;
        double[] sales = new double[ARRAY_SIZE];
        double totalSales=0;
        double highest = sales[0];

        for (int i = 0; i < sales.length; i++) {
            System.out.printf("Enter sales for %d day : ", (i + 1));
            sales[i] = array.nextDouble();
        }
        for (int i = 0; i < sales.length; i++) {
            totalSales = totalSales + sales[i];
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > highest) {
                highest = sales[i];
            }
        }
        System.out.printf("Average sales per day : %.2f\n", totalSales/ARRAY_SIZE);
        System.out.printf("Highest sale : %.2f\n", highest);


    }
}
