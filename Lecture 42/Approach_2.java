import java.lang.StringBuilder;
import java.util.Scanner;
class Approach_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        String s = sc.nextLine();

        boolean ans = Check(s);
        System.out.println(ans);
    }

    public static boolean Check(String s){
        int start=0;
        int last=s.length()-1;

        while(start<=last){
            if(s.charAt(start)==s.charAt(last)){
                start++;
                last--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}