import java.util.Scanner;
class Method1 {
public static void main(String args[]){
Scanner sc = new Scanner(System.in); 
System.out.println("enter value");
int a= sc.nextInt();
Printing(a);
}

static void Printing(int end){
for(int i=0;i<end;i++){
    System.out.println("Hello World");
}
}
}
