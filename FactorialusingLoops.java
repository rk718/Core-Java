
//factorial using Loops


import java .util.Scanner;
public class FactorialusingLoops{
    public static void main(String[] args){
        int i=1,n,fact=1;
        System.out.println("enter the number\n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(i<=n)
        {
            fact*=i;
            System.out.println("even number is :"+fact);
            i++;

        }
    }
}