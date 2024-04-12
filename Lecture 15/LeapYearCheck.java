import java.util.Scanner;
class LeapYearCheck{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter year of your choice");
    int year = sc.nextInt();

    if((year%4==0&&year%100!=0) || (year%400==0)){
        System.out.println("year is leap year : "+year);
    }
    else{
        System.out.println("not a leap year");
    }
    }
}