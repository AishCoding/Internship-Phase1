package client;

import org.hibernate.Session;

import entity.Guide;
import entity.Student;
import util.HIbernateUtil;

public class CascadesClient4 {

	public static void main(String[] args) {
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Student student = session.get(Student.class, 4L);
		
		// delete a student, whose guide has other students
		student.setGuide(null);
		session.delete(student);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
	
}