class Convert_To_UpperCase{
    public static void main(String args[]){
        String s = "lavish";
        
        // String ans = UpperCase(s);
        // System.out.println("Here is uppercase string: "+ans);

        int index = 3;
        String ans= AtParIndex(index, s);

        System.out.println(ans);
        
    }

    public static String AtParIndex(int index,String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            if(i==index){
                ans=ans+(char)(s.charAt(i)-32);
            }
           else{
            ans=ans+s.charAt(i);
           }
        }
        return ans;
    }
    public static String UpperCase(String s){
      String ans="";
        for(int i=0;i<s.length();i++){
          ans=ans+(char)(s.charAt(i)-32);
      }
      return ans;
    }
}