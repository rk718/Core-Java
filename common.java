
import java.util.Scanner;
public class common{
    public class static void main(string[] args){
        int a,b,i,max,Lcm;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first number\n");
        a=sc.nextInt();
        System.out.println("enter the second numbwe\n");
        b=sc.nextInt();
        max=a>b?a:b;
        while(true)
        {
            if(max%a==0&&max%b==0)
            {
                Lcm=max;
                break;
            }
            max++;
        }
        System.out.println("lcm of the number is:"+Lcm);


    }
}