import java. util.Scanner;
public class PrimeOrNot{
    public static void main(String[] args){
        int i,count=0,n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number\n");
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("prime number\n");
        }
        else
        {
            System.out.println(" not prime number\n");
        }

    }
}