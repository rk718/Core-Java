public class palindrome{
    public static void main(String args[]){
        String name="hello";
    String reversed=new StringBuilder(name).reverse().toString();
    if(name.equals(reversed))
    {
        System.out.println("palindrome");
    }
    else{
        System.out.println("not palindrome");
    }

    }


}