import java.util.Scanner;
public class Ques10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age of a person");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("not eligible for voting");
        }
    }
    
}
