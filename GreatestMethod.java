import java .util.Scanner;
public class GreatestMethod{
public static void main(String[] args){
        int a,b, c,max;
        System.out.println("enter the numbers\n");
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        max=(a>b&&a>c)?a:(b>c)?b:c;
        System.out.println("maximum  is:"+max);
        
    }
}