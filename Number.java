

import java.util.*;
public class Number{
    public static void main(String[] args){
        float f,c,r,number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextFloat();
        f=(float)Math.floor(number);
        c=(float)Math.ceil(number);
        r=(float)Math.round(number);
        System.out.println("floor:"+f);
        System.out.println("round:"+r);
        System.out.println("ceil:"+c);
        
        
    }
}