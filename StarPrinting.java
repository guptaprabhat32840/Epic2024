package Patterns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StarPrinting {
    public static void main(String[] args) {
          //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
             //*
             //* *
             //* * *
             //* * * *
        int n = 4;
        for(int i= 1; i <=4 ;i++){

            for(int j=1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}