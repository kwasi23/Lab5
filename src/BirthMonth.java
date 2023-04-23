import java.util.Scanner;//imports the scanner class from the java.util packaage
public class BirthMonth {//defines a new clas named birthmonth
    public static void main(String[] args) {//defines the main method birthmonth class.
        Scanner scanner = new Scanner(System.in);////creates a new scanner object named scanner that reads input from the standard input stream which is typically the keyboard
        System.out.print("Enter your birth month (1-12): ");//displays message to the user asking them to enter their birth month
        int month = scanner.nextInt();//reads an integer value from the user using the scanner object and stores it in the variable
        if (month >= 1 && month <= 12) {//code checks if the value of month is between 1 and 12 using a logical and operator
            System.out.println("Your birth month is: " + month);//displays message stating the month is valid
        } else {//will be executed if the previous if statement evaluate to false.
            System.out.println("You entered an incorrect month value: " + month);//displays a message to the user telling them that they entered them that they enteted an incorrect month value if the value of month is not between 1 and 12
    }
    }
}
