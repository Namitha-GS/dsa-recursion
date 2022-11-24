package recursion;

public class VowelCountUsingRecursion {

	public static void main(String[] args) {
		String s = "lanaguage";
		int count = vowelCount(s.toUpperCase(), s.length());
		System.out.println(count);
	}
	
	private static int vowelCount(String s, int n) {
		if(n==1) {
			if(isVowel(s.charAt(n-1)))
				return 1;
			
			return 0;
		}
		if(isVowel(s.charAt(n-1))) 
			return vowelCount(s, n-1)+1;
		
		return vowelCount(s, n-1);
	}
	
	private static boolean isVowel(char c) {
		if(c=='A' || c== 'E' || c=='I' || c=='O' || c=='U') 
			return true;
		return false;
	}

}
