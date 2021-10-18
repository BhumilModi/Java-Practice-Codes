package BhumilJava;

import java.util.*;

public class sumofPrimeFactor {
    public static Boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i) == true) {
                    sum += i;
                }
            }
        }
        System.out.print(sum);
    }
}
