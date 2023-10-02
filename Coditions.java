import java.util.Scanner;
public class Coditions {
    public static void main(String[] args){
        int rating;
        System.out.println("enter the rating\n");
        Scanner sc=new Scanner(System.in);
        rating=sc. nextInt();
        if(rating==1)
        {
            System.out.println("good\n");
        }
        else if(rating==2)
        {
            System.out.println("average\n");
        }
        else if(rating==3)
        {
          System.out.println("bad\n");  
          
        }
        else
    {
    
    System.out.println("default\n");  
          
    
    }
}
}