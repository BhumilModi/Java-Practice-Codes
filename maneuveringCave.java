import java.util.Scanner;

public class maneuveringCave {
    static int moveCheck(int currm, int currn, int m, int n) {
        if (currm == m - 1 && currn == n - 1) {
            return 1;
        }
        if (currm >= m || currn >= n) {
            return 0;
        }
        return (moveCheck(currm, currn + 1, m, n) + moveCheck(currm + 1, currn, m, n)
                + moveCheck(currm + 1, currn + 1, m, n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int res = moveCheck(0, 0, m, n);
        System.out.println(res);
        sc.close();
    }
}