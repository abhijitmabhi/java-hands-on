import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("How much money do you spend on coffee?");
        double coffee = scan.nextDouble();
        counter++;

        System.out.println("How much money do you spend on fast food?");
        double fastfood = scan.nextDouble();
        counter++;

        System.out.println("How many times do you buy a coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name + " for your answering all " + counter + " questions!");

        scan.close();
    }
}
