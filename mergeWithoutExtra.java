import java.util.Arrays;
import java.util.Scanner;

public class mergeWithoutExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[m];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            a2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp;
                if (a2[j] < a1[i]) {
                    temp = a1[i];
                    a1[i] = a2[j];
                    a2[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a1[i] + " ");
        }
        Arrays.sort(a2);
        for (int i = 0; i < m; i++) {
            System.out.print(a2[i] + " ");
        }
        sc.close();
    }
}
