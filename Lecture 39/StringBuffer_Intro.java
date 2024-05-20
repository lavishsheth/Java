import java.util.Scanner;
import java.lang.StringBuffer;
public class StringBuffer_Intro {
    public static void main(String args[]){
    StringBuffer sb = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the data");
    String s = sc.nextLine();


    sb.append(s);
    System.out.println(sb);


    sb.append(" hello everyone");
    System.out.println(sb);
    }
}
