import java.util.Scanner;
public class Swapping{
    public static void main(String[] args){
        int a,b ,swap;
        System.out.println("enter the numbers\n");
        Scanner sc=new Scanner(System.in);
        a=sc. nextInt();
         System.out.println("enter the  second number\n");
         b=sc.nextInt();
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("after swapping:a="+a+","+b);
         
         
        
        
    }
}