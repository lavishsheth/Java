class Convert_To_LowerCase{
    public static void main(String args[]){
        String s = "LAVISH";
        int index = 2;
        // String ans = LowerCase(s);
        String ans= AtParIndex(index, s);
        System.out.println("Here is LOWERcase string: "+ans);
        
    }

    public static String AtParIndex(int index,String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            if(i==index){
                ans=ans+(char)(s.charAt(i)+32);
            }
           else{
            ans=ans+s.charAt(i);
           }
        }
        return ans;
    }

    public static String LowerCase(String s){
      String ans="";
        for(int i=0;i<s.length();i++){
          ans=ans+(char)(s.charAt(i)+32);
      }

      return ans;
    }
}