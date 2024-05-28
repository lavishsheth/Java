import java.lang.StringBuilder;
import java.util.Scanner;
class Approach_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        String s = sc.nextLine();

        boolean ans = Check(s);
        System.out.println(ans);
    }

    public static boolean Check(String s){
    StringBuilder ans = new StringBuilder();

    // for(int i=s.length()-1;i>=0;i--){
    //   ans.append(s.charAt(i));
    // }

    // if(ans.toString().equals(s)){
    //     return true;
    // }
    // return false;
    
    ans.append(s);
    ans.reverse();

     if(ans.toString().equals(s)){
        return true;
    }
    return false;
    
}
}