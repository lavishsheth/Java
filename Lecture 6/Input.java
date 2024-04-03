import java.util.Scanner;
//import java.util.*;

class Input{
    public static void main(String args[]){
        //scanner object has been created: 
        Scanner input = new Scanner(System.in);
 
        //now using of scanner method to take input:
        System.out.println("enter integer value: ");
        int i = input.nextInt();
        System.out.println("here is value of integer i: "+i);

        System.out.println("enter float value: ");
        float f = input.nextFloat();  
        System.out.println("here is value of float f: "+f);

        System.out.println("enter double value: ");
        double d = input.nextDouble();  
        System.out.println("here is value of Double d: "+d);

        System.out.println("enter long value");
        long l = input.nextLong();
        System.out.println("here is value of Long l: "+l);

        System.out.println("enter character value");
        char c = input.next().charAt(0);
        System.out.println("here is value of Character c: "+c);

        System.out.println("enter Boolean value");
        Boolean b = input.nextBoolean();
        System.out.println("here is value of boolean b: "+b);

        System.out.println("enter string");
        String s = input.next();
        System.out.println("here is value of string s: "+s);
    }
}