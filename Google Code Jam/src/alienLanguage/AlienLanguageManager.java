package alienLanguage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AlienLanguageManager {
	private static Scanner s;
	static File f1;// This class is used for creation of files and directories,
	static File f2; // file searching, file deletion etc.
	static int length;// max length of word.
	static int lines; // no.of length
	static int patterns; // no.of patterns
	static char dic[][];
	private static PrintWriter pw;

	public static void main(String[] args) {
		f1 = new File("A-large-practice.in");
		f2 = new File("A-large-practice.out");
		// below code might throw anexception
		try {
			s = new Scanner(f1);
			pw = new PrintWriter(f2);
			length = s.nextInt();
			lines = s.nextInt();
			patterns = s.nextInt();
			int i = 0;// for indexing
			dic = new char[lines][length];
			System.out.println(s.nextLine());
			while (lines-- != 0)// AlienLanguageDictionary is under construction
			{
				dic[i++] = s.nextLine().toCharArray();
			}
			AlienLanguageDictionary ald = new AlienLanguageDictionary(dic);
			int num = 1;
			while (patterns-- != 0) {
				String str = s.nextLine();
				int d = new AlienLanguageChecker(str, ald).countWords();
				pw.println("Case #" + num++ + ": " + d);
				System.out.println(d);
			}
			s.close();
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException ");
		}
	}
}
