import java.util.Scanner;
class Intro_String{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value: ");
    // String s = sc.nextLine();
    // System.out.println(s);

    String s = sc.next();
    System.out.println("before function call"+s); //lavish

    search(s);

    System.out.println("after function call" +s); //lavish
  }

  public static void search(String s){
    s= "aaa";
  }
}