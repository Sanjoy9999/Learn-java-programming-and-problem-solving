import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nqueens {

    public boolean isSafe(int row, int col, char[][] board) {
        // Check vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check diagonal left up
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check diagonal right up
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (char[] row : board) {
            newBoard.add(new String(row));
        }
        allBoards.add(newBoard);
    }

    public void solve(char[][] board, List<List<String>> allBoards, int row) {
        if (row == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                solve(board, allBoards, row + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        solve(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        Nqueens solver = new Nqueens();
        int n = 4; // You can change this to any N
        List<List<String>> solutions = solver.solveNQueens(n);

        System.out.println("Solutions for " + n + "-Queens problem:");
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
