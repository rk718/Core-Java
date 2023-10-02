import java.util.Scanner;
public class Alphabet{
    public static void main(String[] args){
        System.out .println("enter the characters\n");
        Scanner sc=new Scanner(System.in);
         char ch=sc.next().charAt(0);
         if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
         {
             System.out.println("alphabets\n");
         }
         else if(ch>='0'&&ch<='9')
         {
              System.out.println("digits\n");
         }
         else
         {
             System.out.println("special characters\n");
         }
    }
}