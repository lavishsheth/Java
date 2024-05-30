import java.util.Scanner;
import java.lang.StringBuilder;

class Approach_5 {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the string: ");
String s = sc.nextLine();

Change_Line(s);
}

public static void Change_Line(String s){
 StringBuilder sb =  new StringBuilder();

 for(int i=0 ; i<s.length();i++){
    if(s.charAt(i)!=' '){
        sb.append(s.charAt(i));
    }

    else{
        System.out.print(sb+System.getProperty("line.separator"));
        sb.setLength(0);
    }
 }
 System.out.print(sb+System.getProperty("line.separator"));
}
}
