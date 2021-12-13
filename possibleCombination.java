import java.util.Scanner;

public class possibleCombination {
    static void combinations(int[] a, int r, int aIndex, int cIndex, int[] combination) {
        if (cIndex == r - 1) {
            for (int i : combination) {
                System.out.println(i + " ");
            }
        }
        if (aIndex == a.length - 1) {
            return;
        }
        combination[cIndex] = a[aIndex];
        combinations(a, r, aIndex + 1, cIndex + 1, combination);
        combinations(a, r, aIndex + 1, cIndex, combination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        int[] combination = new int[r];
        combinations(arr, r, 0, 0, combination);
        sc.close();

    }
}
