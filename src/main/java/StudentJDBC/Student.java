package StudentJDBC;

import java.util.Comparator;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity
public class Student implements Comparator<Student>{	
	   @Id
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
	

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getS_name().compareTo(o2.getS_name()); 
	}
	
}
