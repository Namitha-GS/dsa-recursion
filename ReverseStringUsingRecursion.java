package recursion;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String reverseStr = reverseString("ABCDE");
		System.out.print("Reversed String is: "+reverseStr);
	}
	
	private static String reverseString(String s) {
		if(s.isEmpty())
			return s;
		
		return reverseString(s.substring(1))+s.charAt(0);
	}

}
