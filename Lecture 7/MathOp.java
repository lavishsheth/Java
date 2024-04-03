import java.util.Scanner;
class MathOp{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("enter value of first number");
     int first = sc.nextInt();

     System.out.println("enter value of second number");
     int second = sc.nextInt();


     System.out.println("here is my first value: "+first+" \nhere is my second value:"+second);

     int res=0;
     res=first+second;
     System.out.println("here is addition of two numbers: "+res);

     res=first-second;
     System.out.println("here is subtraction of two numbers: "+res);

     res=first*second;
     System.out.println("here is multiplication of two numbers: "+res);

     float ans = first/second;
     System.out.println("here is division of two numbers: "+ans);

     res = first % second;
     System.out.println("here is reminder of two numbers: "+res);
    }
}
