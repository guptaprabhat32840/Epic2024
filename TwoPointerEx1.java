package TwoPointerProblems;

import java.util.Arrays;

public class TwoPointerEx1 {
	public static void TargetSum(int[] input, int target) {
		
		int left = 0;
		int right = input.length-1;
		
		while(left < right) {
			int sum = input[left] + input[right];
			
			if(sum == target) {
				System.out.println("Pair found:-"+input[left]+"..."+input[right]);
				return;
			}else if(sum > target) {
				right--;
			}else 
				left++;
			
		}
		System.out.println("No sum found similar to target");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {8,1,2,3,4,6,7,5,6,7,8};
		 Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		
		int target = 12;
		
		TargetSum(input,target );
		
		
		
		

	}

}
