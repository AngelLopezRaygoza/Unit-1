package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to dog facts, please choose a fact (1-5)");
       
        String numEnt = input.nextLine();

        String num1 = "1";
        String num2 = "2";
        String num3 = "3";
        String num4 = "4";
        String num5 = "5";

        if (numEnt.equals(num1)) {
            System.out.println("A dog’s nose print is unique, much like a person’s fingerprint.");
        }
        else if (numEnt.equals(num2)) {
            System.out.println("Forty-five percent of U.S. dogs sleep in their owner’s bed.");
        }
        else if (numEnt.equals(num3)) {
            System.out.println("Seventy percent of people sign their dog’s name on their holiday cards.");
        }
        else if (numEnt.equals(num4)) {
            System.out.println("The shape of a dog’s face suggests its longevity: A long face means a longer life.");
        }
        else if (numEnt.equals(num5)) {
            System.out.println("Human blood pressure goes down when petting a dog. And so does the dog’s.");
        }
        else {
            System.out.println("There was an error");
        }
    }
}