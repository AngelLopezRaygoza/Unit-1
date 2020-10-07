package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Where is the Great Barrier Reef located?");
        String answer1 = input.nextLine();
        String correctAnswer1 = "Australia";
        if (answer1.equals(correctAnswer1)){
            System.out.println("Correct"); 
        } else {
            System.out.println("Incorrect");
        }
        System.out.println("Which country gifted the Statue of Liberty to the US?");
        String answer2 = input.nextLine();
        String correctAnswer2 = "France";
        if (answer2.equals(correctAnswer2)){
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
        System.out.println("What is the name of the longest river in South America?");
        String answer3 = input.nextLine();
        String correctAnswer3 = "Amazon River";
        if (answer3.equals(correctAnswer3)){
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
        System.out.println("In which movie is the villain \"Clayton\" from?");
        String answer4 = input.nextLine();
        String correctAnswer4 = "Tarzan";
        if (answer4.equals(correctAnswer4)){
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
        System.out.println("In which ocean is the Bermuda Traingle located?");
        String answer5 = input.nextLine();
        String correctAnswer5 = "Atlantic Ocean";
        if (answer5.equals(correctAnswer5)){
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

        int score = 0;

        if (answer1.equals(correctAnswer1)) score++;
        if (answer2.equals(correctAnswer2)) score++;
        if (answer3.equals(correctAnswer3)) score++;
        if (answer4.equals(correctAnswer4)) score++;
        if (answer5.equals(correctAnswer5)) score++;

        System.out.println("Your score is " + score + "/5");

        System.out.println("Percent out of a hundred: " + score*20 + "%"); 

    }
}