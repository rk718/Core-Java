import java.util.Scanner;
public class Discount{
    public  static void main(String[] args){
        int price ,discount=0,totalprice,discountprice;
        Scanner sc =new Scanner(System.in);
    System.out.println("enter the price\n");
price=sc.nextInt();
 if(price>=1000){
     discount=30;
 }
 else if(price>=2000){
      discount=40;
 }
  else if(price>=3000){
      discount=50;
  }

  else if(price>=4000){
  discount=60;
    }
    discountprice=price*(discount)/100;
    totalprice=price-discountprice;
    System.out.println("discount price is :"+discountprice);
   
    System.out.println("total price is :"+totalprice);
}
}