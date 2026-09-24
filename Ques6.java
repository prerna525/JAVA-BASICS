import java.util.Scanner;
public class Ques6 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number A:");
        int a = sc.nextInt();
     System.out.println("enter a number B");
     int b = sc.nextInt();
     if(a>b)
     {
        System.out.println("A is greater than B");
     } else if(a<b)
     {
        System.out.println("B is greater than A");
     }
     else
     {
        System.out.println("A is equal to B");
     }
    }
}
