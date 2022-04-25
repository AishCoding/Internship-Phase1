package client;

import org.hibernate.Session;

import entity.Guide;
import entity.Student;
import util.HIbernateUtil;

public class CascadesClient1 {

	public static void main(String[] args) {
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Guide guide = new Guide("ABCDEF12844", "Dexter", 10000);
		Student student = new Student("2022ABC2163", "Thomas", guide);
				
		session.persist(student);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
	
}