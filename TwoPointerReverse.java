package TwoPointerProblems;

public class TwoPointerReverse {
	
	public static void swap(char[] ch, int left, int right) {
		char temp = ch[left];
		ch[left] = ch[right];
		ch[right] = temp;
	}
	
	public static char[] reverseString(char[] ch) {
		int n = ch.length-1;
		int left = 0;
		int right = n;
		
		while(left < right) {
			
			swap(ch,left,right);
			left++;
			right--;
		}
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "hello";
		char[] ch = input.toCharArray();
		
		char[] output =  reverseString(ch);
		
		System.out.print(output);
		

	}

}
