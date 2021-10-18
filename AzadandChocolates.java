import java.util.Scanner;

public class AzadandChocolates {
    public static void main(String[] args) {
        int total = 100;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            T--;
            int N = sc.nextInt();
            int used = 100 - N;
            int temp = used / 7;
            int temp2 = used / 3;

            if (used > 2) {
                if (used % 3 == 0 || used % 7 == 0 || used % 3 == 7 || used % 7 == 3) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else {
                System.out.println("0");
            }
        }
    }
}
