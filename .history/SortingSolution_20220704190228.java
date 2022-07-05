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
        
        System.out.print("using bubble sort : ");
        for(int i = 0 ; i < arr2.length ; i++){
            for (int j = i+1 ; j < arr2.length; j++){
                if(arr2[i] > arr2[j]){
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp; 
                }
            }
        }
        for(int i = 0 ; i < 5 ; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.print("using quicksort : ");
        
    }
}