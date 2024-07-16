package Patterns;

public class PalidronePattern {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {                                      //line changing
            for (int j = 1; j <= n - i; j++) {                              //spaces printing
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {                       //left side value is printing
                System.out.print(k);
            }

                //2nd half numbers
                for (int l = 2; l <= i; l++) {                    //right side value is printing
                    System.out.print(l);

            }
            System.out.println();
        }


    }
}
