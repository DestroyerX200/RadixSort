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
	public static void merge(SortableLinkedList original, SortableLinkedList[]buckets) {
		for (int i = 0; i < buckets.length; i++) {
			original.extend(buckets[i]);
		}
	}
	public static void radixSortSimple(SortableLinkedList data) {
		SortableLinkedList[] buckets = new SortableLinkedList[10]; //initializing the buckets
		for (int i = 0; i < 10; i++) {
			buckets[i] = new SortableLinkedList();
		}

		int current = data.get(0);
		int numCols = length(current); //getting number of total passes/columns needed.
		for (int i = 1; i < data.size(); i++) {
			current = data.get(i);
			if (length(current) > numCols) {
				numCols = length(current);
			}
		}

		int sizeOfData = data.size(); //performing RadixSort
		for (int col = 0; col < numCols; col++) {
			for (int j = 0; j < sizeOfData; j++) {
				int number = data.remove(0);
				int digit = nth(number, col);
				buckets[digit].add(number);
			}
			merge(data, buckets);
		}
	}
}