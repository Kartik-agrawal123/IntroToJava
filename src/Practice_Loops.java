import java.util.Scanner;
public class Practice_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /** for(int i = 4;i>0;i--){
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
      /** int n = sc.nextInt();
       int i = 1 , sum = 0;
       while(i<n){
           if(i%2 == 0){
               sum = sum + i;
               i++;
           }
           else{
               i++;
           }
       }
        System.out.println(sum);*/
        int number = sc.nextInt();
      int i = 1,sum = 0;
      while(i<=10){
          int mult = number*i;
          sum = sum + mult;
          i++;
      }
        System.out.println(sum);
        /**int n = sc.nextInt();
        int fact = 1;
        while(n>0){
            fact = fact*n;
            n--;
        }
        System.out.println(fact);
    }*/
}
}
