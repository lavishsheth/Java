public class BinarySearch_Desc {
    public static void main(String args[]){
        int arr[]={75,50,45,35,20,3,2,1};
        int target=1;
        System.out.println("Is Element present in the array or not: "+Search(arr,target));
    }

    public static boolean Search(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==target){
                return true;
            }

            else if(arr[mid]>target){
                start=mid+1;
            }

            else{
                end=mid-1;
            }
        }

        return false;
    }
}
