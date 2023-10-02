import java.util.Scanner;
public class AreaPerimeter{
    public static void main(String[] args){
        System.out.println("area and perimeter of the circle\n");
        Scanner sc=new Scanner(System.in);
        double pi;
        pi=3.14;
        float radius=sc.nextFloat();
        double area;
        double perimeter;
        area=pi*radius*radius;
        perimeter=2*pi*radius;
        System.out.println("area of the circle is :"+area);
        System.out.println("perimeter of the circle:"+perimeter);
    }
}
