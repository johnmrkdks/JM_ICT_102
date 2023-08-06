package Week4;
import java.util.Scanner;
public class week4_practice {

    static double mixedBarbeque = 58.55, fatoush = 11, taboli = 12.10, kabeneyah = 20.53, arabicMixedPlate = 53.20, coke = 3.55, sprite = 2, fanta600ml = 6.10, vBlue = 4.53, redBull = 5.20;
    static double food = 0, drinks = 0, total = 0, totalPayment = 0;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        String choice;

        System.out.println("Hi how are you, how can I help you?");
        System.out.println("Do you want to order? (YES / NO) : ");
        choice = sc.nextLine();

        switch(choice){

            case "yEs", "Yes", "YEs", "yES", "yeS", "YeS", "yes":
                foodMenus();
                drinkMenus();
                totalFormula();
                payment();
                break;

            case "No", "NO", "nO", "no":
                System.out.println("Thank you come again");
                break;

            default:
                System.out.println("Invalid input, Please try again");
                main(args);

        }



    }

    public static void foodMenus() {

        System.out.println("\n-----Food Menus-----");
        System.out.println("1. Mixed Barbeque - $58.55");
        System.out.println("2. Fatoush - $11");
        System.out.println("3. Taboli - $12.10");
        System.out.println("4. Kabeneyah - $20.53");
        System.out.println("5. Arabic mixed plate - $53.20");
        System.out.print("Your choie: ");
        food = sc.nextInt();

        if (food == 1) {
            System.out.println("Your selected Mixed Barbeque");
        }
        else if(food == 2) {
            System.out.println("Your selected Fatoush");
        }
        else if(food == 3) {
            System.out.println("Your selected Taboli");
        }
        else if(food == 4) {
            System.out.println("Your selected Kabeneyah");
        }
        else if(food == 5) {
            System.out.println("Your selected Arabic mixed plate");
        }
        else {
            System.out.println("Invalid Input! Please try again");
            foodMenus();
        }

    }

    public static void drinkMenus() {

        System.out.println("\n-----Drink Menus-----");
        System.out.println("1. Coke - $3.55");
        System.out.println("2. Sprite - $2");
        System.out.println("3. Fanta 600ml - $6.10");
        System.out.println("4. V Blue - $4.53");
        System.out.println("5. Redbull - $5.20");
        System.out.print("Your choie: ");
        drinks = sc.nextInt();

        if (drinks == 1) {
            System.out.println("Your selected Coke");
        }
        else if(drinks == 2) {
            System.out.println("Your selected Sprite");
        }
        else if(drinks == 3) {
            System.out.println("Your selected Fanta 600ml");
        }
        else if(drinks == 4) {
            System.out.println("Your selected V Blue");
        }
        else if(drinks == 5) {
            System.out.println("Your selected Redbull");
        }
        else {
            System.out.println("Invalid Input! Please try again");
            drinkMenus();
        }
    }

    public static void totalFormula() {
        if(food == 1 && drinks == 1) {
            total = mixedBarbeque + coke;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 1 && drinks == 2) {
            total = mixedBarbeque + sprite;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 1 && drinks == 3) {
            total = mixedBarbeque + fanta600ml;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 1 && drinks == 4) {
            total = mixedBarbeque + vBlue;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 1 && drinks == 5) {
            total = mixedBarbeque + redBull;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 2 && drinks == 1) {
            total = fatoush + coke;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 2 && drinks == 2) {
            total = fatoush + sprite;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 2 && drinks == 3) {
            total = fatoush + fanta600ml;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 2 && drinks == 4) {
            total = fatoush + vBlue;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 2 && drinks == 5) {
            total = fatoush + redBull;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 3 && drinks == 1) {
            total = taboli + coke;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 3 && drinks == 2) {
            total = taboli + sprite;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 3 && drinks == 3) {
            total = taboli + fanta600ml;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 3 && drinks == 4) {
            total = taboli + vBlue;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 3 && drinks == 5) {
            total = taboli + redBull;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 4 && drinks == 1) {
            total = kabeneyah + coke;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 4 && drinks == 2) {
            total = kabeneyah + sprite;
            System.out.printf("$%.2f is you total payable amount", total);
        }else if( food == 4 && drinks == 3) {
            total = kabeneyah + fanta600ml;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 4 && drinks == 4) {
            total = kabeneyah + vBlue;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 4 && drinks == 5) {
            total = kabeneyah + redBull;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 5 && drinks == 1) {
            total = arabicMixedPlate + coke;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 5 && drinks == 2) {
            total = arabicMixedPlate + sprite;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 5 && drinks == 3) {
            total = arabicMixedPlate + fanta600ml;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 5 && drinks == 4) {
            total = arabicMixedPlate + vBlue;
            System.out.printf("$%.2f is you total payable amount", total);
        }
        else if( food == 5 && drinks == 5) {
            total = arabicMixedPlate + redBull;
            System.out.printf("$%.2f is you total payable amount", total);
        }
    }

    public static void payment() {
        System.out.print("\n\nInput your amount: $");
        totalPayment = sc.nextDouble();

        totalPayment = totalPayment - total;

        System.out.printf("$%.2f is your total change",totalPayment);
        System.out.print("\nThank you Come again!");
    }
}
