import java.util.Scanner;
import java.lang.StringBuilder;
class Insert_String {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("enter the string 1: ");
String s1= sc.nextLine();


System.out.println("enter the string 2: ");
String s2= sc.nextLine();

System.out.println("enter the index: ");
int index = sc.nextInt(); 

String ans = Insert(s1,s2,index);
System.out.println(ans);
}

public static String Insert(String s1, String s2, int index){
StringBuilder ans = new StringBuilder();
    for(int i=0;i<s1.length();i++){
        if(i!=index){
            ans.append(s1.charAt(i));
        }
        else{
            ans.append(s2+" ");
            ans.append(s1.charAt(i));
        }
}
   return ans.toString();
}
}
