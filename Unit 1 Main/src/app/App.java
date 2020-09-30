package app;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int count = 0;
        
        System.out.println("Enter a color");
        String color = input.nextLine();

        System.out.println("Enter a number");
        int number = input.nextInt(); 
        System.out.println(" ");

        while (count <= number) {
            System.out.println(color);
            count = count + 1;
        }


        
        





    }
}