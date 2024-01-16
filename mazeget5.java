import java.util.Scanner;
import java.util.Random;
public class Main {
  public static void f1(){
  Scanner scam = new Scanner(System.in);
  System.out.println("Enter a Student name:");
  String name = scam.nextLine();
  System.out.println("Hello " + name); 
  }
  public static void f2(int x){
  int x1 = x/5;
  System.out.println("The number who divisible by 5 is: "+ x1 ); 
  }
  public static void f3(int x,int y){
  int x1 = x*y;
  System.out.println(x1); 
  }
  public static int f4(int x,int y,int g){
  int x1 = x+y+g;
  int x2 = x1/3;
  System.out.println(x1); 
  return x2;
  }
  public static void f5(double radios){
  double heikef = 3.14*radios*2;
  double shetah =3.14*radios*radios; 
    System.out.println(heikef);
    System.out.println(shetah);
  }
  public static double f6(double a,double b){
  double c = Math.sqrt(a*a+b*b);
    return c;
  }
  public static void f7(String str1) {
    char letter1 = str1.charAt(0);
    char letter2 = str1.charAt(1);
    char letter3 = str1.charAt(2);
    System.out.println("" + letter3 + letter2 + letter1);
  }
  public static int f8(int a1,int n,int d) {
  int x = a1 + (n-1)*d;
    return x;
  }
  public static int f9(String str) {
  int size=str.length();
    int x = size*size;
    return x;
  }
  public static String f10(String str1, String str2) {
      int size = str1.length();
      int size2 = str2.length();
      if (size > size2) 
          return str1;
      else 
          return str2;
  }
  public static String f11(int x, String str1) {
    int size = str1.length();
    if (x == size)
        return "true";
    else
        return "false";
  }
  public static String f12() {
    Random rnd = new Random();
    int num = rnd.nextInt(1-7);
    int num2 = rnd.nextInt(1-7);
    if (num==num2)
      return "true";
    else
      return "false";
  }
  public static String f13(char x) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a 4 letters string:");
    String str = scan.nextLine();
    int index = str.indexOf(x);
    if (index == -1)
        return "true";
      else
        return "false";
  }
  public static void main(String[] args) {
    f1();
    f2(5);
    f3(5,5);
    f4(4,5,6);
    f5(13);
    f6(8,9);
    f7("abc");
    f8(9,5,3);
    f9("nachman");
    f10("abc","decs");
    f11(3,"abc");
    f12();
    f13('a');
  }
}
