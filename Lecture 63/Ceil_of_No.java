public class Ceil_of_No {
    public static void main(String args[]){
        int arr[]={5,10,15,20,25};
        int target=19;

        System.out.println("This value present on this index[if index is not there return ceil value of it]: "+Search(arr, target));
    }

    public static int Search(int[] arr,int target){
    int start=0;
    int end=arr.length-1;

    while(start<=end){
        int mid = (start+end)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
     
    return arr[start];
    }
}
