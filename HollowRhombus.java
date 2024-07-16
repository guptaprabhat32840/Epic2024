package Patterns;

public class HollowRhombus {
    public static void main(String[] args) {

        int n=5;


        for (int i =1; i<=n; i++) {                    //first 5 stars
        System.out.print("*");
        }
        System.out.println();
        System.out.println();


        for (int i =1; i<=n; i++){               // middle  line
            for(int j=1; j<=n; j++){
                if (j == 1 || j == n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            System.out.println();
        }
        for (int i =1; i<=n; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
    }
}
