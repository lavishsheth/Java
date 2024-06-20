import java.util.Scanner;
public class Odd_Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size");
        int size = sc.nextInt();

        System.out.println("enter value");
        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("sum of odd number is: "+oddsum(arr));
    }

    public static int oddsum(int[] arr){
    int sum=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0 && i%2!=0){
            sum=sum+arr[i];
        }
    }
    return sum;
    }
}
