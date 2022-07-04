import java.util.*;

class LinkedList{
    Node head = new Node();


}

class Node {
    int data;
    Node next = new Node() ;
    // next = null;

    Node(int i , Node next){
        this.data = i;
        this.next = next;
    }
}

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Node n = new Node(i);

        System.out.print(n);
    }
}

