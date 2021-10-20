import java.util.Scanner;

public class SurviveWorld {

    public static int fun(int n , int k){

        if(n == 1)  return 0;

        if(n%k == 0)  return 2*fun(n/k , k);

        else  return 2*fun((n-1)/k , k)+k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(fun(n,k));
    }
}
