package TwoPointerProblems;

import java.util.Arrays;

public class SortStringOfIntegers {
	
	public static String sortValues(String value) {
		
		value = value.trim();
		
		String[] str = value.split(",");
		
		System.out.println(str.length);
		
		Arrays.sort(str,(a,b) -> Integer.compare(Integer.parseInt(a), Integer.parseInt(b)));
		
		return String.join(",", str);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "1,2,3,10,11,4,5,6,7,8,9    ";
		
		String str = sortValues(value);
		
		System.out.println(str);

	}

}
