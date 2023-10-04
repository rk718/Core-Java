import java.util.Scanner;
public class Switch{
public static void main(String[] args){
        System.out.println("enter the rating");
        Scanner sc=new Scanner(System.in);
    int rating  =  sc.nextInt();
    switch(rating){
        case 1:
            System.out.println("Good");
            break;
        case 2:
        System.out.println("Average");
        break;
        case 3 :
        System.out.println("Bad");
        break;
        case 4 :
           System.out.println("  Too Bad");   
           break;
        default :
         System.out.println("worst");   
         break;
        
        
    }
    }
}