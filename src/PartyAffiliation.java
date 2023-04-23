import java.util.Scanner;//imports the scanner class from the javautil package

public class PartyAffiliation {//defines new class named partyaffiliation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//creates a new scanner object named scanner that reads input from the standard input stream
        System.out.println("Enter your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");//reads the users input and convert it to uppercase ensuring thast we can match it against our switch statement. we then extract the first character of the input using the charat method and store it in the varaible choice.

        String input = scanner.nextLine().toUpperCase();
        char choice = input.charAt(0);

        String animal = "";

        switch (choice) {
            case 'D':
                animal = "Donkey";
                break;
            case 'R':
                animal = "Elephant";
                break;
            case 'I':
                animal = "INDEPENDENT";
                break;
            default:
                animal = "Other";
                break;//code use a switch statement to determine the animal that corresponds to the user's party affiliation. If the user enters 'D', we set animal to "Donkey"; if they enter 'R', we set animal to "Elephant"; if they enter 'I', we set animal to "Person"; otherwise, we set animal to "Other"
        }

        System.out.println("You are a " + input + " " + animal + ".");// displays the result to the user, concatenating the user's input, the animal, and a message.
    }
}
