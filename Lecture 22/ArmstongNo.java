import java.util.Scanner;
public class ArmstongNo {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the value");
    int number = sc.nextInt();

    int temp = number;

    int ans=0;
    while(number>0){
        int rem=number%10;
        ans=ans+(rem*rem*rem);
        number=number/10;
    }

    if(temp==ans){
        System.out.println("it is an armstrong number: "+ans);
    }
    else{
        System.out.println("it is not an armstrong number: "+ans);
    }
    }
}
