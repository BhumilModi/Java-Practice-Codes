import java.util.*;

public class bulbtoggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] bulb = new int[n];
        for (int j = 0; j < n; j++) {
            bulb[j] = 1;
        }
        if (n > 1) {
            for (int i = 1; i < n - 1; i++) {
                for (int j = 0; j < n; j += i - 1) {
                    if (bulb[j] == 0) {
                        bulb[j] = 1;
                    } else {
                        bulb[j] = 0;
                    }
                }
            }
            if (bulb[n - 1] == 0) {
                bulb[n - 1] = 1;
            } else {
                bulb[n - 1] = 0;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (bulb[i] == 1) {
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}
