//Sum using Loops 


import java .util.Scanner;
public class SumusingLoops{
    public static void main(String[] args){
        int i=1,n=1,sum=0;
        System.out.println("enter the number\n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            sum+=i;
            System.out.println("even number is :"+sum);
            i++;
            n--;

        }
    }
}