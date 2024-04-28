import java.util.Scanner;
class Methods_Sum{
   public static void main(String args[]){
     //no return type -> void method:
   //   sum();
   //   System.out.println("hello i am here");
   //   sum();

   //   // return type: int:-> 

   //   //1:
   //   int a = sum1();
   //   System.out.println("value of a: " +a);
   //   //2
   //   System.out.println("second way " +sum1());

 
   //return flaot:-
   System.out.println("float " +op());     

}

   // static void sum(){
   //    int a=5;
   //    int b=6;
   //    int sum=a+b;
   //    System.out.println(sum);
   //    return;
   // }

   // static int sum1(){
   //    int a=5;
   //    int b=6;
   //    int sum=a+b;
   //    return sum;
   // }   

   static float op(){
     Scanner sc = new Scanner(System.in);
      float var2 = sc.nextFloat();
      float var1 = sc.nextFloat();

      float sum= var1+var2;
      return sum; 
   }
}