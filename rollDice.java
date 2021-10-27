import java.util.Scanner;
import java.util.Random;
public class RollDice
{
   public static void main(String[] args)
   {
      String again = "y";  // To control the loop
      int num1;            // To hold the value of die #1
      int num2;            // to hold the value of die #2
      
      // Create a Scanner object to read keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Random object to generate random numbers.
      Random rand = new Random();
      
      // Simulate rolling the dice.
      while (again.equalsIgnoreCase("y"))
      {
         System.out.println("Your numbers are");
         num1 = rand.nextInt(50) + 1;
         num2 = rand.nextInt(50) + 1;
        
         System.out.println(num1 + " " + num2);
         
         System.out.print("Go again (y = yes)? ");
         again = keyboard.nextLine();
      }
   }
}