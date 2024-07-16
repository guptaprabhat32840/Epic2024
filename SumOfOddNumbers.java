package FunctionsMethods;

public class SumOfOddNumbers {
    public static int oddSum(int n) {

        int addSum = 0;
       for (int i =1; i<=n; i+=2){
           System.out.println("this will print the list of odd numbers"+i);
           addSum += i;
           System.out.println(addSum);
        }
       System.out.println("The summ of all nth odd numbers is :"+addSum);
        return addSum;
    }

    public static void main(String[] args) {

        oddSum(10);


    }
}

    
