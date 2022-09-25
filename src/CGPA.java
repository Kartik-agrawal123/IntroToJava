import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub_1 = sc.nextInt();
        int sub_2 = sc.nextInt();
        int sub_3 = sc.nextInt();
        int sub_4 = sc.nextInt();
        int sub_5 = sc.nextInt();
        float total = ((sub_1 + sub_2 + sub_3 + sub_4 + sub_5)*100)/500;
        System.out.println(total);
        float cgpa = total/(100-total);
        System.out.println(cgpa);
    }
}
