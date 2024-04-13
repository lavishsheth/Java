import java.util.Scanner;
class LoopsinJava{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter value of your choice: ");
    int value=sc.nextInt();

    // for(int i=1;i<=value;i++){
    //     System.out.println(i);
    // }

    // for(int i=0;i<value;i++){
    //     System.out.println(i);
    // }

    // for(int i=0;i<value;i++){
    // System.out.println("hello world");
    // }



for(int i=2000 ;i<=value;i++){
    if((i%4==0&&i%100!=0) || (i%400==0)){
        System.out.println("year is leap year : "+i);
    }
    else{
        System.out.println("not a leap year: "+i);
    }
}
}
}