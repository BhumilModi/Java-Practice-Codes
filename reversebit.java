import java.util.*;
public class reversebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(n>0){
            res = res<<1;
            if((int)(n&1) == 1){
                res = res^1;
            }
            n = n>>1;
        }
        System.out.println(res);
    }
}
