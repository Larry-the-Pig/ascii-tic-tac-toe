package maintictactoe;

public class tictactoe {
    boolean gameWon = false;
    char currentPlayer = 'X';
    int i = 0;

    char[] inputList = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    char topLeft = ' ';
    char topMiddle = ' ';
    char topRight = ' ';
    char middleLeft = ' ';
    char middleMiddle = ' ';
    char middleRight = ' ';
    char bottomLeft = ' ';
    char bottomMiddle = ' ';
    char bottomRight = ' ';
    
    public void playGame(String inputed) {
        if((i % 2) == 1) {
            currentPlayer = 'O';
        }
        
        if(inputed.equals("1,1")) {
            if(topLeft != ' ') {
                System.out.println("Space already taken");
            }
            else {
                topLeft = currentPlayer;
            }
        }
        else if(inputed.equals("1,2")) {
            if(topMiddle != ' ') {
                System.out.println("Space already taken");
            }
            else {
                topMiddle = currentPlayer;
            }
        }
        else if(inputed.equals("1,3")) {
            if(topRight != ' ') {
                System.out.println("Space already taken");
            }
            else {
                topRight = currentPlayer;
            }
        }
        else if(inputed.equals("2,1")) {
            if(middleLeft != ' ') {
                System.out.println("Space already taken");
            }
            else {
                middleLeft = currentPlayer;
            }
        }
        else if(inputed.equals("2,2")) {
            if(middleMiddle != ' ') {
                System.out.println("Space already taken");
            }
            else {
                middleMiddle = currentPlayer;
            }
        }
        else if(inputed.equals("2,3")) {
            if(middleRight != ' ') {
                System.out.println("Space already taken");
            }
            else {
                middleRight = currentPlayer;
            }
        }
        else if(inputed.equals("3,1")) {
            if(bottomLeft != ' ') {
                System.out.println("Space already taken");
            }
            else {
                bottomLeft = currentPlayer;
            }
        }
        else if(inputed.equals("3,2")) {
            if(bottomMiddle != ' ') {
                System.out.println("Space already taken");
            }
            else {
                bottomMiddle = currentPlayer;
            }
        }
        else if(inputed.equals("3,3")) {
            if(bottomRight != ' ') {
                System.out.println("Space already taken");
            }
            else {
                bottomRight = currentPlayer;
            }
        }
        else {
            System.out.println("Invalid Space");
            i--;
        }


        if((topLeft == 'X' && topMiddle == 'X' && topRight == 'X') || (middleLeft == 'X' && middleMiddle == 'X' && middleRight == 'X') || (bottomLeft == 'X' && bottomMiddle == 'X' && bottomRight == 'X') || (topLeft == 'X' && middleLeft == 'X' && bottomLeft == 'X') || (topMiddle == 'X' && middleMiddle == 'X' && bottomMiddle == 'X') || (topRight == 'X' && middleRight == 'X' && bottomRight == 'X') || (topLeft == 'X' && middleMiddle == 'X' && bottomRight == 'X') || (topRight == 'X' && middleMiddle == 'X' && bottomLeft == 'X')) {
            gameWon = true;
            System.out.println("X won!");
        }
        if((topLeft == 'O' && topMiddle == 'O' && topRight == 'O') || (middleLeft == 'O' && middleMiddle == 'O' && middleRight == 'O') || (bottomLeft == 'O' && bottomMiddle == 'O' && bottomRight == 'O') || (topLeft == 'O' && middleLeft == 'O' && bottomLeft == 'O') || (topMiddle == 'O' && middleMiddle == 'O' && bottomMiddle == 'O') || (topRight == 'O' && middleRight == 'O' && bottomRight == 'O') || (topLeft == 'O' && middleMiddle == 'O' && bottomRight == 'O') || (topRight == 'O' && middleMiddle == 'O' && bottomLeft == 'O')) {
            gameWon = true;
            System.out.println("O won!");
        }
        i++;
        currentPlayer = 'X';

        if(i > 9) {
            gameWon = true;
            System.out.println("No winners!");
        }
        
        inputList[0] = topLeft;
        inputList[1] = topMiddle;
        inputList[2] = topRight;
        inputList[3] = middleLeft;
        inputList[4] = middleMiddle;
        inputList[5] = middleRight;
        inputList[6] = bottomLeft;
        inputList[7] = bottomMiddle;
        inputList[8] = bottomRight;
    }
    
    public char[] getinput() {
        return inputList;
    }
    public boolean getgameswon() {
        return gameWon;
    }
}
