import java.util.*;

public class divideArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int q = sc.nextInt();
        while(q>0){
            q--;
            int d = sc.nextInt();
            if(d<max){
                for(int i=0 ; i<size ; i++){
                    arr[i] = arr[i] / d;
                }
            }
        }
        for(int i=0 ; i<size ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
