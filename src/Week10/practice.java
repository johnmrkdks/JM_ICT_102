package Week10;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import Week10.song;


public class practice {
    public static void main(String[] args) {

        //Ask the user to input 3 different names, and print it.

        Scanner sc = new Scanner(System.in);

        String userInput;
        ArrayList<String> names = new ArrayList<String>();

        for(int i = 0; i<3; ++i){
            System.out.println("Enter name: ");
            userInput = sc.nextLine();
            names.add(userInput);
        }
        System.out.println(names);


    }
}
