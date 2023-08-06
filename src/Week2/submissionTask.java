package Week2;
import java.util.Scanner;

public class submissionTask {

    public static void main(String[] args) {
        int qty;
        double price;
        String name;

        Scanner scan = new Scanner(System.in);
        System.out.print("Product Name: ");
        name = scan.nextLine();
        System.out.print("Price: ");
        price = scan.nextDouble();
        System.out.print("Quantity: ");
        qty = scan.nextInt();

        System.out.println("Product Name is "+name+", its price is $"+price);
        System.out.println("You bought "+qty+" quantity");

    }

}
