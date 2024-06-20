import java.util.Scanner;
public class Greater_No {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the size: ");
    int size = sc.nextInt();

    int arr[]=new int[size];

    System.out.println("enter the element: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }

     System.out.println("max value in array is: "+Max(arr));
     System.out.println("min value in array is: "+Min(arr));
    }

public static int Min(int[] arr){
    int min=Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++){
        if(min>arr[i]){
            min=arr[i];
        }
     }

     return min;
}

    public static int Max(int[] arr){
     int max=0;
     for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
     }

     return max;
    }
}
