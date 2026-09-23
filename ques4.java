import java.util.Scanner;
public class ques4 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a value a:");
    int a = sc.nextInt();
    System.out.println("enter a value b:");
    int b = sc.nextInt();
    int c = a;
    a = b;
    b = c;
    System.out.println("after swapping a:" + a);
    System.out.println("after swapping b:" + b);
    

    }

    
}
