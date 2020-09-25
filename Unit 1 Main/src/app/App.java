package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you first name.");
        String firstName = input.nextLine();
        System.out.println("Please enter your last name.");
        String lastName = input.nextLine();
        System.out.println("Please enter your age.");
        String yourAge = input.nextLine(); 
        System.out.println("Please enter your grade.");
        String yourGrade = input.nextLine();
        System.out.println("Please enter your favorite color.");
        String favColor = input.nextLine();

        System.out.println("Hello, " + firstName + " " + lastName + ", your are " + yourAge + ", you are a " + yourGrade + ", and your favorite color is " + favColor);

    }
}