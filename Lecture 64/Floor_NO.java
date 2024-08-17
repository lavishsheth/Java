class Floor_NO {
public static void main(String args[]){
    int arr[]={5,10,15,20,25};
    int target=24;

     System.out.println(Floor(arr,target));
}   

public static int Floor(int arr[],int target){
int start = 0;
int end = arr.length-1;

while(start<=end){
    int mid=(start+end)/2;

    if(target==arr[mid]){
        return arr[mid];
    }
    else if(arr[mid] < target){
        start=mid+1;
    }
    else{
        end=mid-1;
    }
}
    return arr[end];
}
}
