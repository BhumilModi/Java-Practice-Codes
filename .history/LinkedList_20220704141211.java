import java.util.*;

class LinkedListExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i = 0 ; i < 4 ; i++){
            int n = sc.nextInt();
            ll.add(n);
        }

        System.out.print(ll);
    }
}

