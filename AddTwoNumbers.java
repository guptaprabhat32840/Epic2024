package FunctionsMethods;

import java.util.Scanner;

public class AddTwoNumbers {

    public static int sumOFTwoNumbers(int a, int b) {
        a = a + b;


        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sumOFTwoNumbers(a, b);


    }
}
