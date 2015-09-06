package InfiniteHouseofPancakes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PancakesManager {
	private static Scanner s;
	static File f1;// This class is used for creation of files and directories,
	static File f2; // file searching, file deletion etc.
	static int cases;
	static int plates[];
	static int subcases;

	private static PrintWriter pw;
	static int num = 1;
	static int i = 0;

	public static void main(String[] args) {
		f1 = new File("B-small-attempt4.in");
		f2 = new File("B-small-attempt4.out");
		// below code might throw anexception

		try {
			s = new Scanner(f1);
			pw = new PrintWriter(f2);
			cases = s.nextInt();
			while (cases != 0) {
				i = 0;
				plates = new int[subcases = s.nextInt()];
				while (subcases != 0) {
					plates[i++] = s.nextInt();

					subcases--;
				}
				int d = new MinOfPancakes(plates).returnMax();
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
