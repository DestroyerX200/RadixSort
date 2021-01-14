public class Radix {
	public static int nth(int n, int col) {
		int k = Math.abs(n);
		k %= Math.pow(10, col+1); //truncating digits to the left of col
		for (int i = 0; i < col; i++) {
			k /= 10; 
		}
		return k;
	}
	public static int length(int n) {
		if (n == 0) {
			return 1;
		}
		int k = Math.abs(n);
		return (int) Math.floor( Math.log10( (double) k) ) + 1;
	}
}