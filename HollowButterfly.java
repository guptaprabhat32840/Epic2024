package Patterns;

public class HollowButterfly {
    public static void main(String[] args) {

        int n = 6;
        for (int i = 1; i <= n; i++) {             //line changing
            for (int j = 1; j <= i; j++) {          //left star printing
                if (j == 1 || j == i) {           //this will print 1st and last star
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= 2 * (n - i); k++) {             //space printing
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {                     //right side star printing
                 if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }


            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }


            System.out.println();
        }

    }
}
/*

        *          *
        **        **
        * *      * *
        *  *    *  *
        *   *  *   *
        *    **    *
        *    **    *
        *   *  *   *
        *  *    *  *
        * *      * *
        **        **
        *          *

*/
