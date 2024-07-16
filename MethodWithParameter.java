package FunctionsMethods;

import java.util.Arrays;

public class MethodWithParameter {

    public static int[] add(int[] input){
        // Arrays.sort(input);
        int c =0;
        for (int i =0; i<input.length-1;i++){
            c= c+input[i];
        }
     System.out.print(c);

        return input ;
    }
    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6,7,8,8,9,9};

        add(input);

    }
}
