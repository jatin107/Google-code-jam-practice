	package alienLanguage;
	//small test
	public class AlienLanguageChecker {
		AlienLanguageDictionary ald;
		char[][] pattern;//
		String inputpattern;
	
		public AlienLanguageChecker(String inputpattern, AlienLanguageDictionary ald) {
			super();
			this.inputpattern = inputpattern;
			this.ald = ald;
			char ch[] = inputpattern.toCharArray();
			pattern = new char[ald.letters][26];
			boolean flag = true;// looking for '('
			int pi = 0, pj = 0, bi = 0;
			for (int i = 0; i < ch.length; i++) {
				if (flag && ch[i] == '(') {
					flag = false;
	
				} else if (!flag && ch[i] == ')') {
					flag = true;
					pi++;
					pj = 0;
					bi = i;
	
				} else if (inputpattern.substring(bi, i).contains("(")) {
					pattern[pi][pj++] = ch[i];
				} else {
					pj = 0;
					pattern[pi++][pj] = ch[i];
				}
	
			}
	
		}
	
		public int countWords() {
			int count = 0;
			for (int i = 0; i < ald.dic.length; i++) {
				if (Checker(ald.dic[i]))
					count++;
			}
	
			return count;
		}
	
		public boolean Checker(char ch[]) {
			int i = 0;
			boolean flag = true;
			for (char a[] : pattern) {
				flag = false;
				for (char b : a) {
					if (ch[i] == b) {
						flag = true;
						i++;
						break;
					}
				}
				if (!flag)
					return false;
			}
			return true;
		}
	
	}
