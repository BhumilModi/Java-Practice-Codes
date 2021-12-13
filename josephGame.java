import java.util.Scanner;

public class josephGame {
    static int getRemaining(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (getRemaining(n - 1, k) + k - 1) % n + 1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = getRemaining(n, k);
        System.out.println(res);
        sc.close();
    }
}