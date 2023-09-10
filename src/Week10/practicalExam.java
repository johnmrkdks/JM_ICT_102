package Week10;
import java.util.Scanner;

public class practicalExam {
    public static void main(String[] args) {
        /*QUESTION:
           Ask the user to enter their monthly income, then calculate the yearly income.
           "Us Scanner Class"
        * */

        Scanner sc = new Scanner(System.in);

        double salary;

        System.out.print("Enter monthly income: ");
        salary = sc.nextDouble();

        double total = salary * 12;

        System.out.printf("Yearly income is: %.2f", total);
    }
}
