import java.util.Scanner;

public class queueneeded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int No_of_Groups = sc.nextInt();
        int capacity = sc.nextInt();

        int[] group_size = new int[No_of_Groups];
        for (int i = 0; i < No_of_Groups; i++) {
            group_size[i] = sc.nextInt();
        }

        int No_of_Bus = 0;
        for (int i = 0; i < No_of_Groups; i++) {
            int temp = 0;
            if (group_size[i] == capacity) {
                No_of_Bus++;
            } else {
                while (temp < capacity) {
                    temp += group_size[i];
                    i++;
                }
                if (temp == capacity) {
                    No_of_Bus++;
                    i--;
                } else {
                    No_of_Bus++;
                    i -= 2;
                }
            }
        }
        System.out.println(No_of_Bus);
        sc.close();
    }
}
