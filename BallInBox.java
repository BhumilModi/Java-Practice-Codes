import java.util.Scanner;

public class BallInBox {

    public static int fun(int n)

    {

        if (n == 1 || n == 2)

            return 1;

        else if (n == 3)

            return 2;

        return fun(n - 3) + fun(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = fun(n);
        System.out.println(res);
        sc.close();
    }
}
