import java.util.Scanner;
public class DowhileLoop {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value:");
    int number=sc.nextInt();

    do{
        System.out.println("we are in loop regardlessly our condition is false");
    }while(number>0);
    }
}
