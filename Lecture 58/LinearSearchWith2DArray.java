import java.util.Scanner;
class LinearSearchWith2DArray {
    public static void main(String args[]){
        int row = 3;
        int col=3;
        int arr[][]=new int[row][col];

        Scanner sc = new Scanner(System.in);
        //used to take data from user:
        System.out.println("enter the data");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Here is your 2D Array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the element you want to search:");
        int target=sc.nextInt();
        System.out.println("This element is exist: "+Search(arr,target));
    }

    public static boolean Search(int arr[][],int target){
        for(int i=0;i<arr[0].length;i++){
           for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==target){
                return true;
            }
           }
        }
        return false;
    }
}
