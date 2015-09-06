package minimumScalarProduct;

import java.util.Arrays;
import java.util.StringTokenizer;

public class MinimumScalarProduct {
	long vec1[];
	long vec2[];
	int size;
	long mulsum;

	public MinimumScalarProduct(String vector1, String vector2, int size) {
		super();
		StringTokenizer st1 = new StringTokenizer(vector1, " ");
		StringTokenizer st2 = new StringTokenizer(vector2, " ");
		int i = 0;
		vec1 = new long[size];
		vec2 = new long[size];
		while (st1.hasMoreTokens()) {
			this.vec1[i] = Integer.parseInt(st1.nextToken());
			this.vec2[i++] = Integer.parseInt(st2.nextToken());
		}

		this.size = size;
		System.out.println("printing");
		InsertionSort is = new InsertionSort(6);
		is.arr = vec1;
		vec1 = is.insertionSort(true);// true asc. false des.
		System.out.println(Arrays.toString(vec1));
		is.arr = vec2;
		vec2 = is.insertionSort(false);
		System.out.println(Arrays.toString(vec2));
	}

	long mul() {
		mulsum = 0;
		int i = 0, j = size / 2;
		for (; i < size / 2 && j < size; i++, j++) {
			mulsum += vec1[i] * vec2[i];
			mulsum += vec1[j] * vec2[j];
		}
		if (size % 2 == 1)
			mulsum += vec1[size - 1] * vec2[size - 1];
		System.out.println("sum:" + mulsum);
		return mulsum;

	}

}
