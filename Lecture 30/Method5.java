import java.util.Scanner;
public class Method5 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value 1");
    int val1 =sc.nextInt();

    System.out.println("enter value 2: ");
    int val2=sc.nextInt();

    // float ans = divide(val1,val2);
    // System.out.println(ans);

    double ans = divide(val1,val2);
    System.out.println(ans);
    }

    static double divide(int val1,int val2){
        return val1/val2;
    }
}
