package standingOvation;

public class StandingOvation {
	private int members[];
	int slevel;
	int n = 0;

	public StandingOvation(char[] members, int slevel) {
		super();
		this.members = new int[slevel + 1];
		this.slevel = slevel;
		for (int i = 0; i < slevel + 1; i++) {
			this.members[i] = (int) members[i] - '0';
		}
	}

	void print() {
		for (int i : members)
			System.out.print(i);
		System.out.println();
	}

	int test() {
		int temp = members[0];
		for (int i = 1; i < members.length; i++) {
			if (temp >= i) {
				temp += members[i];

			} else {
				members[0]++;
				n++;
				return test();
			}
		}
		return n;
	}

}
