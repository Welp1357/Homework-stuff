/* Ben Dickman
* 3/7/2025
* Homework 3
* The objective of this assignment is to practice incorporating arrays into a java program using a seeded Random Number object & command line arguments.
*/


import java.util.Random;


public class RandomArrays {
    public static void main(String[] args) {


        if (args.length != 2) {
            System.out.println("Error! Missing command line arguments)");
            return;
        }


        int length = 0;
        int seed = 0;


        try {
            length = Integer.parseInt(args[0]);
            seed = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error! Invalid command line argument(s)");
            return;
        }


        if (length < 0) {  
            System.out.println("Error! Array length must be greater than 0");
            return;
        }

        Random random = new Random(seed);
        double[] array = new double[length];


        System.out.println("Creating the Array...");
        System.out.println("Filling the Array...");


        for (int i = 0; i < length; i++) {
            array[i] = 12.5 + (random.nextDouble() * (74.5 - 12.5)); 
        }


        System.out.println("Printing the Array...");
        for (int i = 0; i < length; i++) {
            System.out.printf("Element %d: %.4f/n", i, array[i]); 
        }


        double max = array[0];
        double min = array[0];
        double sum = 0;
        int maxIndex = 0;
        int minIndex = 0;


        for (int i = 1; i < length; i++) {  
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }


        double average = sum / length; 


        System.out.printf("Average of all %d values: %.4f\n", length, average);
        System.out.printf("Min Value of %.4f found at index=%d\n", min, minIndex);
        System.out.printf("Max Value of %.4f found at index=%d\n", max, maxIndex);
  
  
    }
}
