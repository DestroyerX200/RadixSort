import java.util.Random;
public class Tester {
	public static void testRadixSort(int sizeOfNumbers, int sizeOfData) {
		Random rng = new Random(0);
		SortableLinkedList original = new SortableLinkedList();

		for (int j = 0; j < sizeOfData; j++) {
			int randomParity = new Random().nextInt() % 2;
			int negativeOrNot = -1;
			if (randomParity == 0) {
				negativeOrNot = 1;
			}
			original.add(rng.nextInt() % sizeOfNumbers * negativeOrNot); 
		}
		Radix.radixSort(original);
	}
	public static void main(String[] args) {
		// System.out.println(Radix.nth(123,1));
		// System.out.println(Radix.nth(-123,1));
		// System.out.println(Radix.nth(123,2));
		// System.out.println(Radix.nth(-123,2));
		// System.out.println(Radix.nth(15, 2));
		// System.out.println(27/4);

		// System.out.println();

		// System.out.println(Radix.length(0));
		// System.out.println(Radix.length(15));
		// System.out.println(Radix.length(-10));
		// System.out.println(Radix.length(5112));

		// SortableLinkedList original = new SortableLinkedList();
		// original.add(0); original.add(1); original.add(1);
		// original.add(2); original.add(3); original.add(5);
		// System.out.println("original: " + original);

		// SortableLinkedList bucketA = new SortableLinkedList();
		// SortableLinkedList bucketB = new SortableLinkedList();
		// SortableLinkedList bucketC = new SortableLinkedList();

		// for (int i = 0; i < 5; i++) {
		// 	bucketA.add(i);
		// 	bucketB.add(i*i);
		// 	bucketC.add(i*i*i);
		// }

		// System.out.println("bucketA: " + bucketA);
		// System.out.println("bucketB: " + bucketB);
		// System.out.println("bucketC: " + bucketC);

		// SortableLinkedList[] buckets = {bucketA, bucketB, bucketC};

		// System.out.println("after SortableLinkedList[] buckets = {bucketA, bucketB, bucketC}");
		// System.out.println("method call: Radix.merge(original, buckets)");
		// Radix.merge(original, buckets);
		// System.out.println("original: " + original);

		// SortableLinkedList testSimple = new SortableLinkedList();
		// for (int i = 0; i < 15; i++) {
		// 	if (i % 3 == 0) {
		// 		testSimple.add(i);
		// 	}
		// 	else if (i % 3 == 1) {
		// 		testSimple.add(i*i);
		// 	}
		// 	else if (i % 3 == 2) {
		// 		testSimple.add(i * i * i);
		// 	}
		// }
		// System.out.println(testSimple);

		// Radix.radixSortSimple(testSimple);
		// System.out.println(testSimple);

		// SortableLinkedList test = new SortableLinkedList();
		// for (int i = 0; i < 15; i++) {
		// 	if (i % 3 == 0) {
		// 		test.add(i);
		// 	}
		// 	else if (i % 3 == 1) {
		// 		test.add(-i*i);
		// 	}
		// 	else if (i % 3 == 2) {
		// 		test.add(i * i * i);
		// 	}
		// }
		// System.out.println(test);

		// Radix.radixSort(test);
		// System.out.println(test);

		// SortableLinkedList alphaTest = new SortableLinkedList();
		// System.out.println(alphaTest);
		// Radix.radixSort(alphaTest);
		// System.out.println(alphaTest);

		// SortableLinkedList betaTest = new SortableLinkedList();
		// 		for (int i = 0; i < 15; i++) {
		// 	if (i % 3 == 0) {
		// 		betaTest.add(i);
		// 	}
		// 	else if (i % 3 == 1) {
		// 		betaTest.add(-i*i);
		// 		betaTest.add(-i*i);
		// 	}
		// 	else if (i % 3 == 2) {
		// 		betaTest.add(i);
		// 		betaTest.add(i);
		// 	}
		// }
		// System.out.println(betaTest);
		// Radix.radixSort(betaTest);
		// System.out.println(betaTest);
		
		int sizeNumbers = Integer.parseInt(args[0]);
		int sizeData = Integer.parseInt(args[1]);
		testRadixSort(sizeNumbers, sizeData);

		SortableLinkedList a = new SortableLinkedList();
		SortableLinkedList b = new SortableLinkedList();
		for (int i = 0; i < 101010; i++) {
			a.add( i );
		}
		for (int i = 0; i < 100000; i++) {
			int k = a.remove(0);
			a.add(k);
		}
	}
}