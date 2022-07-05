import java.util.*;

class LinkedListQuestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Enter element to be added");
            ll.add(sc.nextInt());
        }

        ll.removeFirst();
        ll.removeLast();

        ll.remove(1);
        System.out.println("Enter element to be added");
        int element = sc.nextInt();
        ll.add(1, element);
        System.out.println(ll);
    }
}