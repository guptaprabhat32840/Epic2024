package TwoPointerProblems;

public class ReverseStringWithoutPredifinedFunction {

	public static void swap(char[] array, int left, int right) {
		char temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	public static char[] sortString(String value) {

		value = value.trim();

		char[] cha = value.toCharArray();

		int n = cha.length;
		

		for (int left = 0; left < n - 1; left++) {   //bubble sort 
			for (int right = left + 1; right < n; right++) {

				if (cha[left] > cha[right]) {
					swap(cha, left, right);
				}
			}
		}

		return cha;
	}

	public static void main(String[] args) {

		String value = "abhyuohuihuhhisjnbjkslspusoazzh";

		char[] output = sortString(value);

		System.out.println(output);
	}

}
