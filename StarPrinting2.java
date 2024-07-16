package Patterns;

public class StarPrinting2 {

    public static void main(String[] args) {

        //* * * *
        //* * *
        //* *
        //*

        int n =4;
        for(int i = 1; i <= n; i++){
            for(int j=4; j>=i; j--){
                   System.out.print("x");
            }
            System.out.println("");
        }

    }
}
