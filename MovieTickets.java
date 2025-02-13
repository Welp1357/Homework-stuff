/*Ben Dickman
 * Feb 12, 2025
 * CSE 007 Spring 2025
 * to practice using arithmetic operations and selection statements to create a simple prompt-driven program to calculate the cost of a movie ticket given basic input from the user */

import java.util.Scanner;

public class MovieTickets {
    public static void main(String[]args) {
       
        final double SALES_TAX = .06;
            
            Scanner userInput = new Scanner(System.in);
             
                System.out.println("Enter time ( Morning, Matinee, Evening): ");
                String timeCheck = userInput.nextLine();

                System.out.println("Enter age: ");
                int age = userInput.nextInt();

                    if (age < 0) {
                        System.out.println("Free admission! Yay!");
                    }

                    if (!timeCheck.equals("Morning") && !timeCheck.equals("Matinee") && !timeCheck.equals("Evening")) {
                        System.out.println("Error: Invalid Time! Must be Morning, Matinee, Evening");
                    }

                    double ticketPrice = 0;

                        switch (timeCheck) {
                                case "Morning":
                                if(age >= 0 && age <= 3) {
                                    ticketPrice = 0;
                                }
                                else if (age >= 4 && age <=10) {
                                    ticketPrice = 0;
                                }
                                else {
                                    ticketPrice = 7;
                                }
                        
                                break;

                                case "Matinee":
                                if(age >= 0 && age <= 3) {
                                    ticketPrice = 0;
                                }
                                else {
                                    ticketPrice = 10;
                                }
                                break;

                                case "Evening":
                                if(age >= 0 && age <= 3) {
                                    ticketPrice = 0;
                                }
                                else if (age >= 4 && age <=16) {
                                    ticketPrice = 14;
                                }
                                else if (age >= 17 && age <=54) {
                                    ticketPrice = 20;
                            }
                                else {
                                    ticketPrice = 15;
                                }
                                break;
                            }
                        double finalCost = ticketPrice * (1 + SALES_TAX);

                            System.out.printf("Movie Tickets for %s and %d is $%.2f%n", timeCheck, age, finalCost);
                            
    }
}
