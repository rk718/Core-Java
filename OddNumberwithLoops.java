
import java .util.Scanner;
public class OddNumberwithLoops{
    public static void main(String[] args){
        int i=1,n;
        System.out.println("enter the number\n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(i<=n)
        {
            
            System.out.println("even number is :"+i);
            i+=2;

        }
    }
}