public class checkevenodd{
    public static void main(String[] args){
        int num1=5;
        checkevenodd(num1);
    }
    public  static void checkevenodd (int num1){
        if(num1%2==0){
            System.out.println("number is : even");
        }
        else
        {
            System.out.println("number is :odd");
        }
    }
}