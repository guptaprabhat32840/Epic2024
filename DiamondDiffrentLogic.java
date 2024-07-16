package Patterns;

public class DiamondDiffrentLogic {

    public static void main(String[] args) {
        int n= 4;

        for(int i = 1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            int oddStars = (2*i)-1 ;
            for(int k = 1; k<=oddStars; k++){
                   System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            int oddStars = (2*i)-1 ;
            for(int k = 1; k<=oddStars; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
