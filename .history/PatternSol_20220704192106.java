import java.util.*;

class PatternSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == column - 1) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}