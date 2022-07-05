import java.util.*;

class SortingSolution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i = 0 ; i < 5 ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        int[] arr3 = Arrays.copyOf(arr,arr.length);
        int[] arr4 = Arrays.copyOf(arr,arr.length);
        
        System.out.println("using bubble sort : ");
        int b = 0;
        for(int i = b+1 ; i < arr.length ; i++){
            if(arr2[b] > arr2[i]){
                int temp = arr2[b];
                arr2[b] = arr2[i];
                arr2[i] = temp;
            }
        }
        for(int i = 0 ; i < 5 ; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}