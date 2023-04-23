import java.util.Scanner;

public class TheaterKiosk {//defines a new class named entrykiosk
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//CREATES A NEW SCANNER OBJECT NAMED SCANNER THAT READS INPUT FROM THE STANDARD INPUT STREAM
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();//CODE PROMPT THE USER TO ENTER THEIR AGE AND READ THE INPUT AS INTEGER USING THE NEXTINT METHOD OF THE SCANNER CLASS. STORE THE AGE IN THE VARIABLE AGE
        if (age >= 21) {
            System.out.println("You get a wrist band!");
        }//USE AN IF STATEMENT TO CHECK IF THE USERS AGE IS GREATER THAN OR EQUAL TO 21. IF IT IS WE DISPLAY A MESSAGE TO THE USER INDICATING THAT THEY GET A WRIST BAND. IF YOUNGER NOTHING HAPPENS.
    }
}
