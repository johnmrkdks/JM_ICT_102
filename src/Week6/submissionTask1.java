package Week6;
import java.util.Scanner;

public class submissionTask1 {
    static String from, to, day, selectedTime, time1 = "7am", time2 = "4pm", time3 = "6pm";


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("---WELCOME TO TRAINLINK---");
        System.out.println("Please input your travel Destination");
        System.out.print("From: ");
        from = input.nextLine();
        System.out.print("To: ");
        to = input.nextLine();
        day();
        time();
        if(from.equalsIgnoreCase("Stratfield") && to.equalsIgnoreCase("Blayney")){
            System.out.println("Duration of whole trip is approximately 4 hours");
            do{
                System.out.println("Please confirm your Travel details");
                System.out.printf("Destination  %s --> %s, %s at %s", from, to, day, selectedTime);
            }while(false);

        }else if(from.equalsIgnoreCase("Stratfield") && to.equalsIgnoreCase("Orange")){
            System.out.println("Duration of whole trip is approximately 4.5 hours");
            do{
                System.out.println("Please confirm your Travel details");
                System.out.printf("Destination  %s --> %s, %s at %s", from, to, day, selectedTime);
            }while(false);
        } else if (from.equalsIgnoreCase("Stratfield") && to.equalsIgnoreCase("Bathurst")) {
            System.out.println("Duration of whole trip is approximately 3 hours");
            do{
                System.out.println("Please confirm your Travel details");
                System.out.printf("Destination  %s --> %s, %s at %s", from, to, day, selectedTime);
            }while(false);
        } else if (from.equalsIgnoreCase("Stratfield") && to.equalsIgnoreCase("Dubbo")) {
            System.out.println("Duration of whole trip is approximately 6 hours");
            do{
                System.out.println("Please confirm your Travel details");
                System.out.printf("Destination  %s --> %s, %s at %s", from, to, day, selectedTime);
            }while(false);
        }

    }
    public static void day(){
        Scanner days = new Scanner(System.in);
//Unfinished!!
        do {
            System.out.println("Monday | Tuesday | Wednesday | Thursday | Friday | Saturday | Sunday");
            System.out.print("Select Day: ");
            day = days.nextLine();
        }while(false);
    }
    public static void time(){
        do{
            Scanner schedule = new Scanner(System.in);
            System.out.println("7am | 4pm | 6pm");
            boolean counter = false;
            do {

                System.out.print("Select Time: ");
                selectedTime = schedule.nextLine();
                if (time1.equals(selectedTime) || time2.equals(selectedTime) || time3.equals(selectedTime)){
                    counter = true;
                }else{
                    System.out.println("Invalid, Try again!");
                }
            }while(!counter);

        }while(false);
    }

}
