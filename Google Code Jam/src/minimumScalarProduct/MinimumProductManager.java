package minimumScalarProduct;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MinimumProductManager {
	private static Scanner s;
	static File f1;// This class is used for creation of files and directories,
	static File f2; // file searching, file deletion etc.
	static int cases;// total no. of cases
	private static PrintWriter pw;

	public static void main(String[] args) {
		f1 = new File("A-large-practice.in");
		f2 = new File("A-large-practice.out");
		// below code might throw anexception
		try {
			s = new Scanner(f1);
			pw = new PrintWriter(f2);
			cases = Integer.parseInt(s.nextLine());
			int num = 1;// like case #num
			int vecSize;
			while (cases != 0) {
				vecSize = Integer.parseInt(s.nextLine());
				MinimumScalarProduct msp = new MinimumScalarProduct(
						s.nextLine(), s.nextLine(), vecSize);
				pw.println("Case #" + num++ + ": " + msp.mul());
				cases--;
			}
			s.close();
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException ");
		}
	}

}
