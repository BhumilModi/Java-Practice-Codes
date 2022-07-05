import java.util.*;

class SortingSolution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(arr[i]);
        }
        int[] arr2 = Arrays.copyOf(arr,arr.length);
    }
}