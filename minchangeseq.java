import java.util.*;

public class minchangeseq {
    static int binaryToGray(int n) {
        return n ^ (n >> 1);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i <= Math.pow(2, n) - 1; i++) {
            int g = binaryToGray(i);
            String b = Integer.toBinaryString(g);
            if (b.length() < n) {
                while (b.length() != n)
                    b = "0" + b;
            }

            System.out.print(b + " ");
        }
        s.close();
    }
}
