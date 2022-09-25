import java.util.*;
public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computer = rand.nextInt(3);
        System.out.println(computer);
        int user = sc.nextInt();
        int comp = 0 , usr = 0;
        int i = 0;
            if(computer == 0 && user == 2 ){
                System.out.println("Yah , system are win!");
            }
            else if(computer == 2 && user == 0){
                System.out.println("YEH ,you are win!");
            }
            else if(computer>user){
                System.out.println("Yah , system are win!");
            }
            else if(user>computer){
                System.out.println("YEH ,you are win!");
            }
            else if(user == computer){
                System.out.println("OH , TIE!");
        }
        /**
         * 0 - Rock
         * 1 - Paper
         * 2 - Scissor
         */

    }

}
