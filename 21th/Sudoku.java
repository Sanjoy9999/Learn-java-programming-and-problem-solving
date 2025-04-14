public class Sudoku {

    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Row and column check cover same number 
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }

        // Grid check(find starting row and column)
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }


        
        return true;


    }





    public boolean helper(char[][] board, int row, int col) {

        //if check cell reached last cell ro not
        if (row == board.length) {
            return true;
        }

        //if check one cell reached one row last column 
        //if not so add number next column same row  otherwise go next row 
        int nrow, ncol;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        //check in this cell does have any number if not add number and check isSafe function do is number safe to keep this cell
        // otherwise go next cell 
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {// after check next cell
                        return true;
                    }else{

                        board[row][col] = '.'; // Backtrack( if not true so we will keep another number)
                    }
                }
            }
        }
        return false;
    }





    public void solverSudoku(char[][] board) {
        helper(board, 0, 0);
    }





    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }






    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Sudoku solver = new Sudoku();
        solver.solverSudoku(board);
        printBoard(board);
    }
}
