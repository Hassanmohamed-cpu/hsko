import java.util.Scanner;

public class SmartRestaurant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double drinkPrice = 15.50;

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter meal price: ");
        double meal = sc.nextDouble();

        System.out.print("Enter drinks number: ");
        int drinks = sc.nextInt();

        System.out.print("Are you a student? ");
        boolean student = sc.nextBoolean();

        System.out.print("Enter rating (1-5): ");
        int rating = sc.nextInt();

        double drinksCost = drinks * drinkPrice;
        double subtotal = meal + drinksCost;
        double discount = 0;

        if (student) {
            discount = subtotal * 0.10;
        }
        else if (age >= 60) {
            discount = subtotal * 0.05;
        }

        double total = subtotal - discount;
        double tip = 0;

        if (rating >= 1 && rating <= 5) {

            if (rating >= 4) {
                tip = total * 0.10;
            }

            total = total + tip;

            int wholeAmount = (int) total;

            System.out.println("\nSMART RESTAURANT");
            System.out.println("Customer: " + name);
            System.out.println("Meal: $" + meal);
            System.out.println("Drinks: $" + drinksCost);
            System.out.println("Discount: $" + discount);
            System.out.println("Tip: $" + tip);
            System.out.println("Final bill: $" + total);
            System.out.println("Whole amount: $" + wholeAmount);

        } else {
            System.out.println("Invalid rating!");
        }

        sc.close();
    }
}