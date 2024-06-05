import java.util.Scanner;
class Remove_Lead_Zero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter:");
        String s = sc.nextLine();

        String ans = Remove(s);
        System.out.println(ans);
    }

    static String Remove(String s){
     boolean check=false;
        if(s.charAt(0)=='0'){
           check=true;
    }
    else{
        return s;
    }

    StringBuilder sb = new StringBuilder();

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0' && check==true){
                 continue;
        }
        else{
            sb.append(s.charAt(i));
            check=false;
        }
    }
    return sb.toString();
    }
}
