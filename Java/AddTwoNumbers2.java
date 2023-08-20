import java.util.Scanner;
public class AddTwoNumbers2 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int x,y,sum;
       System.out.println("Enter The first number:");
       x=sc.nextInt();
       System.out.println("Enter the second number:");
       y=sc.nextInt();
     sum= sum(x,y);
     System.out.println("sum of these two number is:"+sum);
    }
    public static int sum(int a , int b){
int sum=a+b;
return sum;
    }

}
