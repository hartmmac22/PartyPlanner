import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class companynames {
	//imports csv file
	public static void main (String[] args) throws Exception {
		ArrayList<String> x = new ArrayList<String>();
		
		Scanner sc = new Scanner(new File("companynames.csv"));
		sc.useDelimiter(",");
		
		while (sc.hasNext()) {
			x.add(sc.next());
		}
		sc.close();
		System.out.print(x);
	}
}
