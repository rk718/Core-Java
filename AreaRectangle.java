import java.util.Scanner;
public class AreaRectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("area of the retcangle\n");
        System.out.println("length of the rectangle\n");
        int length=sc.nextInt();
        System.out.println("breadth of the rectangle\n");
        int breadth=sc.nextInt();
        int area;
        area=length*breadth;
        System.out.println("area of the rectangle:"+area);
        

    }
}
