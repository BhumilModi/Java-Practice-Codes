import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class majorityElement {
    public static int findMajorityElement(int[] nums) {
        // create an empty `HashMap`
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // store each element's frequency in a map
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // return the element if its count is more than `n/2`
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }

        // no majority element is present
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int result = findMajorityElement(a);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }
}
