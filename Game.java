import java.util.Scanner;

public class Game {

    public static void main(String [] args) {
        Board b = new Board();
        b.printBoard();


 


            while (gameLoop) {

                System.out.println("Where would you like to place the O Token?");
                    
                System.out.println("Choose a number between 1-9");

                    Scanner scnr = new Scanner(System.in); // creating a new scanner for user input


                    int numberCheck = scnr.nextInt(); // validating the new integer to variable numberCheck

                    String position = Integer.toString(numberCheck);

                    scnr.close();

                if(numberCheck >= 1 && numberCheck <=9) {
                    
                    System.out.println("You selected " + numberCheck);

                } else {

                    System.out.println("Try again with another input.");

                }
        
                if(b.checkSpace(position)) {
                    System.out.println("That space is available, good move!");
                
                } else {

                    System.out.println("Unfortunately that space isnt available, try again.");
                    
                }



                    b.changePosition(position, "O");
                    
                    b.printBoard();

            }   


        

    }
}



/*while{
    for(int i = 0; i < gameArray.length; i++) { 
        if(gameArray[i][0].equals(0) && gameArray[i][0].equals(gameArray[i][1]) && gameArray[i][0].equals(gameArray[i][2])) { //need to compare each row to the next to see if there are any potential wins
            
            return;
        }
    }
    for(int o = 0; o < gameArray.length; o++) {
        if(gameArray[0][o].equals(0) && gameArray[0][o].equals(gameArray[1][o]) && gameArray[1][o].equals(gameArray[2][o]) ) { //same thing for the columns
            
            return;
        }
    }
    if(gameArray[0][0].equals(0) && gameArray[0][0].equals(gameArray[1][1]) && gameArray[1][1].equals(gameArray[2][2])) {
    
        return;
    }
    if(gameArray[0][2].equals(0) && gameArray[0][2].equals(gameArray[1][1]) && gameArray[1][1].equals(gameArray[2][0])) {
        
        return;
    }
} */
