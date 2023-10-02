import java.util.Scanner;
public class SimpleIntrest{20
    public static void main(String[] args){
     float si,p,t,r,amount;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the principalamount\n");
    p=sc.nextFloat();
     System.out.println("enter the intersest\n");
      r=sc.nextFloat();
      System.out.println("enter the time\n");
     t=sc.nextFloat();
    si=(p*t*r)/100;
     amount=si+p;
      System.out.println(" principalamount:"+si);
       System.out.println("total amount is :"+amount);
     
    
     
    }
}