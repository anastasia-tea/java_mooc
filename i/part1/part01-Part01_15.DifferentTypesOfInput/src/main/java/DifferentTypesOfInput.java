
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string1 = scan.nextLine();
        
        System.out.println("Give an integer:");
        int integer1 = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double double1 = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean boolean1 = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + string1);
        System.out.println("You gave the integer " + integer1);
        System.out.println("You gave the double " + double1);
        System.out.println("You gave the boolean " + boolean1);
    }
}
