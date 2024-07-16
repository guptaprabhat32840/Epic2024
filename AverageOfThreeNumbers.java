package FunctionsMethods;

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void average(int a, int b, int c){
        int averageValue  = (a+b+c) / 2;
        System.out.println(averageValue);
      //  return d;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        average(a,b,c);

    }
}
