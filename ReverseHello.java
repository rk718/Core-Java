public class ReverseHello{
    public static void main(String[] args){
        String original="hello";
        String reverse=reverseString(original);
        System.out.println("original string:"+original);
        System.out.println("reverse string:"+reverse);
    
    }
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}