public class String_func {
public static void main(String args[]){
  String s = "Lavish";

  //length: 
  int i = s.length();
  System.out.println("Length of string is: "+i);
    
  //char At Function:
  char c = s.charAt(1);
  System.out.println("character at particular place: "+c);

  //Upper Case:
  System.out.println("All in Upper case: "+s.toUpperCase());

  
  //Lower Case:
  String d ="CODE";
  System.out.println("All in lower case: "+d.toLowerCase());

  //Upper case at particular index:
  int r = 1;
  System.out.println("here is given upper case at particular index: "+s.toUpperCase().charAt(r));


  //Lower case at particular index:
  r=0;
  System.out.println("here is given Lower case at particular index: "+s.toLowerCase().charAt(r));


  // trim: 
  String h = "  COLLEGE  hello";
  System.out.println("this is trim function"+h.trim());

  //concat: 
  String j = " hello ";
  String k = " World ";
  String ans = j.concat(k);
  System.out.println("here is concat function: "+ans);

  //substring:
  System.out.println("here is sub string: "+ans.substring(0,9));

}   
}
