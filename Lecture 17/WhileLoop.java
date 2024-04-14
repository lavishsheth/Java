import java.util.Scanner;
public class WhileLoop {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int number = sc.nextInt();

    while(number>0){
        System.out.println("hello this was part of inside loop");
        number=number/2;
    }
    }
}
