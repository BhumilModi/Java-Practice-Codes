import java.util.ArrayList;
import java.util.Scanner;

public class knightsTour {
    static class Position {
        int x;
        int y;
    }

    static ArrayList<Position> findPositions(int x, int y, int n, int[][] board) {
        int moveX[] = { 1, -1, 1, -1, 2, 2, -2, -2 };
        int moveY[] = { 2, 2, -2, -2, 1, -1, 1, -1 };
        ArrayList<Position> possibiList = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            if ((x + moveX[i]) >= 0 && (x + moveX[i]) <= n - 1 && (y + moveY[i]) >= 0 && (y + moveY[i]) <= n - 1
                    && board[x + moveX[i]][y + moveY[i]] == 0) {
                Position obj = new Position();
                obj.x = x + moveX[i];
                obj.y = y + moveY[i];
                possibiList.add(obj);
            }
        }
        return possibiList;
    }

    static void solution(int[][] board, int n, int x, int y) {
        board[x][y] = 1;
        int cellNumber = 2;
        for (int k = 0; k < (n * n) - 1; k++) {
            ArrayList<Position> possibiList = findPositions(x, y, n, board);
            // System.out.println(possibiList);
            Position minimum = possibiList.get(0);

            for (Position i : possibiList) {
                if (findPositions(i.x, i.y, n, board).size() <= findPositions(minimum.x, minimum.y, n, board).size()) {
                    minimum.x = i.x;
                    minimum.y = i.y;
                }
            }
            x = minimum.x;
            y = minimum.y;
            board[x][y] = cellNumber++;
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(board[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 0;
            }
        }
        solution(board, n, x, y);
        sc.close();
    }
}
