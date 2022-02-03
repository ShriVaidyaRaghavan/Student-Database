package StudentJDBC;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
        Student s1=new Student(101,"Gaurav",24,56);   
          
        Student s2=new Student(102,"Ronit",22,47);    
          
        Student s3=new Student(103,"Rahul",26,88);   
          
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
        em.getTransaction().commit();  
          
        emf.close();  
        em.close();  

	}

}
