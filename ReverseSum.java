// Program for Reversing a number and checking whether it is palindrome or not and finding its sum? 
import java.util.Scanner;
public class   ReverseSum{
    public static void main(String[] args){
        int n,reverse=0,remainder,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number\n");
        n=sc.nextInt();
        int num=n;
        while(n>0){
            remainder=n%10;
             System.out.println("remainder is:"+remainder);

            reverse=reverse*10+remainder;
            System.out.println("rerverse is:"+reverse);

            n=n/10;
            System.out.println("quotient is :"+n);

            sum+=remainder;
            System.out.println("sum  is:"+sum);

        }
        System.out.println("rerverse is:"+reverse);
        System.out.println("sum  is:"+sum);

    if (reverse==num){
        System.out.println("palindrome");
    }
    else
    {
        System.out.println(" not palindrome");
    }
}
}