import java .util.Scanner;
public class Max{
    public static void main(String[] args){
        int a,b, c;
        System.out.println("enter the numbers\n");
        Scanner sc =new Scanner(System.in);
         System.out.println("enter the first number\n");
        a=sc.nextInt();
        System.out.println("enter the second number\n");
        b=sc.nextInt();
        System.out.println("enter the third  number\n");
         c=sc.nextInt();
         if(a>b&&a>c)
         {
           System.out.println("A is big \n"); 
         }
else if(b>c)
{
    System.out.println("    B is big \n"); 
}
else
{
    System.out.println(" C is big \n"); 
}
}
}
