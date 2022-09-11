import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the JAVA Dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");

        String  option = scan.nextLine();

        switch(option){
            case "a":
                System.out.println("What is your budget?");
                double budget = scan.nextDouble();
                if(budget >= 10000){
                    System.out.println("A BMV is available!");

                    System.out.println("Do you have insurance?");
                    scan.nextLine();
                    String insurance = scan.nextLine();

                    System.out.println("Do you have driving licence?");
                    String licence = scan.nextLine();

                    System.out.println("What is your credit score?");
                    int creditScore = scan.nextInt(); 

                    if(insurance.equals("yes") && insurance.equals("yes") && creditScore > 660){
                        System.out.println("Well, sold! We will do business with you!");
                    }else{
                        System.out.println("Your are not eligible!");
                    }
                } else {
                    System.out.println("We don't sell car, less than $10000, sorry!");
                }
                break;
            case "b": 
                System.out.println("What is your car valued at?");
                double value = scan.nextDouble();

                System.out.println("What is your car selling price?");
                double sellingPrice = scan.nextDouble();

                if(value > sellingPrice && sellingPrice < 30000){
                    System.out.println("We will buy your car!");
                } else {
                    System.out.println("We are not interested");
                }
                break;
            default: System.out.println("Invalid option!");
        }

        scan.close();
    }
}
