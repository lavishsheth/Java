import java.util.Scanner;
import java.lang.StringBuilder;
public class String_Swap {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter : ");

    String s = sc.nextLine();
    
    System.out.println(Swap(s));
}

static String Swap(String s){
if(s.length()%2==0){
    //even: 
    StringBuilder sb = new StringBuilder();
     int count=0;
    for(int i=0;i<s.length();i++){
            count=i+1;
            sb.append(s.charAt(count));
            sb.append(s.charAt(i));
            i++;
    }
    return sb.toString();
}
//odd:
return s;
}
}