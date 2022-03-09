//creates people
public class People {
	int personID;
	String name;
	int companyID;
	int tableID;
		
	public People(int id, String pname, int cpID){
		this.tableID = id;
		this.name = pname;
		this.companyID = cpID;
	}
	public String toString() {
		return("Table " +tableID +",  Name: "+ name +", Company: "+ companyID + "\n");
	}
}
