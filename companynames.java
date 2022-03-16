import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class companynames {
	//imports csv file
	public static void main (String[] args) throws Exception {
		ArrayList<People> x = new ArrayList<People>();
		String row;
		//this is creating my data arraylist
		BufferedReader csvReader = new BufferedReader(new FileReader("names.csv"));
			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(",");
				People p = new People(0,data[1], Integer.parseInt(data[3]));
				x.add(p);

			}
		csvReader.close();
		System.out.print(x);
		
	}
}
