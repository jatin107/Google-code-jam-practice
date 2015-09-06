package reversewords;

public class StringReverse {

	char ch[];

	public StringReverse(String str) {
		ch = str.toCharArray();

	}

	void print() {
		for (char c : ch)
			System.out.print(c);
		System.out.println();
	}

	String reverseAll() {
		reverse(0, ch.length - 1);
		print();

		for (int i = 0, j = 0; i <= ch.length; i++) {
			if (i == ch.length || ch[i] == ' ') {
				reverse(j, i - 1);
				j = i + 1;

			}

		}
		return new String(ch);

	}

	void reverse(int i, int j) {
		char temp;
		for (; i < j; i++, j--) {
			temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;

		}

	}

}
