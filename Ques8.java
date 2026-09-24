import java.util.Scanner;
public class Ques8 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number A:");
        int a = sc.nextInt();
        if(a%5==0 && a%11==0)
        {
            System.out.println("A is divisible by 5 and 11");
        }
        else
        {
            System.out.println("A is not divisible by 5 and 11");
        }
    }
    
}
