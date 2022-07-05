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

        ll.remove(1);
        int element = 10;
        ll.add(1, element);
        System.out.println(ll);
    }
}