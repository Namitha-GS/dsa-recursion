package recursion;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int result = sum(5);
		System.out.println("Sum without Tail Recursion: "+result);
		int resultTailRecur = sumTailRecur(5, 0);
		System.out.println("Sum using Tail Recursion: "+ resultTailRecur);
	}

	private static int sum(int n) {
		if(n==1)
			return 1;
		
		return n+sum(n-1);
	}
	
	private static int sumTailRecur(int n, int ans) {
		if(n==0)
			return ans;
		
		return sumTailRecur(n-1 , ans+n);
	}
}
