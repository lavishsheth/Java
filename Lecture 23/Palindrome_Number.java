import java.util.Scanner;
public class Palindrome_Number {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the value");
    int number = sc.nextInt();
    int copy=number;

    int ans=0;
    while(number>0){
        int rem = number%10;
        ans=ans*10+rem;
        number=number/10;
    }

    if(copy==ans){
        System.out.println("this is palindrome number "+copy+" = "+ans);
    }
    else{
        System.out.println("this is not palindrome number "+copy+" = "+ans);
    }
    }
}
