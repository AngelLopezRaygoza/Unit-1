package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num1 = input.nextInt();

        System.out.println("Please enter another number");
        int num2 = input.nextInt();

        System.out.println(" ");

        for (;num1 < num2 - 2; num1++) {
            if (num1 % 2 == 0) {
                System.out.println(num1 + 2);

            }


        }



    }
}
