import java.util.ArrayList;
import java.util.Scanner;

public class bitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(100);

        while (n > 0) {
            int rem = n % 2;
            arr.add(rem);
            if (rem == 1) {
                a++;
            }
            n = n / 2;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) {
                b = i;
                break;
            }
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) == 1) {
                c = i;
                break;
            }
        }
        System.out.println(a + "#" + b + "#" + c);
        sc.close();
    }
}
