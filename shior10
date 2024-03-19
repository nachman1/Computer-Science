import java.util.Random;

public class shior10 {
    public static void f1(int arr1[], int index) {
        if ((index >= 0) && (index < arr1.length)) {
            if (arr1[index] % 2 != 0) {
                arr1[index] = arr1[index] + 1;
            }
        } else {
            System.out.println("Error!");
        }
    }

    public static void f2(int arr2[]) {
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            count += arr2[i];
        }
        int average = count / arr2.length;
        System.out.println(average);
    }

    public static void f3(int arr3[]) {
        int max = 0;
        int min = 100;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > max) {
                max = arr3[i];
            }
            if (arr3[i] < min) {
                min = arr3[i];
            }
        }
        System.out.println("the lowest grade is: " + min);
        System.out.println("the highest grade is: " + max);
    }

    public static void f4(int arr4[]) {
        for (int i = 0; i < arr4.length - 1; i++) {
            if ((arr4[i] % 2 != 0) && (arr4[i + 1] % 2 != 0)) {
                System.out.println(arr4[i] + "," + arr4[i + 1]);
            }
        }
    }

    public static boolean f5(int num) {
        int[] arr5 = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = random.nextInt(101);
            for (int j = 0; j < arr5.length; j++) {
                if (arr5[j] == num) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void f6() {
        int[] arr6 = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = random.nextInt();
        }
        for (int i = 0; i < arr6.length - 1; i++) {
            if ((arr6[i] % 2 != 0) && (arr6[i + 1] % 2 != 0)) {
                System.out.println(arr6[i] + "," + arr6[i + 1]);
            }
        }
    }

    public static void f7() {
        int[] arr7 = new int[10];
        Random random = new Random();
        int max = 0;
        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = random.nextInt();
        }

        for (int i = 0; i < arr7.length; i++) {
            if (arr7[i] > max) {
                max = arr7[i];
            }
            else{
                System.out.print(arr7[i] + ",");
            }
        }
        System.out.print(max);
        System.out.println();
    }
    public static int f8(int[] arr8){
    int sum = 0;
    int i;
    for(i=0; i< arr8.length; i++){
        if(arr8[i] < 0)
            arr8[i] *= -1;
        sum += arr8[i];
        if(i == arr8.length-1)
            break;
        if(sum == arr8[i+1])
            return arr8[i+1];
        }
    return -1;
    }
    public static int f9(String[] arr9,char x){
    int i,j ;
    int sum=0;
    for(i=0; i< arr9.length; i++) {
        int len = arr9[i].length();
        for (j = 0; j < len; j++){
            if (x == arr9[i].charAt(j))
                sum++;
                }
            }
            return sum;
        }

    public static void f10(int arr10[], int num) {
        int sum1 = 0;
        for (int i = 0; i < arr10.length; i++) {
            if (arr10[i] > num) {
                sum1 += 1;
            }
        }
        System.out.println("The number of cells larger than " + num + " is: " + sum1);
    }

    public static void f11(int arr11[]) {
        int max = 0;
        for (int i = 0; i < arr11.length; i++) {
            if (arr11[i] > max) {
                max = arr11[i];
                arr11[i] = 0;
            }
            else{
                for (int j = 0; j < arr11.length; j++) {
                    if (arr11[j] > max) {
                        max = arr11[j];
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 3, 4, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,};
        f1(arr1, 9);
        int[] arr2 = {100, 100, 100};
        f2(arr2);
        int[] arr3 = {101, 91, 81, 96};
        f3(arr3);
        int[] arr4 = {7, 9, 2, 8, 3, 9, 8, 10, 90, 87};
        f4(arr4);
        f5(50);
        f6();
        f7();
        int[] arr8 = {4, -2, 3, 9, 8, -3};
        int ans = f8(arr8);
        System.out.println(ans);
        String[] arr9 = {"aba", "saba" , "ana" , "rrr" , "ttt"};
        System.out.println (f9(arr9,'a'));
        int arr10[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        f10(arr10, 5);
        int arr11[] = {3,8,12,9,2};
        f11(arr11);
        

    }
}

