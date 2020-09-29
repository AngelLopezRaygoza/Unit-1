package app;


public class App {
    public static void main(String[] args) throws Exception {
      int count = 0;
      String color = "blue";
      boolean truOrFal = false; 

        while (count <= 15) {
            System.out.println("The count is " + count);
            count = count + 1;
        }
        System.out.println("Count finished");

        while (color == "blue") {
            System.out.println("The color is " + color);
            color = "yellow";
        }
        System.out.println("Color finished");

        while (truOrFal = false) {
            System.out.println("I like programming is" + truOrFal);
            truOrFal = true; 
        }
        System.out.println("Statement finished");
    }
}