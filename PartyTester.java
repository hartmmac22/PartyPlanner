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
		
		//sorting algorithm
		int x = 0;
		int companyOne = 0;
		int companyTwo = 0;
		int companyThree = 0;
		int companyFour = 0;
		int companyFive = 0;
		
		//this does basic sorting for tables for 10 people
		for (int i = 0; i < 10; i++){
			if (person.get(i).companyID == 1) {
				if(companyOne != 1){
					People temp = new People(1, name[i], companyID[i]);
					person.set(i, temp);
					companyOne = 1;
				}
				else {
					People temp = new People(2, name[i], companyID[i]);
					person.set(i, temp);
				}
			}
			
			if (person.get(i).companyID == 2) {
				if(companyTwo != 1){
					People temp = new People(1, name[i], companyID[i]);
					person.set(i, temp);
					companyTwo = 1;
				}
				else {
					People temp = new People(2, name[i], companyID[i]);
					person.set(i, temp);
				}
			}
			
			if (person.get(i).companyID == 3) {
				if(companyThree != 1){
					People temp = new People(1, name[i], companyID[i]);
					person.set(i, temp);
					companyThree = 1;
				}
				else {
					People temp = new People(2, name[i], companyID[i]);
					person.set(i, temp);
				}
			}
			
			if (person.get(i).companyID == 4) {
				if(companyFour != 1){
					People temp = new People(1, name[i], companyID[i]);
					person.set(i, temp);
					companyFour = 1;
				}
				else {
					People temp = new People(2, name[i], companyID[i]);
					person.set(i, temp);
				}
			}
			
			if (person.get(i).companyID == 5) {
				if(companyFive != 1){
					People temp = new People(1, name[i], companyID[i]);
					person.set(i, temp);
					companyFive = 1;
				}
				else {
					People temp = new People(2, name[i], companyID[i]);
					person.set(i, temp);
				}
			}
		}
		System.out.println(person);
		
		//this prints out who's assigned to which table
		System.out.println("\n" + "Table 1 : ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 1) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}
			
		System.out.println("\n" + "Table 2 : ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 2) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}
			
			
	}
}
