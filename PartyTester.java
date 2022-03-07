import java.util.ArrayList;

public class PartyTester {
	public static void main (String[] args) {
		ArrayList<People> person = new ArrayList<People>();
		
		//making people
		String [] name = {"Abby", "Emma", "Laura", "Emily", "Jake", "Evan", "Spencer", "Paul", "Gabe", "Will"};
		int [] companyID ={1,1,2,2,3,3,4,4,5,5};
		int [] tableID = {0,0,0,0,0,0,0,0,0,0};
		
		//making array list of people
		for (int i = 0; i < 10; i++) {
			People temp = new People(tableID[i], name[i], companyID[i]);
			person.add(temp);
		}
		
		//begining of algorithm for sorting tables
		System.out.print(person);
		int x = 0;
		for (int i = 0; i < 10; i++){
			if (x == 0) {
				People temp = new People(tableID[i], name[i], 1);
				person.set(i, temp);
			}
		}
		
	}
}
