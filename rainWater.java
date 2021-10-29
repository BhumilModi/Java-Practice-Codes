import java.util.Scanner;

public class rainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int s;
            if (a[0] > a[n - 1]) {
                s = a[n - 1];
            } else {
                s = a[0];
            }
            int res = 0;
            for (int i = 1; i < n - 1; i++) {
                if (a[i] < s) {
                    res = res + (s - a[i]);
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
