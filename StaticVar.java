
public class StaticVar {
	public static void main(String... in) {
		
		Family fam = new Family("ERNEST", 20, "INYANG");
		System.out.println(fam.getFname());
		System.out.println();
		System.out.println(Family.getLname());
		System.out.println();
		System.out.println(fam.getAge());
		
	}

}









class Family{
	String fname;
	static String lname;
	int age;
	
	public Family(String fname, int age,String lname) {
		this.fname = fname;
		this.age = age;
		Family.lname = lname;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public static String getLname() {
		return lname;
	}

	public static void setLname(String lname) {
		Family.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}

//SHOWING THE USAGE OF A STATIC METHOD WITH A STATIC VARIABLE.................
