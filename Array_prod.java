import java.util.Scanner;

/*Array special product
Implement a function of array integers, by returning a new array. In which, every index carries the value of the product of remaining elements.
Example:
Given array [1, 2, 3, 4, 5] it will return [120, 60, 40, 30, 24].
Given array [4, 10, 3] it will return [30, 12, 40].
Function Description:
The function finds Special Product by accepting the following parameters:
The function must return a new array of size n, in which every index carries the value of the product of the remaining elements.

Format:
Input:
The first line specifies, the number of elements in the array. Next, n lines have a list of integers.
Output:
Output has an array of n integers with each integer in a line.
Constraints:
Division operator cannot be used.
0 <= n <= 5
0 <= in[i] <= 10
0 <= i <= n
Example:
Input:
5
1
2
3
4
5
Output:
120
60
40
30
24*/
public class Array_prod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int prod = 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            prod = prod * a[i];
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = prod / a[i];
            System.out.println(res[i]);
        }
        sc.close();
    }
}
