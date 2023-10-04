import java.util.Scanner;
public class Vowels{
    public static void main(String[] args){
        char ch;
        System.out.println("enter the character\n");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
            System.out.println("vowels");
        }
        else{
            System.out.println(" not vowels");
        }
    }
}