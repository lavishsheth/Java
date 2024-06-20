import java.util.Scanner;
public class MD_Array {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);

        System.out.println("enter row and col: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("enter value");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }


        System.out.println("here is your array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
