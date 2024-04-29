import java.util.Scanner;
class Method2 {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

// System.out.println("enter starting point");
// int start = sc.nextInt();

// System.out.println("enter ending point");
// int end = sc.nextInt();

//EvenOdd(start,end);

EvenOdd(4,10);
} 

public static void EvenOdd(int start,int end){
for(int i=start ; i<=end;i++){
    if(i%2==0){
        System.out.println("even no : "+i);
    }
    else{
        System.out.println("odd no: "+i);
    }
}
}


}
