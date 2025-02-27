/* Ben Dickman
 * CSE7
 * 2/26/2025
 * Write a program that prompts the user to enter a numbering system (binary, octal or hexadecimal), reads in a number of that type, and converts the value to its decimal equivalent.
 */

import java.util.Scanner;

public class NumConversion {
    public static void main(String[]args) {
        Scanner scnr = new Scanner(System.in);
        String system,number;


        do {
            System.out.print("Please enter the numbering system (binary, octal, or hexadecimal): ");
            
            system = scnr.next().toLowerCase();


            if (!system.equals("binary") && !system.equals("octal") && !system.equals("hexadecimal")) {
                
                System.out.println("Invalid system. Please enter 'binary', 'octal', or 'hexadecimal'.");
            }

        } while (!system.equals("binary") && !system.equals("octal") && !system.equals("hexadecimal"));

            do {
                System.out.println("Enter a " + system + "Numnber : ");
                number = scnr.next();

                    boolean valid = false;
                    switch (system) {
                        case "binary":
                            if (number.matches("[01] + {8}")) {
                                valid = true; }
                            else {
                                System.out.println("try again, must be between 0 and 1 AND 8 dgits");
                            } break;

                        case "octal":
                            if (number.matches("[0-9A-Fa-f] + {4}")) {
                                valid = true; }
                            else {
                                System.out.println("try again, must be between 0 and 7 AND 6 digits");
                            } break;

                        case "hexadecimal":
                            if (number.matches("[0-9A-Fa-f] + {4}")) {
                                valid = true; }
                            else {
                                System.out.println("try again, must be between 0 and 9 AND 4 digits");
                            } break;
                    }


                     if (valid) {
                        int decimal = 0;
                        for (int i = 0; i < number.length(); i++) {
                            char digit = number.charAt(i);
                            int value = 0;
                                if (system.equals("binary")) {
                                    value = digit - '0'; }
                                else if (system.equals("octal")) {
                                    if (Character.isDigit(digit)) {
                                        value = digit - '0'; }
                                else { 
                                    value = Character.toUpperCase(digit) - 'A' + 10; }
                                }    
                            }
                       
                            decimal += value * Math.pow(getBase(system), number.length() - i - 1);
                        }


                    } while (true);
                }

                    private static int getBase(String system) {
                        switch (system) {
                            case "binary":
                                return 2;
                            case "octal": 
                                return 8;
                            case "hexadecimal":
                                return 16;
                            default: 
                                return -1;
                        }
                    }

    }
