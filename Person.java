package Day1Prrms;

public class Person {
	String fname;
	String lname;
	char gender;
	
	public Person(String fname, String lname, char gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	void display() {
		System.out.println("First Name: "+getFname());
		System.out.println("Last Name: "+getLname());
		System.out.println("gender: "+getGender());
	}

}
