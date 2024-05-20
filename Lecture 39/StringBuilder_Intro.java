import java.util.Scanner;
import java.lang.StringBuilder;
public class StringBuilder_Intro {
    public static void main(String args[]){
    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the data");
    String s = sc.nextLine();


    sb.append(s);
    System.out.println(sb);


    sb.append(" hello everyone");
    System.out.println(sb);
    }
}
