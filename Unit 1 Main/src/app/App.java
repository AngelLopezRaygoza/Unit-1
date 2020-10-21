package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

    

    Boolean isFinished = false;

    int correctAns = 7;


    while (isFinished == false) {

System.out.println("Guess the correct number between 0-100");

int guess = input.nextInt();

        if (guess == correctAns) {
        System.out.println("Correct!");
        isFinished = true;
    }
    else{
        if (guess > correctAns) {
            System.out.println("High");
        }
        else {
            System.out.println("Low");
        }
    }
    }

  

        
 }
}
