import java.util.Scanner;
class Array_Intro {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the size");
    int size=sc.nextInt();
    int[] no = new int[size];

    for(int i=0;i<no.length;i++){
        no[i]=sc.nextInt();
    }

    for(int i=0;i<no.length;i++){
        System.out.println("value of index: "+i+"= "+no[i]);
    }
    }
}
