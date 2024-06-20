import java.util.Scanner;
class Swap_Element_in_Array{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter size: ");
    int size=sc.nextInt();

    int arr[]=new int[size];

    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    
    System.out.println("enter two swapping index");
    int index1=sc.nextInt();
    int index2=sc.nextInt();

    System.out.println("before swapping: ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    System.out.println();

    int ans[]=swap(arr, index1, index2);
    
    System.out.println("after swapping: ");
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
    }
}

static int[] swap(int[] arr, int index1,int index2){
int temp=arr[index1];
arr[index1]=arr[index2];
arr[index2]=temp;

return arr;
}
}