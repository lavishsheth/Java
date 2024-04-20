import java.util.Scanner;
public class Factorial_Without_Multiplication {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of your choice");
    int number = sc.nextInt();
    int fact=1;
    for(int start=number; start>=1; start--){
     fact=(int)(fact/(1.0/start));
    }

    System.out.println("factorial is: "+fact);
    }
}
