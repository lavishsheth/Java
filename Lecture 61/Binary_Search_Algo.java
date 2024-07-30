class Binary_Search_Algo {
    public static void main(String args[]){
        int arr[]={1,2,5,10,15,20,25};
        int target=21;

        System.out.println("This value present on this index[if index is -1 means value doesnt exists]: "+Search(arr, target));
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

    return -1;
    }
}
