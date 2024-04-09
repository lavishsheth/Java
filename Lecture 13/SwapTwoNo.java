import java.util.Scanner;
class SwapTwoNo {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter value of first number: ");
    int no1 = sc.nextInt();

    System.out.println("enter value of second number: ");
    int no2 = sc.nextInt();

    System.out.println("Before Swapping: ");
    System.out.println("value of Number 1 is: "+no1);
    System.out.println("value of Number 2 is: "+no2);


    int temp = no1;
    no1=no2;
    no2=temp;

    System.out.println("After Swapping: ");
    System.out.println("value of Number 1 is: "+no1);
    System.out.println("value of Number 2 is: "+no2);
    }
}
