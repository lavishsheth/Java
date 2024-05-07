import java.lang.Math;
class Math_func {
 public static void main(String args[]){
    //square func
    int n = 25;
    System.out.println(Math.sqrt(n));
 
   // find max value func:
   int a=5,b=6;
   System.out.println("here is max: "+Math.max(a,b));

   //find min value func
   System.out.println("here is min: "+Math.min(a,b));

   //power func:
   int c=2;
   System.out.println("power func: "+Math.pow(3,c));

   // absolute func: neg -> pos
   int d=-2;
   System.out.println("print positive value: "+Math.abs(d));

   // ciel - > 
   float e = 10.2f;
   System.out.println("round of in front direction: "+Math.ceil(e));

   // floor - > 
   float f = 10.2f;
   System.out.println("round of in backward direction: "+Math.floor(f));
}   
}
