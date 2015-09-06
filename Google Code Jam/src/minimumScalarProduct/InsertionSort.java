package minimumScalarProduct;

public class InsertionSort {
	public long arr[];

	InsertionSort(int i) {
		arr = new long[i];
	}

	long[] insertionSort(boolean flag) {
		long key;
		for (int i = 1, j = 0; i < arr.length; i++) {
			key = arr[i];
			j = i;
			while (j > 0 && compare(flag, key, arr[j - 1])) {// swap
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = key;
		}
		return arr;
	}

	boolean compare(boolean flag, long key, long arr) {
		if (!flag)
			return key > arr;
		else
			return key < arr;

	}

}
