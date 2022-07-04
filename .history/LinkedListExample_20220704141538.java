import java.util.*;

class LinkedListExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i = 0 ; i < 4 ; i++){
            int n = sc.nextInt();
            ll.add(n);
        }
        // ll.remove()
        System.out.println(ll);
        if(ll.contains(6)){
            ll.remove(6);
        } else {
            System.out.println("No");
    }
    }
}

