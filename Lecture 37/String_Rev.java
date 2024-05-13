class String_Rev{
    public static void main(String args[]){
      String s ="xyz   xyz";

      String e="";

      for(int i =s.length()-1;i>=0;i--){
        e=e+s.charAt(i);
      }
      System.out.println("here is reverse of string: "+e);
    }
}
