
import java.util.Scanner;
public class PatternNine{
    public static void main(String[] args){
        int rows,cols,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(rows=1;rows<=n;rows++)
        {
            for(cols=1;cols<=rows;cols++)
            {
                char ch=(char)(rows+64);
                System.out.print(ch);

            }
            System.out.println();
        }
    }
}


