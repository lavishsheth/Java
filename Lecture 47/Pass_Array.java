import java.util.Scanner;
class Pass_Array {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size: ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    System.out.println("enter the element: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }

    int ans = Sum(arr);
    System.out.println("answer is: "+ans);
    }

    static int Sum(int arr[]){
        int sum=0; //1//3
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];   //arr[]={1,2};
        }
        return sum;
    }
}
