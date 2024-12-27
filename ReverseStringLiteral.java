package TwoPointerProblems;

import java.util.Arrays;

public class ReverseStringLiteral {
	
	public static String reverseLiteral(String str) {
		
		str = str.trim();
		
		String[] input = str.split("\\s+");
		int n = input.length-1;
		int left = 0, right =n;
		System.out.println(n);
		
		while(left < right) {
			String temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			
			left++;
			right--;
			
			
		}
		
		return String.join("  ", input);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " Hello   Baby vaishnavi prabhat  ";
		
		String output = reverseLiteral(str);
		
		System.out.println(output);
		
		
		
				

	}

}
