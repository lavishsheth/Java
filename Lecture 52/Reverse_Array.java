import java.util.Scanner;
public class Reverse_Array {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter size:");
    int size = sc.nextInt();

    int arr[]= new int[size];

    System.out.println("enter value");
    for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
    }

    // int ans[]=reverse1(arr);

    reverse2(arr);

    // for(int i=0;i<arr.length;i++){
    //     System.out.println(ans[i]);
    // }

    }

    public static void reverse2(int arr[]){
        int start=0;
        int end=arr.length-1;

        System.out.println("before swapping: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        System.out.println("after swapping: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] reverse1(int arr[]){
     int ans[] = new int[arr.length];
     int count=0;
     for(int i=arr.length-1;i>=0;i--){
        ans[count]=arr[i];
        count++;
     }

     return ans;
    }
}
