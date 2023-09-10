package Week10;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


public class distanceTravelled {

    public static void main(String[] args) throws IOException {


        PrintWriter pw = new PrintWriter("trial1.txt");


        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> kms = new ArrayList<Integer>();

        int counter = 0;
        for(int i = 1; counter<3; i++) {
            System.out.print("Enter the total KMS travelled: ");
            pw.print("Enter the total KMS travelled: ");
            int number = sc.nextInt();



            if(number > 0) {
                kms.add(number);
                pw.println(number);
                counter++;
            }
            else System.out.println("Invalid input");
        }
        System.out.println("Day\tTotal KMS covered");
        System.out.println("-------------------------");
        pw.println("Day\tTotal KMS covered");
        pw.println("-------------------------");

        int sum = 0;
        for(int i = 0; i<kms.size(); i++) {
            sum += kms.get(i);
            System.out.println("Day "+(i+1)+"\t\t"+sum);
            pw.println("Day "+(i+1)+"\t\t"+sum);


        }
        pw.close();

    }
}
