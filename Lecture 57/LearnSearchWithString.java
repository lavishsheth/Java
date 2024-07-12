class LearnSearchWithString {
    public static void main(String args[]){
        String s="abcdefghigk";
        char target = 'l';
     
         System.out.println("here is element at index: "+Search(s,target));
    }

    public static int Search(String s , char t){
             if(s.length()==0){
                return -1;
             }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t){
                return i;
            }
        }

        return -1;
    }
}
