import java .util.Scanner;
public class PatternFour{
    public static void main(String[] args){
        int rows,cols,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(rows=1;rows<=n;rows++)
        {
            for(cols=1;cols<=rows;cols++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}