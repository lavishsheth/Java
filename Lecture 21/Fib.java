import java.util.Scanner;
class Fib{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        int end = sc.nextInt();

        System.out.print("Here is fibonnaci number series till "+end+" = ");

        int a = 0;
        System.out.print(a+" ");
        int b = 1;
        System.out.print(b+" ");
        int fib = 0;

        for(int i=3;i<=end;i++){
            fib=a+b;
            System.out.print(fib+" ");
            a=b;
            b=fib;
        }
    }
}