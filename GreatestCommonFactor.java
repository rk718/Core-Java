
import java.util.Scanner;
public class GreatestCommonFactor{
    public static void main(String[] args){
        int gcd=1,i=1,min,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number\n");
        a=sc.nextInt();
        System.out.println("enter the number\n");
         b=sc.nextInt();
         min=a<b?a:b;
         while(i<=min)
         {
            if(a%i==0&&b%i==0){
                System.out.println("Gcd is :"+i);
             gcd =i;
            }
            i++;
          }
          System.out.println("Gcd is :"+gcd);

    }
}