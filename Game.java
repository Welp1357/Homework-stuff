import java.util.Scanner;

public class Game {

    public static void main(String [] args) {
        Board b = new Board();
        b.printBoard();

        Scanner scnr = new Scanner(System.in); // creating a new scanner for user input --> note scanner should be outside the loop

            boolean gameLoop = true; //need to make sure the game loops after each round. could maybe be accomplished with a while loop?
 
            String player = "O";

            String player2 = "X";

            while (gameLoop) {

                System.out.println("Where would you like to place the Token?");
                    
                System.out.println("Choose a number between 1-9");

                    b.printBoard();

                    int numberCheck = scnr.nextInt(); // validating the new integer to variable numberCheck

                    String position = Integer.toString(numberCheck); //converting int to String

                if(numberCheck >= 1 && numberCheck <=9) {
                    
                    System.out.println("You selected " + numberCheck);

                } else {

                    System.out.println("Try again with another input.");

                }


                if(b.checkSpace(position)) {

                    System.out.println("That space is available, good move!");

                    b.changePosition(position, player);

                } else {

                    System.out.println("Unfortunately that space isnt available, try again.");
                    
                }



                b.printBoard(); //needs to come at the very end because that shows the last move


                // how can i make it so that players switch turns?

                if(player.equals("O")) {
                    
                    player = "X";
                    
                    b.changePosition(position, player); //switching players

                } else 
                { player = "O";
                
                }



            }   

        scnr.close();

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
