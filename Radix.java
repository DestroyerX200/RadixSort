public class Radix {
	public static int nth(int n, int col) {
		int k = Math.abs(n);
		for (int i = 0; i < col; i++) {
			k /= 10; 
		}
		return k % 10;
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
		//getting number of total passes/columns needed.
		int numCols = -1;
		int size = data.size();
		for (int i = 0; i < size; i++) {
			int current = data.remove(0);
			data.add(current);
			if (length(current) > numCols) {
				numCols = length(current);
			}
		}

		//performing RadixSort
		for (int col = 0; col < numCols; col++) {
			for (int j = 0; j < size; j++) {
				int number = data.remove(0);
				int digit = nth(number, col);
				buckets[digit].add(number);
			}
			merge(data, buckets);
		}
	}
	public static void radixSort(SortableLinkedList data) {
		SortableLinkedList nonNegatives = new SortableLinkedList();
		SortableLinkedList negatives = new SortableLinkedList();

		//populating nonNegatives and negatives
		int dataSize = data.size();
		for (int i = 0; i < dataSize; i++) {
			int current = data.remove(0);
			if (current < 0) {
				negatives.add(current);
			} else {
				nonNegatives.add(current);
			}
		}

		radixSortSimple(nonNegatives); //sorted list of nonNegative numbers
		radixSortSimple(negatives); //reverse-sorted list of negative numbers, so biggest number is found at index 0.

		//taking the negatives and adding them to the beginning of data in descending order.
		int negativesSize = negatives.size();
		for (int i = 0; i < negativesSize; i++) {
			int number = negatives.remove(0);
			data.add(0, number);
		}
		data.extend(nonNegatives);
	}
}