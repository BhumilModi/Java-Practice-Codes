import java.util.Scanner;

public class Zigzag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            if (i == 0 || i == row - 1) {
                for (int j = 0; j < col; j++) {
                    sum += matrix[i][j];
                }
            } else {
                sum += matrix[i][row - i - 1];
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
