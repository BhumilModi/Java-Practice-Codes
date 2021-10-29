import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split("\\.");
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            String temp;
            temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        System.out.print(a[0]);
        for (int i = 1; i < n; i++) {
            System.out.print("." + a[i]);
        }
        sc.close();
    }
}
