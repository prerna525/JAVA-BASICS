import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a length of rectangle:");
        int length = sc.nextInt();
        System.out.println("enter a breadth of rectangle:");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("area of rectangle:" + area);
    }
}
