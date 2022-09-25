import java.util.Scanner;
public class IntroStr_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     /**   String str = "KartiK";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase()); */
        String str1 =  "  happy day!   ";
      /**  System.out.println(str1.trim());
        System.out.println(str.substring(1));
        System.out.println(str1.substring(1,5));
        System.out.println(str1.replace('p', 'r'));
        System.out.println(str1.startsWith("h"));
        System.out.println(str.endsWith("k"));
        System.out.println(str1.charAt(6));
        System.out.println(str1.indexOf("y"));
        System.out.println(str1.lastIndexOf('p'));*/
        System.out.println(str1.replace(' ','_'));
        System.out.println(str1.indexOf("  "));
        System.out.println(str1.indexOf("   "));
    }
}
