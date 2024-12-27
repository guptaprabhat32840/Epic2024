package TwoPointerProblems;

import java.util.Arrays;

public class MinimizeMaximumPairSum {

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int pairSum(int[] input) {

		Arrays.sort(input);

		int i = 0, j = input.length - 1;
		int result = 0;

		while (i < j) {
			int sum = input[i] + input[j];

			result = max(result, sum);

			i++;
			j--;

		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 3, 5, 4, 2, 3, 6, 9, 8, 7 };

		int output = pairSum(input);
		System.out.println(output);

	}

}
