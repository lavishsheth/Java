import java.util.Scanner;
class EVEN_ODD{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter start point:");
    int start=sc.nextInt();

    System.out.println("enter end point:");
    int end=sc.nextInt();

    for(int i=start;i<=end;i++){
        if(i%2==0){
            System.out.println("even number hai: "+i);
        }
        else{
            System.out.println("odd number hai: "+i);
        }
    }

    // int i=start;
    // while(i<=end){
    //     if(i%2==0){
    //         System.out.println("even number hai: "+i);
    //     }
    //     else{
    //         System.out.println("odd number hai: "+i);
    //     }
    //     i=i+1;
    // }
    }
}