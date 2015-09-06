package standingOvation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class standingOvationManager {
	private static Scanner s;
	static File f1;// This class is used for creation of files and directories,
	static File f2; // file searching, file deletion etc.
	static int cases;
	static int slevel;
	static String str;
	static char members[];
	private static PrintWriter pw;
	static int num = 1;

	public static void main(String[] args) {
		f1 = new File("A-large.in");
		f2 = new File("A-large-practice.out");
		try {
			s = new Scanner(f1);
			pw = new PrintWriter(f2);
			cases = s.nextInt();
			while (cases != 0) {
				slevel = s.nextInt();
				str = s.next();
				members = new char[str.length()];
				members = str.trim().toCharArray();
				int d = new StandingOvation(members, slevel).test();
				System.out.println(d);
				pw.println("Case #" + num++ + ": " + d);
				cases--;
			}
			s.close();
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException ");
		}
	}
}
