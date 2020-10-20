package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }

        System.out.println("Enter the correct password for the secret message");
        System.out.println("(Hint, it's four numbers long).");
        
        int i = 0;

        String passwordGuess = input.nextLine();

        String correctPassword = "1234";

        if (passwordGuess.equals(correctPassword)) {
            System.out.println("Why are we still here? Just to suffer? Every night, I can feel my leg… and my arm… even my fingers. The body I’ve lost… the comrades I’ve lost… won’t stop hurting… It’s like they’re all still there. You feel it, too, don’t you?");
        }
        else {
            System.out.println("Incorrect password, please try again");
        if (i <= 0);{ 
        String passwordGuess2 = input.nextLine();
        if (passwordGuess2.equals(correctPassword)) {
            System.out.println("Why are we still here? Just to suffer? Every night, I can feel my leg… and my arm… even my fingers. The body I’ve lost… the comrades I’ve lost… won’t stop hurting… It’s like they’re all still there. You feel it, too, don’t you?");
        }
        else {
            System.out.println("Incorrect password, please try again");
        
        
        if (i <= 0);{ 
        String passwordGuess3 = input.nextLine();
        if (passwordGuess3.equals(correctPassword)) {
            System.out.println("Why are we still here? Just to suffer? Every night, I can feel my leg… and my arm… even my fingers. The body I’ve lost… the comrades I’ve lost… won’t stop hurting… It’s like they’re all still there. You feel it, too, don’t you?");
        }
        else {
            System.out.println("Incorrect password");
        }
        }
}
}   
}
}
}