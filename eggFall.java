import java.util.Scanner;

public class eggFall {

    public static int eggDrop(int n, int k) {
        int[][] floors = new int[k + 1][n + 1];

        for (int d = 1; d <= k; d++) {
            for (int e = 1; e <= n; e++) {
                floors[d][e] = 1
                        + floors[d - 1][e - 1]
                        + floors[d - 1][e];

                if (floors[d][e] >= k) {
                    return d;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int eggs = scn.nextInt();
        int height = scn.nextInt();
        System.out.println(eggDrop(eggs, height));
        scn.close();
    }
}