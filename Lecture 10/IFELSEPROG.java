public class IFELSEPROG {
    public static void main(String args[]){
        int a=3;

        //if - else :
        // if(a>4){
        //     System.out.println("we are in if block");
        // }
        // else{
        //     System.out.println("we are in else block");
        // }

        //cont if:
        // if(a>10){
        //     System.out.println("we are in 1 if block");
        // }

        // if(a>12){
        //     System.out.println("we are in 2 if block");
        // }

        // if(a>11){
        //     System.out.println("we are in 3 if block");
        // }

        // else{
        //     System.out.println("we are in else block");
        // }


        //else if:

        // if(a>11){
        //     System.out.println("we are in if block");
        // }

        // else if(a>21){
        //     System.out.println("we are in 1 else - if block");
        // }

        // else if(a>11){
        //     System.out.println("we are in 2 else - if block");
        // }

        // else{
        //     System.out.println("we are in else block");
        // }


        //nested if:
        if(a>12){
            System.out.println("we are inside 1 block");
            if(a>11){
                System.out.println("we are inside 2 block");
            }
            else{
                System.out.println("we are having false condition in 2 if block");
            }
        }
        else{
            System.out.println("we are having false condition in 1 if block");
        }
    }
}
