package Week1;
import java.util.Scanner;


public class submissionTask {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int x, y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter x value: ");
        x = sc.nextInt();

        System.out.println("Please enter y value: ");
        y = sc.nextInt();



        System.out.println("Addition: " + (x+y));
        System.out.println("Subtraction: " + (x-y));
        System.out.println("Multiplication: " + (x*y));
        System.out.println("Division: " + (x/y));
    }

}
