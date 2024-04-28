import java.util.Scanner;
class Methods_With_Arguments{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter value");
    int var1=sc.nextInt();
    System.out.println("enter value");
    int var2=sc.nextInt();

    System.out.println(sum(var1,var2));




    System.out.println(sum(4,4));
    }

    static int sum(int a,int b){
        int sum=a+b;
        return sum;
     }
}