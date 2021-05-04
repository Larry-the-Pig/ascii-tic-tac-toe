package maintictactoe;

import java.util.Scanner;

public class Maintictactoe {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        
        String inputed = "";
        boolean mygameWon = false;
        char[] myinputList = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        tictactoe mytictactoe = new tictactoe();
        
        while (mygameWon == false) {
            System.out.println(myinputList[0] + "|" + myinputList[1] + "|" + myinputList[2]);
            System.out.println("_____");
            System.out.println(myinputList[3] + "|" + myinputList[4] + "|" + myinputList[5]);
            System.out.println("_____");
            System.out.println(myinputList[6] + "|" + myinputList[7] + "|" + myinputList[8]);
            inputed = myscanner.nextLine();
            mytictactoe.playGame(inputed);
            
            myinputList = mytictactoe.getinput();
            mygameWon = mytictactoe.getgameswon();
        }
    }
}
