// Program for Reversing a number and checking whether it is palindrome or not?
import java .util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        int n,reverse=0,remainder;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number\n");
        n=sc.nextInt();
        int num=n;
        while(n>0){
            remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        System.out.println("reverse number is:"+reverse);
    if (reverse==num){
        System.out.println("palindrome");
    }
    else
    {
        System.out.println(" not palindrome");
    }
}
}