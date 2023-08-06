package Week5;
import java.awt.*;
import java.util.Scanner;

public class submissionTaskAssignment {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        String userName, password, userNameChecker, passwordChecker;


        //Ask user for Username and Password

        System.out.print("Enter Username: ");
        userName = sc.nextLine();
        System.out.print("Enter Password: ");
        password = sc.nextLine();


        do {
            //Confirm Username and Password
            System.out.println("Confirm Username");
            do{
                System.out.print("Enter Username: ");
                userNameChecker = sc.nextLine();

                if(userName.equals(userNameChecker)){
                    System.out.println("You entered the correct Username");
                    System.out.println("Confirm Password");
                }else {
                    System.out.println("Incorrect Username! Try again.");
                }

            }while (!userName.equals(userNameChecker));

            do{
                System.out.print("Enter Password: ");
                passwordChecker = sc.nextLine();

                if(password.equals(passwordChecker)){
                    System.out.println("You entered the correct password");
                }else{
                    System.out.println("Incorrect password! Try again");
                }
            }while (!password.equals(passwordChecker));

        }while(false);
            System.out.println("\nYou entered the correct Username and Password");
            System.out.println("Username: "+userName);
            System.out.println("Password: "+password);
    }

}
