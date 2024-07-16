package FunctionsMethods;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 0, 0, 5, 6, 0};

        Arrays.sort(array);
        System.out.println(array);
        for (int i = array.length; i >=1; i--) {
            System.out.print(i);
        }


    }
}
