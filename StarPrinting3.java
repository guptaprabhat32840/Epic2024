package Patterns;

public class StarPrinting3 {

    public static void main(String[] args) {
        //    *
        //   * *
        //       * * *

        //     * * * *
        int n = 4;
        for (int i = 1; i <= n; i++)// Line Changing forloop
        {
            for (int j = 1; j <= n-i; j++)// Star printing
            {
                System.out.print(" ");

            }
                for(int k = 1; k <= i ; k++) {
                    System.out.print("*");
                }
            System.out.println();
            }


        }
    }



