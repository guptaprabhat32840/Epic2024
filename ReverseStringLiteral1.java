package TwoPointerProblems;

public class ReverseStringLiteral1 {
	
	public static String reverseliteral(String value) {
		
		 value = value.trim();
		 
		
		
		String[] str = value.split("\\s+");
		
		System.out.println(str.length);
		
		StringBuilder sb = new StringBuilder();
		int n = str.length-1;
		for(int i =n;i>=0;i--) {
			sb.append(str[i]);
		if(i !=0) {
			sb.append(" ");
		}
		}
		
		
		//System.out.println(sb);
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		String value = " Hello Baby  hello letty ";
		
		String output = reverseliteral(value);
		
		System.out.println(output);
	}

}
