package Week10;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();

        char s;
        int sum = 0;

        int score;

        //asking user to input player score
        do {
            System.out.print("Enter the run scored by a player: ");
            score = sc.nextInt();
            scores.add(score);

            System.out.print("Do you want to add more score? [Y/N]: ");
            s = sc.next().charAt(0);
        } while (s == 'Y' || s == 'y'); //checking user input for yes or no


        for (int i = 0; i < scores.size(); i++){ //adding all the index of ArrayList score
            sum += scores.get(i);
        }



        double total = (double) sum / scores.size(); //calculating the average team score

        System.out.println("Total Score is: "+sum); //printing all the total score

        System.out.printf("Average team score: %.2f\n", total); //printing the average team score
        System.out.printf("Maximum player score: %d\n", Collections.max(scores)); // printing the maximum score of the player
        System.out.printf("Minimum player score: %d\n", Collections.min(scores)); //printing the minimum score of the player
    }

}

