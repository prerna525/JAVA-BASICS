import java.util.Scanner;
public class ques5 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        if(a<0)
        {
            System.out.println("the number is negative");
        }
        else
        {
            System.out.println("the number is positive");
        }
         if(a==0)
        {
            System.out.println("the number is zero");
        }
    }
}

