class Linear_Search{
    public static void main(String args[]){
        int arr[]={5,29,30,6,4,3,15,20};
        int target = 20;

        System.out.println("Element : "+Search(arr,target));
    }

    public static boolean Search(int arr[],int target){
            if(arr.length==0){
                return false;
            }

            for(int i=0; i<arr.length;i++){
                if(arr[i]==target){
                    return true;
                }
            }
            return false;
    }
}