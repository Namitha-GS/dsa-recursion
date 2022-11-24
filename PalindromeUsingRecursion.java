package recursion;

public class PalindromeUsingRecursion {

	public static void main(String[] args) {
		String s = "";
		if(isPalindrome(s)) {
			System.out.println(s+" is Palindrome");
		} else {
			System.out.println(s+ " is not a Palindrome");
		}
 	}
	
	private static boolean isPalindrome(String s) {
		if(s.isEmpty()) 
			return true;
		int n = s.length();
		return palindromeCheck(s, 0, n-1);
	}
	
	private static boolean palindromeCheck(String s, int start, int end) {
		if(start == end)
			return true;
		
		if(s.charAt(start) != s.charAt(end))
			return false;
		
		if(start < end)
			return palindromeCheck(s, start+1, end-1);
		
		return true;
	}
}
