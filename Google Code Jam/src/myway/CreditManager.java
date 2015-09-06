/* Input  
 3 

 100
 3
 5 75 25

 200
 7
 150 24 79 50 88 345 3

 8
 8
 2 1 9 4 4 56 90 3
 Output 
 Case #1: 2 3
 Case #2: 1 4
 Case #3: 4 5


 */package myway;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreditManager {
	private static Scanner s;

	public CreditManager() {
	}

	public static void main(String[] args) {
		long t1=System.nanoTime();
		File f1;// This class is used for creation of files and directories,
				// file searching, file deletion etc.
		File f2=new File("/src/myway/A-small-output.out");
		
		f1 = new File("/src/myway/A-small-practice.in");
		// Java try block is used to enclose the code that might throw an
		// exception
		try {
			s = new Scanner(f1);
			PrintWriter pw=new PrintWriter(f2);
			int cases = s.nextInt(),tC;// total no. of cases
			tC=cases;
			int tCredit, tItems, tI;// t is used for total/tI is used as
									// temporary variable
			int prices[];
			int index = 0;// for movement in prices array
			int inum[]={1,2};
			int num=1;//like case #num
			
			while (cases != 0) {
				tCredit = s.nextInt();
				tI = tItems = s.nextInt();
				prices = new int[tItems];

				index = 0;// fresh start
				while (tI != 0) {
					prices[index++] = s.nextInt();
					tI--;
				}
				StoreCredit sc = new StoreCredit(tCredit, tItems, prices);
				
				inum= sc.getTwoitems();
				num=tC-cases+1;
				pw.println("Case #" +num + ": " + inum[0] + " " + inum[1]);
				cases--;
			}
			s.close();
			pw.close();
long t2=System.nanoTime();
System.out.println(t2-t1);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException ");

		}
		// System.out.println("wel done");

	}

}
