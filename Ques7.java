import java.util.Scanner;
public class Ques7 {
    public static void main(String[]args)
    {
       Scanner sc = new Scanner (System.in);
       System.out.println("enter a number A:");
         int a = sc.nextInt();
         System.out.println("enter a number b:");
         int b = sc.nextInt();
         System.out.println("enter a number c");
            int c = sc.nextInt();
            if(a>b && a>c)
            {
                System.out.println("A is greater than B and C");
            }
            else if(b>a && b>c)
            {
                System.out.println("B is greater than A and C");
            }
            else if(c>a && c>b)
            {
                System.out.println("C is greater than A and B");
            }
            else
            {
                System.out.println("All numbers are equal");
            }
    }
    
}
