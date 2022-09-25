import java.util.Scanner;
public class Practice_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /** float[] f = new float[5];
        for(int i = 0;i<f.length;i++){
            f[i] = sc.nextFloat();
        }
        for(int j = 0;j<f.length;j++){
            System.out.println(f[j]+" ");
        } */
      /** int value = sc.nextInt();
       int c =0;
       int[] arr = new int[10];
       for(int i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();
       }
       for(int j = 0;j<arr.length;j++){
           if(value == arr[j]){
               c++;
               break;
           }
       }
       if(c == 1){
           System.out.println("present");
       }
       else{
           System.out.println("not present");
       } */
        /** int[] arr = new int[5];
      int sum = 0 , c =0;
      for(int i = 0;i<arr.length;i++){
          arr[i] = sc.nextInt();
      }
      for(int j = 0;j<arr.length;j++){
          sum = sum + arr[j];
          c++;
      }
      int avg = sum/c;
        System.out.println(avg); */
       /** int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int j = 1;j<=arr.length-1;j++){
            if(arr[j]>max){
                max = arr[j];
            }
        }
        System.out.println(max); */
       /**int[] arr = new int[5];
       int c = 0;
       for(int i = 0;i<arr.length;i++){
           arr[i] = sc.nextInt();
       }
       for(int j = 0;j<arr.length-1;j++){
           if(arr[j]<=arr[j+1]){
               c++;
           }
       }
       if(c == arr.length-1){
           System.out.println("Array is sorted");
       }
       else{
           System.out.println("Array is not sorted");
       } */
       int[][] add = new int[2][3];
       int[][] add1 = new int[2][3];
        System.out.println("enter first array");
       for(int i = 0;i<add.length;i++){
           for(int j = 0;j<add[i].length;j++){
               add[i][j] = sc.nextInt();
           }

       }
        System.out.println("enter second array");
        for(int k = 0;k<add1.length;k++){
            for(int l = 0;l<add1[k].length;l++){
                add1[k][l] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int m = 0;m<add.length;m++){
            for(int n = 0;n<add[m].length;n++){
                sum = add1[m][n] + add[m][n];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
