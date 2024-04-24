import java.util.Scanner;
class Cal {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int ans=0;
while(true){
    System.out.println("enter operation which you want to perform: - +, - , * , / ,%");
    char op = sc.next().charAt(0); //&
    if(op=='+' || op =='-' || op == '*'|| op=='%' || op =='/'){
     System.out.println("enter the number");
     int var1 = sc.nextInt();
     System.out.println("enter the number");
     int var2 = sc.nextInt();

     if(op=='+'){
        ans = var1+var2;
     }

     else if(op=='-'){
        ans = var1-var2;
     }

     else if(op=='*'){
        ans = var1*var2;
     }

     else if(op=='/'){
        ans = var1/var2;
     }

     else if(op=='%'){
        ans = var1%var2;
     }
    }
    else{
        System.out.println("you enter wrong opeation");
    }

    System.out.println("ans is: "+ans);
}
}
}