import java.util.Scanner;
public class Method3 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the year");
    int year = sc.nextInt();

    boolean a = Check(year);

    if(a==true){
        System.out.println("this year is leap year "+year);
    }
    else{
        System.out.println("this year is not a leap year "+year);
    }
   
    }

    static boolean Check(int year){
    if((year%4==0 && year%100!=0) || (year%400==0)){
       return true;
    }
    else{
        return false;
    }
    }    
}
