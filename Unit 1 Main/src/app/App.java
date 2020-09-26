package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a pizza topping");
        String pizzTopp = input.nextLine();
        System.out.println("Enter your favorite food");
        String favFood = input.nextLine();
        System.out.println("Enter healthy food");
        String heaFoo = input.nextLine(); 
        System.out.println("Enter name of person");
        String namPer = input.nextLine();
        System.out.println("Enter a noun");
        String noun = input.nextLine();

        System.out.println("Sam really likes " + pizzTopp + " pizza." + " But he likes " + favFood + " even more." + " He knows he should eat more " + heaFoo + ". " + namPer + " has told him so." + " Even the " + noun + " in his bathroom." + " Uh, oh.");

    }
}