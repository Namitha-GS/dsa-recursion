package recursion;

public class StringLengthUsingRecursion {

	public static void main(String[] args) {
		int result = length("ABCDEFg");
		System.out.println(result);
	}
	
	private static int length(String s) {
		if(s.equals(""))
			return 0;
		
		return length(s.substring(1))+1;
	}
}
