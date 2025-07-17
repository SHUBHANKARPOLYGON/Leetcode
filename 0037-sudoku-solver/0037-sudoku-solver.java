class Solution {
    public void solveSudoku(char[][] board) {
        fill(0, 0, board);
    }

    private boolean fill(int row, int col, char[][] board) {
        if (col == 9) {
            row++;
            col = 0;
        }

        if (row == 9) {
            return true; 
        }

        if (board[row][col] != '.') {
            return fill(row, col + 1, board);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(i, row, col, board)) {
                    board[row][col] = (char) ('0' + i);
                    if (fill(row, col + 1, board)) return true;
                    board[row][col] = '.'; // backtrack
                }
            }
        }

        return false; // trigger backtracking
    }

    private boolean isSafe(int num, int row, int col, char[][] board) {
        char ch = (char) ('0' + num);

        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == ch) return false;
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) return false;
        }

        // Check 3x3 subgrid
        int Srow = (row / 3) * 3;
        int Scol = (col / 3) * 3;
        for (int i = Srow; i < Srow + 3; i++) {
            for (int j = Scol; j < Scol + 3; j++) {
                if (board[i][j] == ch) return false;
            }
        }

        return true;
    }
}
