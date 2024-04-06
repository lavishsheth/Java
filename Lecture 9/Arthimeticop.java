import java.util.Scanner;
class Arthimeticop{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("enter value: ");
     int a = sc.nextInt();
     int b = sc.nextInt();

     System.out.println("value of A: "+a+" , value of B: "+b);
     int ans=0;
     ans=a+b;
     System.out.println("ans of add is : "+ans);

     ans=a-b;
     System.out.println("ans of sub is : "+ans);

     ans=a*b;
     System.out.println("ans of mul is : "+ans);

     ans=a/b;
     System.out.println("ans of div is : "+ans);
     
     ans=a%b;
     System.out.println("ans of rem is : "+ans);


     int c = 5;

     int d=0;

     d=++c;
     System.out.println("value of d after pre incre: "+d);
     
     int e = 4;
     d= e++;
     System.out.println("value of d after post incre: "+d);

     int f = 5;
     d=--f;
     System.out.println("value of d after pre dec: "+d);
     
     int k=5;
     d= k--;
     System.out.println("value of d after post dec: "+d);
    }
}