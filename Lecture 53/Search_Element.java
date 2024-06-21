import java.util.Scanner;
public class Search_Element {
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

 System.out.println("enter the value you want to search: ");
 int no = sc.nextInt();

 System.out.println("enter array size: ");
 int size = sc.nextInt();
 int arr[] = new int[size];

 System.out.println("enter array values: ");
 for(int i=0;i<arr.length;i++){
  arr[i]=sc.nextInt();
 }

 System.out.println(search(arr, no));

 }
 
 static int search(int arr[], int no){
    for(int i=0;i<arr.length;i++){
     if(arr[i]==no){
        return i;
     }
    }
    return -1;
 }
}
