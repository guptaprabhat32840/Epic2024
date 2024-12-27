package TwoPointerProblems;

import java.util.Iterator;

public class TwoPointerVovelReverse {
	
	
	
	public static boolean isVovels(char ch) {
		/*
		 * if(ch == 'a'|| ch == 'e'|| ch == 'i'||ch == 'o' ||ch == 'u' || ch == 'A'|| ch
		 * == 'E'|| ch == 'I'||ch == 'O' ||ch == 'U') { return true; } return false;
		 */
		
		/*
		 * switch(ch) { case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case
		 * 'E': case 'I': case 'O': case 'U': return true; default: return false; } }
		 */
		return "aeiouAEIOU".indexOf(ch) != -1;}
	
	
	
	public static char[] vovelChanger(char[] input) {
		
		int n = input.length-1;
		int left = 0;
		int right =n;
		
		while(left < right) {
			
			if(!isVovels(input[left])) {
				left++;
			}else if (!isVovels(input[right])) {
				right--;
			}else {
				char temp = input[left];
				input[left] = input[right];
				input[right] = temp;
				left++;
				right--;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Hello";
		
		char[] ch = input.toCharArray();
		
		char[] character = vovelChanger(ch);
		
		System.out.println(character);
}

	}


