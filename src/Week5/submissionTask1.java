package Week5;
import java.util.Scanner;

public class submissionTask1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, password, userNameChecker, passwordChecker;


        //Ask user for Username and Password
        System.out.print("Enter Username: ");
        userName = sc.nextLine();
        System.out.print("Enter Password: ");
        password = sc.nextLine();

        do {
            boolean optChecker = false;

            //Confirm Username and Password
            System.out.println("Confirm Username and Password");

            do {

                System.out.print("Enter Username: ");
                userNameChecker = sc.next();
                System.out.print("Enter password: ");
                passwordChecker = sc.next();

                if (userName.equals(userNameChecker) && !password.equals(passwordChecker)) {
                    do {
                        System.out.println("Incorrect Password! Try again.");
                        System.out.print("Enter Password: ");
                        passwordChecker = sc.next();
                    } while (!password.equals(passwordChecker));
                    optChecker = true;

                } else if (!userName.equals(userNameChecker) && password.equals(passwordChecker)) {
                    do {
                        System.out.println("Incorrect Username! Try again.");
                        System.out.print("Enter Username: ");
                        userNameChecker = sc.next();
                    } while (!userName.equals(userNameChecker));
                    optChecker = true;

                } else if(userName.equals(userNameChecker) && password.equals(passwordChecker)) {
                    optChecker = true;
                } else {
                    System.out.println("Incorrect Username and Password!");
                }
            } while (!optChecker);

        }while (false);
        System.out.println("\nYou entered the correct Username and Password");
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);

    }
}