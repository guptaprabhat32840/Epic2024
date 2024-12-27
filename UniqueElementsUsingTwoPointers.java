package TwoPointerProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElementsUsingTwoPointers {
	
	

	public static int uniqueElements(int[] input) {
		int b = input.length - 1;
		int left = 0;
		int right = 1;

		while (right < b) {

			if (input[left] != input[right]) {
				left++;
				input[left] = input[right];
			}
			right++;
		}
		return left+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i : input) {
			set.add(i);
		}
		System.out.println(set);
		System.out.println(set.size());
		Arrays.toString(input);

		System.out.println(uniqueElements(input));

	}

}
