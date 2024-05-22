import java.util.Scanner;
import java.lang.StringBuilder;
class Print_Even_Len_Word {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter: ");
     String s = sc.nextLine();

     StringBuilder temp = new StringBuilder();
     StringBuilder ans = new StringBuilder();

     for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=' '){
            temp.append(s.charAt(i));
        }
        else{
            if(temp.length()%2==0){
                ans.append(temp+" ");
            }
            temp.setLength(0);
        }
     }

     if(temp.length()%2==0){
        ans.append(temp+" ");
    }

    System.out.println(ans);
    }
}
