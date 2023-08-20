import java.util.Scanner;
public class AddTwoNumbers {  
public static void main(String args[]) {  
// int n1=44, n2=5;  
// int sum=n1+n2;  
// System.out.println("The sum of numbers is: "+sum);  
//      int x = 7;
//      int a = 7*49/7 + 35/7;
//      System.out.println(a);
// 
  // int v=5;
  // int u=4;
  // int a=6;
  // int s=7;
  // int k = (v*v) -( u*u )/(2 *a *s);
  // System.out.println(k);

  System.out.print("Enter KiloMeter : ");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextInt();
        double miles = 0.621371;
        double ans = km * miles;
        System.out.println(km + " km is equals to " + ans + " miles.");

}  
}  