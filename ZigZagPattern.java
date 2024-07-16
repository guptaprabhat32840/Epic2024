package Patterns;

public class ZigZagPattern {
    public static void main(String[] args) {


        int n =5 ;

        for(int i =1; i<=n; i++)                               //Line Change
        {
            //int space = n-i;
            for(int j= 1; j<=n-i; j++){                         //Spaces
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++){                             //star print
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
