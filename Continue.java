import java .util.Scanner;
public class Continue{
    public static void main(String[] args){
        int i,n;
        System.out.println("enter the number\n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println("even number is :"+i);

        }
    }
}