import java.util.*;

class LinkedListQuestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i = 0 ; i < 5 ; i++){
            ll.add(sc.nextInt());
        }

        ll.removeFirst();
        ll.removeLast();

        ll.remove(2);
        System.out.println(ll);
    }
}