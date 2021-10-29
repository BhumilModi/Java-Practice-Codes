import java.util.*;

public class bitdifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;

            for (int j = 0; j < n; j++)
                if ((num[j] & (1 << i)) != 0)
                    count++;

            ans += (count * (n - count) * 2);
        }
        System.out.println(ans);
        sc.close();
    }
}
