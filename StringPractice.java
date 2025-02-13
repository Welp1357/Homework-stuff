/*Ben Dickman
 * Feb 12, 2025
 * CSE 007 Spring 2025
 * to to practice using and manipulating Strings */

 import java.util.Scanner;


 public class StringPractice {
     public static void main(String[]args) {
     
        System.out.println("Input 2 phrases:");
        Scanner input = new Scanner(System.in);

            String phrase1 = input.nextLine();
            String phrase2 = input.nextLine();

                if (phrase1.equals (phrase2)) {
                    System.out.println("Both Phrases match");
                }

                if (phrase1.indexOf(phrase2) !=  -1) {
                    System.out.println("output: " + phrase2 + " is found within " + phrase1);
                }

                if (phrase2.indexOf(phrase1) !=  -1) {
                    System.out.println("output: " + phrase1 + " is found within " + phrase2);
                }
                else {
                    System.out.println("output No matches");
                }
    }
}        