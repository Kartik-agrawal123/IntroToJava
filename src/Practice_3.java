import java.util.Scanner;
public class Practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /** int marks_1 = sc.nextInt();
        int marks_2 = sc.nextInt();
        int marks_3 = sc.nextInt();
        float avg = (marks_1+marks_2+marks_3)/3.0f;
        if(avg>=40 && marks_1>=33 && marks_2>=33 && marks_3>=33){
            System.out.println("congrats you are promoted!");
        }
        else{
            System.out.println("sorry you are not promoted");
        }**/
      /** float income = sc.nextFloat();
       if(income>=2.5 && income<=5.0){
           System.out.println("5%");
       }
       else if(income>=5.0 && income<=10.0){
           System.out.println("20%");
       }
       else if(income>=10.0){
           System.out.println("30%");
       }
       else if(income<=2.5){
           System.out.println("no tax happy!");
       }
       else{
           System.out.println("tax will be higher");
       }**/
     /** int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday!");
            case 2 -> System.out.println("Tuesday!");
            case 3 -> System.out.println("Wednesday!");
            case 4 -> System.out.println("Thursday!");
            case 5 -> System.out.println("Friday!");
            case 6 -> System.out.println("Saturday!");
            default -> System.out.println("Sunday!");
        }**/
    /** int year = sc.nextInt();
     if(year%4 == 0 && year%400 == 0){
         System.out.println("Leap Year!");
     }
     else{
         System.out.println("Not Leap Year!");
     }**/
    String str = sc.next();
        if(str.endsWith(".com")){
            System.out.println("Commercial Website!");
        }
        else if(str.endsWith(".org")){
            System.out.println("organization website!");
        }
        else if(str.endsWith(".in")){
            System.out.println("indian website!");
        }
    }
}
