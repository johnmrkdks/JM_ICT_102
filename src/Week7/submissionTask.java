package Week7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class submissionTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<Double>();
        double score = 1;

        for(int i = 0; score != 0; i++){
            System.out.print("Enter Score: ");
            score = input.nextDouble();
            if(score != 0) scores.add(score);
        }
        System.out.printf("All scores entered are : %s \n", scores);
        Collections.sort(scores);
        System.out.printf("Sorted list : %s", scores);

    }
}
