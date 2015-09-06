package myway;

public class StoreCredit {
	private int totalCredits = 0;
	private int totalItems = 0;
	private int prices[];
	public static int cases = 0;

	public StoreCredit(int totalCredits, int totalItems, int prices[]) {

		this.totalCredits = totalCredits;
		this.totalItems = totalItems;
		this.prices = new int[prices.length];
		int index = 0;
		for (int price : prices) {
			this.prices[index++] = price;
		}
	}

	public int[] getTwoitems() {
		int inum[] = { 1, 2 };
		int max = 0;
	
		for (int i = 0; i < totalItems; i++) {
			for (int j = i + 1; j < totalItems; j++) {
				if (max < prices[i] + prices[j] && totalCredits>=prices[i] + prices[j]) {
						
						inum[0] = i;
						inum[1] = j;
						max = prices[i] + prices[j];
					
				}

			}
		}
		inum[0]++;
		inum[1]++;

		return inum;
	}

	@Override
	public String toString() {
		int inum[] = getTwoitems();

		cases++;
		return "Case #" + cases + ": " + inum[0] + " " + inum[1];
	}

}
