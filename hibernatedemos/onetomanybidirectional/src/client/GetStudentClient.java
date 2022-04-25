package client;

import org.hibernate.Session;

import entity.Guide;
import entity.Student;
import util.HIbernateUtil;

public class GetStudentClient {

	public static void main(String[] args) {
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Student student = session.get(Student.class, 5L);
		System.out.println(student);
		System.out.println(student.getGuide().getName());
		session.getTransaction().commit();
		
		session.close();
		
	}
	
}