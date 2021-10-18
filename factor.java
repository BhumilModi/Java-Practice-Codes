package BhumilJava;

import java.util.*;

public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int factor = n / i;
                System.out.print(i + " " + factor + " ");
            }
        }
    }
}
