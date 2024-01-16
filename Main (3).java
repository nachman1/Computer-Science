import java.util.Scanner;
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
  public static void f7(String str 1,String str 1,String str 1){
  String x = charAt(2)+charAt(1)+charAt(0) ;
    System.out.println();
  }
  public static void main(String[] args) {
    f1();
    f2(5);
    f3(5,5);
    f4(4,5,6);
    f5(13);
    f6(8,9)
    f7()
  }
}
