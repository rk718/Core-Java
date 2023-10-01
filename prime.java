    public class prime{
    public static void main(String[]  args){
    int n=11;
    int i=2;
    boolean isprime= true;
    for(i=2;i<Math.sqrt(n);i++)
    {
        if(n%i==0)
        {
            isprime=false;
            break;
        }
    }
    if(isprime)
    {
        System.out.println("prime");
    }
    else
    {
        System.out.println("not prime");
    }
}
}