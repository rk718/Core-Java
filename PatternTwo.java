import java .util.Scanner;
public class PatternTwo{
    public static void main(String[] args){
        int rows,cols,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(rows=1;rows<=n;rows++)
        {
            for(cols=1;cols<=n;cols++){
                System.out.print(cols);

            }
            System.out.println();
        }
    }
}