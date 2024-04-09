import java.util.Scanner;
class Greatest_Amongs_Three{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("enter 1 value:");
       int a = sc.nextInt();

       
       System.out.println("enter 2 value:");
       int b = sc.nextInt();

       
       System.out.println("enter 3 value:");
       int c = sc.nextInt();

       if(a>b){
        if(a>c){
            System.out.println("A is greatest");
        }
        else {
            System.out.println("C is greatest");
        }
       }

       else if(b>c){
        System.out.println("B is greatest");
       }

       else{
        System.out.println("C is greatest");
       }

    }
}