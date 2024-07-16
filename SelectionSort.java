package SortiingTechniques;

public class SelectionSort {

    public static void main(String[] args) {

        int[] input = {7,6,8,4,2,1};

        //Selection sort

        for(int i =0; i<=input.length-1; i++){
            int smallestElement = i;
            for(int j =i+1; j<input.length; j++){

                if(input[smallestElement] > input[j]){
                    smallestElement = j;

                }
            }
            int temp = input[smallestElement];
            input[smallestElement] = input[i];
            input[i] = temp;
        }

        for(int i : input){
            System.out.print(i+" ");
        }
    }
}
