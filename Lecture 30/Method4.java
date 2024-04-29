import java.util.Scanner;
public class Method4 {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter value 1: ");
int val1=sc.nextInt();

System.out.println("enter value 2: ");
int val2=sc.nextInt();

//int ans = Multiply(val1,val2);
System.out.println(Multiply(val1,val2));
} 

static int Multiply(int val1,int val2){
// int mul = val1*val2;
// return mul;

return val1*val2;
}
}
