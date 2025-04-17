public class Board{

    int columns = 3;
    int rows = 3; 

    String [] [] gameArray = new String [columns] [rows]; // needs to be outside the public Board() because it cant be accessed by other methods
    
    public Board() {
      // need a 2 dimensional array to represent the board, could be done with a 2D string array. 
      // one to represent the array of numbers 1-9 and the other for the letters (X,O)
  
        gameArray [0] [0] = "1";
        gameArray [0] [1] = "2";
        gameArray [0] [2] = "3";
        gameArray [1] [0] = "4";
        gameArray [1] [1] = "5";
        gameArray [1] [2] = "6";
        gameArray [2] [0] = "7";
        gameArray [2] [1] = "8";
        gameArray [2] [2] = "9";
    }
  
    public void printBoard() {
        for (int i = 0; i < gameArray.length; i++){ 
            for (int o = 0; o < gameArray[i].length; o++) {
                System.out.print(gameArray[i][o] + " "); // prints the value with space between each element
            }
            System.out.println(); // since we know the game array length is 3, it resets the row every 3 elements.
                            // needs to be outside the second for() loop because otherwise it would print every other element, so the list would go from 1-9 decending down the page,
        }
    }
  
    public void changePosition(String pos, String play) {
        
        for(int i = 0; i < gameArray.length; i++) {
            for(int o = 0; o < gameArray[i].length; o++) {

                if(pos.equals(gameArray [i] [o])) { //cant use == because thats only implemented with primative types, like int
                    gameArray [i] [o] = play;
                }

            }
        }
    }

    public boolean checkWin() {

        for(int i = 0; i < gameArray.length; i++) { // needs to be able to search each row
            // need something to be declared as like a win variable through .equals() because otherwise youre just comparing arrays to nothing
            // could use 0 or 1, 0 being true, 1 being false
            if(gameArray[i][0].equals(0) && gameArray[i][0].equals(gameArray[i][1]) && gameArray[i][0].equals(gameArray[i][2])) { //need to compare each row to the next to see if there are any potential wins

                return true;
            }
        }

        for(int o = 0; o < gameArray.length; o++) {
            if(gameArray[0][o].equals(0) && gameArray[0][o].equals(gameArray[1][o]) && gameArray[1][o].equals(gameArray[2][o]) ) { //same thing for the columns

                return true;
            }
        }

        // scanner could go diagnal by maybe starting at array [0][0] then [1][1] and finally [2][2]
        if(gameArray[0][0].equals(0) && gameArray[0][0].equals(gameArray[1][1]) && gameArray[1][1].equals(gameArray[2][2])) {
            
            return true;
        }

        //now just the reverse order from the top right instead
        if(gameArray[0][2].equals(0) && gameArray[0][2].equals(gameArray[1][1]) && gameArray[1][1].equals(gameArray[2][0])) {

            return false;
        }

    //otherwise
    return false;

    }

    public boolean checkSpace(String pos) {

        if(pos.equals("1") || pos.equals("2") || pos.equals("3") || pos.equals("4") || pos.equals("5") || pos.equals("6") || pos.equals("7") || pos.equals("8") || pos.equals("9")) {
            return true;
        }

    return false;

    }
}

