package BhumilJava;

import java.util.Scanner;

public class Xpattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == size - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
