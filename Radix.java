public class Radix {
	public static int nth(int n, int col) {
		int returnNum = Math.abs(n);
		returnNum %= Math.pow(10, col+1); //truncating digits to the left of col
		for (int i = 0; i < col; i++) {
			returnNum /= 10; 
		}
		return returnNum;
	}
}