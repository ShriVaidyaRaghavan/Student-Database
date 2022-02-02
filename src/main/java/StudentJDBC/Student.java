package StudentJDBC;


public class Student {	 	
	   private int S_id;
	   private String S_name;
	   private int S_age;
	   private int Marks;
	   
	public Student() {
		super();
	}

	public Student(int S_id, String S_name, int S_age, int Marks) {
		super();
		this.S_id = S_id;
		this.S_name = S_name;
		this.S_age = S_age;
		this.Marks = Marks;
}

	public int getS_id() {
		return S_id;
	}

	public void setS_id(int s_id) {
		S_id = s_id;
	}

	public String getS_name() {
		return S_name;
	}

	public void setS_name(String s_name) {
		S_name = s_name;
	}

	public int getS_age() {
		return S_age;
	}

	public void setS_age(int s_age) {
		S_age = s_age;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}
	
	@Override
	public String toString() {
		return "Name: " + S_name + ", Marks: " + Marks;
	}
	
}
