package Day1Prrms;

public class Person3 {
	String fname;
	String lname;
	long phone;
	enum gender{M,F}
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Person3(String fname, String lname, long phone) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
	};
	void display() {
		System.out.println("First Name: "+getFname());
		System.out.println("Last Name: "+getLname());
		System.out.println("gender: "+ gender.F);
		System.out.println("Phone No.: "+getPhone());
	}
	

}
