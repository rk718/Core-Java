import java.util.Scanner;
public class CharToAscii{

    public static void main(String[] args) {
        char ch;
        System.out.println("enter the character\n");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int character=(int)ch;
        System.out.println("Ascii value :"+character);
    }
}