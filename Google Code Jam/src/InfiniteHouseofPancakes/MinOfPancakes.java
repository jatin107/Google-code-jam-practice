package InfiniteHouseofPancakes;

public class MinOfPancakes {

	int max = 0;
	int plates[];

	public MinOfPancakes(int[] plates) {
		super();
		this.plates = plates;
	}
	void print() {
		for (int i : plates)
			System.out.print(i);
		System.out.println();
	}
	int returnMax() {
		int t;
		max=0;
		print();
		for (int i : plates) {
			t=minTeller( i);
			if(t>=max)max=t;
		}
		return max;
	}

	static int minTeller(int n) {
		if (n == 1)
			return 1;
		else if (n % 2 == 1)// odd number
			return minTeller(n - 1) + 1;
		else
			return n/2 + 1;
	}

	public static void main(String str[]) {
		System.out.println(minTeller(23));
		
	}
}

