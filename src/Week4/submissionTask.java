package Week4;

import java.util.Scanner;

public class submissionTask {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);


        int choice;


        do {
            System.out.print("Input number between 100 - 200 : ");
            choice = num.nextInt();

        } while (choice < 100 || choice > 200);
        System.out.printf("You entered value %d is valid input\n", choice);


    }
}
