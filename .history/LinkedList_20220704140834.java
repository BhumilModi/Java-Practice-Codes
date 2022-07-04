import java.util.*;

class LinkedList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList l = new LinkedList();
        for(int i = 0 ; i < 4 ; i++){
            int n = sc.nextInt();
            l.add(n);
        }

        System.out.print(l);
    }
}

