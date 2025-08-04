package Day1Prrms;

public class Person2 
{
	String fname;
	String lname;
	char gender;
	long phone;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Person2(String fname, String lname, char gender, long phone) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.phone = phone;
	}
	void display() {
		System.out.println("First Name: "+getFname());
		System.out.println("Last Name: "+getLname());
		System.out.println("gender: "+getGender());
		System.out.println("Phone No.: "+getPhone());
	}
}
