import java.util.Scanner;

public class nQueens {
    public static boolean isSafe(int board[][], int row, int column, int n) {
        int i, j;
        for (i = 0; i < row; i++) {
            if (board[i][column] == 1)
                return false;
        }
        for (i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }
        for (i = row, j = column; j < n && i >= 0; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }

    public static void nQueen(int[][] board, int r, int n) {
        if (r == board.length) {
            for (int j = 0; j < board.length; j++) {
                for (int i = 0; i < board.length; i++) {
                    System.out.print(board[j][i] + " ");
                }
                System.out.println();
            }
            System.out
                    .println(
                            "-------------------------------------------------------------------------------------------");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(board, r, i, n)) {
                board[r][i] = 1;
                nQueen(board, r + 1, n);
                board[r][i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = 0;
        nQueen(board, 0, n);
        sc.close();
    }
}
