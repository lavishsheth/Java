import java.util.Scanner;
public class Count {
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);

    System.out.println("enter the number");
    long number= sc.nextLong();
     
    int count=0; //1//2
    while(number>0){
        long rem = number%10;
        if(rem==2){
            count++;
        }

        number=number/10;
    }

    System.out.println("answer is: "+count);
    }
}
