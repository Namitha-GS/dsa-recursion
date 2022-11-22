package recursion;

public class ModuloOperation {

	public static void main(String[] args) {
		int result = modulo(13, 4);
		System.out.print(result);
	}
	
	private static int modulo(int num, int den) {
		if(num < den)
			return num;
		
		return modulo(num-den, den);
	}

}
