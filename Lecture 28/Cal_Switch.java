import java.util.Scanner;
class Cal_Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("enter the opeartion you want to perform: + , - , * ,%,/");
            char op = sc.next().charAt(0); 
            
            System.out.println("enter the number");
            int var1=sc.nextInt();
            
            System.out.println("enter the number");
            int var2=sc.nextInt();
            
            int ans=0;
            switch(op){
                case '+':
                ans = var1+var2;
                System.out.println("ans is :"+ans);
                break;

                case '*':
                ans = var1*var2;
                System.out.println("ans is :"+ans);
                break;

                case '/':
                ans = var1/var2;
                System.out.println("ans is :"+ans);
                break;

                case '%':
                ans = var1%var2;
                System.out.println("ans is :"+ans);
                break;

                default:
                System.out.println("you enter wrong opeartor");
            }
        }
    }
}
