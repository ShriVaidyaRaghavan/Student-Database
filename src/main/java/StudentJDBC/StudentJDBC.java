package StudentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentJDBC extends Student {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "17121999");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM mydb.Student;");
		List <Student> Emp = new ArrayList<>();
		while(rs.next()) {
		Student student = new Student(rs.getInt("S_id"),rs.getString("S_name"),rs.getInt("S_age"),rs.getInt("Marks"));
		//System.out.println(rs.getInt("S_id")+"  "); //+rs.getString(" EmployeeName")+"     "+rs.getInt("EmployeeSalary")); 
		Emp.add(student);
		}
		
        //Collections.sort(Emp);
	    System.out.print(Emp);

	}

}
