import java.util.Scanner;
class LoopsinJava{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    // System.out.println("enter value of your choice: ");
    // int endingpoint= sc.nextInt();

    // for(int start=0;start<endingpoint;start++){
    //     System.out.println("hello world");
    // }


    // for(int i=0;i<endingpoint;i++){
    //      System.out.println(i+1);
    //      //i=0 -> 0<5->i+1->0+1=1//i=1->1<5->i+1=1+1=2//
    //  }

    // for(int i=1;i<=endingpoint;i++){
    //     System.out.println(i);
    // }


    int year=2000;
     for(int i=year;i<=2024;i++){
        if((i%4==0&&i%100!=0) || (i%400==0)){
            System.out.println("year is leap year : "+i);
        }
        else{
            System.out.println("not a leap year");
        }
     }
    }
}