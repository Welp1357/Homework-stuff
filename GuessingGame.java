/* Ben Dickman
 * CSE7
 * 2/26/2025
 * The objective of this assignment is to practice using selection statements, loops and input validation to create a number guessing game where the program picks a random number, and the user tries to guess it.
 */

 import java.util.Scanner;
 import java.util.Random;
 
 public class GuessingGame {
     public static void main(String[] args) {
         
         Random rand = new Random();
         Scanner scnr = new Scanner(System.in);
 
             do{ 
 
                 System.out.println(" I have picked a nimber between 1 and 20. Try to guess it!");
                 int selectedNumber = rand.nextInt(20) + 1;
                     int guess = -1;
                     int trys = 0;
 
                     while (guess != selectedNumber) {
 
                         System.out.println("What do you think it is? (1-20): ");
 
                             while (!scnr.hasNextInt()) {
                                 System.out.println("Something wrong with the input. Try again with a number between 1 and 20: ");
                                 scnr.next();
 
                             } // part of the second while loop
 
                             guess =scnr.nextInt();
 
                             if( guess < 1 || guess > 20) {
                                 System.out.println("Seems your number may be a wee bit out of the number range. How about you try a number WITHIN the range :D");
                                 continue;
                             } // part of if loop
 
                             trys++;
 
                                 if (guess < selectedNumber) {
                                     System.out.println("Too Low! Try again.");
                                 } else if( guess > selectedNumber) {
                                     System.out.println("Too High! Try again.");
                                 } else {
                                     System.out.println("Correct! You guessed it in " + trys + "attempts.");
                                 }
                              } // part of the while loop
 
                             System.out.print("Do you want to play again? (yes/no): ");
                                 String response = scnr.next().toLowerCase();
                                     
                                     while (!response.equals("yes") && !response.equals("no")) {
                                         System.out.println("Invalid input! Please type 'yes' or 'no'.");
                                         response = scnr.next().toLowerCase();
 
                                     }
                                         if (response.equals("no")) {
                                             System.out.println("Thanks for playing!");
                                             break;
                                         }
                                     
                 } while (true);
 
                 scnr.close();
 
    } 
 } 
              
 
