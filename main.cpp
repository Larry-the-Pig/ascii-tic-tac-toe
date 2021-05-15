#include <iostream>
using namespace std;

int main() {
    string inputed;
    char currentPlayer;
    int i = 0;
    bool gameWon = false;
    char inputList[9] = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    while (gameWon == false) {
        currentPlayer = 'X';
        if ((i % 2) == 1) {
            currentPlayer = 'O';
        }
        
        cout << inputList[0] << "|" << inputList[1] << "|" << inputList[2] << "\n";
        cout << "-----\n";
        cout << inputList[3] << "|" << inputList[4] << "|" << inputList[5] << "\n";
        cout << "-----\n";
        cout << inputList[6] << "|" << inputList[7] << "|" << inputList[8] << "\n";
        cin >> inputed;

        if (inputed == "1,1") {
            if (inputList[0] != ' ') {
                cout << "Space Already Taken\n";
                i--;
            } else {
                inputList[0] = currentPlayer;
            }
        }
        else if (inputed == "1,2") {
            if (inputList[1] != ' ') {
                cout << "Space Already Taken\n";
                i--;
            } else {
                inputList[1] = currentPlayer;
            }
        }
        else if (inputed == "1,3") {
            if (inputList[2] != ' ') {
                cout << "Space Already Taken\n";
                i--;
            } else {
                inputList[2] = currentPlayer;
            }
        }
        else if (inputed == "2,1") {
            if (inputList[3] != ' ') {
                cout << "Space Already Taken\n";
                i--;
            } else {
                inputList[3] = currentPlayer;
            }
        }
        else if (inputed == "2,2") {
            if (inputList[4] != ' ') {
                cout << "Space Already Taken\n";
                i--;
            } else {
                inputList[4] = currentPlayer;
            }
        }
        else if (inputed == "2,3") {
            if (inputList[5] != ' ') {
                cout << "Space Already Taken\n";
                i--;
            } else {
                inputList[5] = currentPlayer;
            }
        }
        else if (inputed == "3,1") {
            if (inputList[6] != ' ') {
                cout << "Space Already Taken\n";
                i--;
            } else {
                inputList[6] = currentPlayer;
            }
        }
        else if (inputed == "3,2") {
            if (inputList[7] != ' ') {
                cout << "Space Already Taken\n";
                i--;
            } else {
                inputList[7] = currentPlayer;
            }
        }
        else if (inputed == "3,3") {
            if (inputList[8] != ' ') {
                cout << "Space Already Taken\n";
                i--;
            } else {
                inputList[8] = currentPlayer;
            }
        }
        else {
            cout << "Invalid Input\n";
            i--;
        }

        i++;

        if ((inputList[0] == 'X' && inputList[1] == 'X' && inputList[2] == 'X') || (inputList[3] == 'X' && inputList[4] == 'X' && inputList[5] == 'X') || (inputList[6] == 'X' && inputList[7] == 'X' && inputList[8] == 'X') || (inputList[0] == 'X' && inputList[3] == 'X' && inputList[6] == 'X') || (inputList[1] == 'X' && inputList[4] == 'X' && inputList[7] == 'X') || (inputList[2] == 'X' && inputList[5] == 'X' && inputList[8] == 'X') || (inputList[0] == 'X' && inputList[4] == 'X' && inputList[8] == 'X') || (inputList[2] == 'X' && inputList[4] == 'X' && inputList[6] == 'X')) {
            gameWon = true;
            cout << "X has won!\n";
        }
        if ((inputList[0] == 'O' && inputList[1] == 'O' && inputList[2] == 'O') || (inputList[3] == 'O' && inputList[4] == 'O' && inputList[5] == 'O') || (inputList[6] == 'O' && inputList[7] == 'O' && inputList[8] == 'O') || (inputList[0] == 'O' && inputList[3] == 'O' && inputList[6] == 'O') || (inputList[1] == 'O' && inputList[4] == 'O' && inputList[7] == 'O') || (inputList[2] == 'O' && inputList[5] == 'O' && inputList[8] == 'O') || (inputList[0] == 'O' && inputList[4] == 'O' && inputList[8] == 'O') || (inputList[2] == 'O' && inputList[4] == 'O' && inputList[6] == 'O')) {
            gameWon = true;
            cout << "O has won!\n";
        }
        if (i > 8) {
            gameWon = true;
            cout << "No Winners!\n";
        }
    }
    return 0;
}