import java.util.Scanner;
class Switch_Case {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter case of your choice");
        int number = sc.nextInt();

        switch(number){
            case 1:
            System.out.println("this is 1");

            case 2:
            System.out.println("this is 2");
            break;
            
            case 3:
            System.out.println("this is 3");
            break;

            default:
            System.out.println("out of range");
        }
    }
    
}
