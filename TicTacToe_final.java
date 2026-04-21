import java.util.Random;
import java.util.Scanner;

public class TicTacToe_final {

    static char[][] board = new char[3][3];
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

        initializeBoard();              // UC1
        tossAndAssignSymbols();         // UC2
        printBoard();

        while (true) {

            if (isHumanTurn) {
                System.out.println("Your turn:");
                int slot = getUserSlot();              // UC3

                int row = getRowFromSlot(slot);        // UC4
                int col = getColFromSlot(slot);

                if (isValidMove(row, col)) {           // UC5
                    placeMove(row, col, humanSymbol);  // UC6
                    isHumanTurn = false;
                } else {
                    System.out.println("Invalid move. Try again.");
                    continue;
                }

            } else {
                System.out.println("Computer's turn:");

                int row, col;
                do {
                    int slot = rand.nextInt(9) + 1;
                    row = getRowFromSlot(slot);
                    col = getColFromSlot(slot);
                } while (!isValidMove(row, col));

                placeMove(row, col, computerSymbol);
                isHumanTurn = true;
            }

            printBoard();

            // Check game status
            if (checkWin(humanSymbol)) {
                System.out.println("You win!");
                break;
            } else if (checkWin(computerSymbol)) {
                System.out.println("Computer wins!");
                break;
            } else if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }
        }
    }

    // UC1
    static void initializeBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = '-';
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // UC2
    static void tossAndAssignSymbols() {
        if (rand.nextInt(2) == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }

        System.out.println(isHumanTurn ? "You start first." : "Computer starts first.");
        System.out.println("Your symbol: " + humanSymbol);
    }

    // UC3
    static int getUserSlot() {
        System.out.print("Enter slot (1-9): ");
        return sc.nextInt();
    }

    // UC4
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    // UC5
    static boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3)
            return false;
        return board[row][col] == '-';
    }

    // UC6
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Win logic
    static boolean checkWin(char symbol) {

        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)
                return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)
                return true;
        }

        // Diagonals
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;

        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;

        return false;
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == '-')
                    return false;
        return true;
    }
}