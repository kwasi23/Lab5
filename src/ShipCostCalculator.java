import java.util.Scanner;//import the scanner class so we can read the input from the user

public class ShipCostCalculator {//define new class
    public static void main(String[] args) {//define new method called main which is the entry point for the program
        Scanner scanner = new Scanner(System.in);//create a new scanner object to read input from user
        System.out.print("Enter the price of the item: ");////prompt user to enter the rpice
        double price = scanner.nextDouble();//read the users input and convert it to a double
        double shippingCost;//declare a variable to hold shipping cost
        if (price >= 100) {//if the item price is more than 100 or equal the shipping is free
            shippingCost = 0;//set shipping to 0
        } else {
            shippingCost = price * 0.02;//calculate the shipping as 2 percent of the cost
        }

        double totalPrice = price + shippingCost;//calculate the total cost as the price plus shipping cost

        System.out.printf("Shipping cost: $%.2f\n", shippingCost);//output the shipping cost with 2 decimal places
        System.out.printf("Total price: $%.2f\n", totalPrice);//output the total cost with 2 decimal places

        scanner.close();
    }
}
