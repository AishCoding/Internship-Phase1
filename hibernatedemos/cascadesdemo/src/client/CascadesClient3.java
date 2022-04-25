package client;

import org.hibernate.Session;

import entity.Guide;
import entity.Student;
import util.HIbernateUtil;

public class CascadesClient3 {

	public static void main(String[] args) {
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Student student = session.get(Student.class, 3L);
		
		// delete one guide one student scenario
		session.delete(student);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
	
}