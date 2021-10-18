import java.util.Scanner;

public class bettinggame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input
        String s = sc.nextLine();

        int value = 10;
        int bet = 1;

        if(s.length() < 20){
            for(int i=0 ; i<s.length();i++){
                if(s.charAt(i) == 'W'){
                    value += bet ;
                    if(bet>1){
                        bet /= 2;
                    }
                }
                else{
                    value = value - bet;
                    bet *= 2;
                }
                if(value <= 0 || bet > value  ){
                    System.out.println(-1);
                }
                if(i == s.length()-1){
                    System.out.println(value);
                    bet = 1;
                }
            }
        }
    }    
}
