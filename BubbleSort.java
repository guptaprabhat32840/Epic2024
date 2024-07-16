package SortiingTechniques;

public class BubbleSort {
    public static void sortOfArray(int arr[]) {

       /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }*/



        for(int i : arr){
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 7, 8, 9, 2, 3, 6, 5, 20, 90};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    //Swap
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }


        sortOfArray(arr);
    }
}
