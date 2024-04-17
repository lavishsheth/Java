import java.util.Scanner;
public class FactorialofNumber {
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);

   System.out.println("enter the value: ");
   int number=sc.nextInt();

   int ans=1;
   for(int i=number;i>=1;i--){
    ans =ans*i;
   }

   System.out.println("factorial of number: "+number+"= "+ans);
   } 
}
