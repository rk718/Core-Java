public class fact{
    public static void main(String[] args){
        int n=5;
        int factorial=fact(n);
        System.out.println("factorial is :"+factorial);
    }
public static int fact(int x){
      if(x==0||x==1){
    return 1;
      }
    else{
        return x*fact(x-1);
    }
}
}