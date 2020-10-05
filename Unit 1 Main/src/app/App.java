package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    
        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " can be evenly divided by four");
            } else {
                System.out.println(i + " cannot be evenly divided by four");
            }

        } 
        

    }
}