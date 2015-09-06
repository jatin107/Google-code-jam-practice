package alienLanguage;

public class AlienLanguageDictionary {

	char dic[][];
	int words;
	int letters;

	public AlienLanguageDictionary(char[][] ch) {
		super();
		this.dic = ch;
		words = ch.length;
		letters = ch[0].length;
	}

}
