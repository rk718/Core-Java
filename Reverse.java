import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character\n");
        ch=sc.next().charAt(0);
        if(ch>='a'&&ch<='z')
        {
           char reverse =(char)(ch-32);
           System.out.println("reverse character is :"+reverse);
        }
        else if(ch>='A'&&ch<='Z')
        {
            char reverse =(char)(ch+32);
             System.out.println("reverse character is :"+reverse);
        }
        
    }
}