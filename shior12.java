import java.util.Random;
import java.util.Scanner;
public class shior12 {
    public static void f1(int row, int col) {
        Random r = new Random();
        int[][] arr = new int[row][col];
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=0;j< arr[i].length;j++){
                arr[i][j] = r.nextInt(0,101);
            }
        }
        for(i=0;i<arr.length;i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void f2() {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int max=0;
        int[][] arr2 = new int[3][3];
        for (i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr2[i].length; j++) {
                System.out.print("Enter a number between 0-100 for row: " + i + " cole: " + j);
                arr2[i][j] = sc.nextInt();
            }
        }
            for (i = 0; i < arr2.length; i++) {
                for (j = 0; j < arr2[i].length; j++) {
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println();
            }
        for (i = 0; i < arr2.length; i++) {
            int sum=0;
            for (j = 0; j < arr2[i].length; j++) {
                sum += arr2[i][j];
            }
            if(sum > max)
                max = sum;
        }
        System.out.println("The max number of the rows is: "+ max);
    }
    public static void f3(int row, int col) {
        Random r = new Random();
        int[][] arr = new int[row][col];
        int[][] arr2 = new int[row][col];
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=0;j< arr[i].length;j++){
                arr[i][j] = r.nextInt(0,101);
                arr2[i][j] = r.nextInt(0,101);
            }
        }
        for(i=0;i<arr.length;i++){
            for(j=0;j< arr[i].length;j++) {
                arr[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void f4(int row, int col) {
        Random r = new Random();
        int[][] arr = new int[row][col];
        int i,j;
        for(i=0;i<arr.length;i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(0, 101);
            }
        }
        System.out.println("Before:");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nAfter:");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void f5(int[][] arr) {
        int i;
        int sum1=0,sum2=0;
        for(i=0;i<arr.length;i++){
            sum1 += arr[i][i];
        }
        System.out.println(sum1);
        for(i=0;i<arr.length;i++){
            sum2 += arr[(arr.length-1)-i][i];
        }
        System.out.println(sum2);
    }

        public static void main (String[] args){
            f1(3, 3);
            f2();
            f3(3,3);
            f4(3,3);
            int[][] arr = {
                    {1,2,7},
                    {8,4,9},
                    {3,6,0}
            };
            f5(arr);
        }
}

