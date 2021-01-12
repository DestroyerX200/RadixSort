public class Radix {
	public static int nth(int n, int col) {
		n %= Math.pow(10, col+1); //truncating digits to the left of col
		n = (n - (n % ((int) Math.pow(10, col)) ) ) / (int) Math.pow(10, col);
		return Math.abs(n);
	}
}