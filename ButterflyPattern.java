package Patterns;

public class ButterflyPattern {

    public static void main(String[] args) {


        int n = 8;


        for (int i = 1; i<= n; i++)                                    //line change

        {

            for (int j = 1; j <= i; j++)                                  //star print
            {
                System.out.print("*");
            }
            int spaces = 2 * (n - i );
            for (int k = 1; k <= spaces; k++) {                                    //space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //outerloop



        for (int i = n; i>= 1; i--)                                    //line change

        {

            for (int j = 1; j <= i; j++)                                  //star print
            {
                System.out.print("*");
            }
            int spaces = 2 * (n - i );
            for (int k = 1; k <= spaces; k++) {                                    //space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
