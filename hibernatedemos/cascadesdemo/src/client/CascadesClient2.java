package client;

import org.hibernate.Session;

import entity.Guide;
import entity.Student;
import util.HIbernateUtil;

public class CascadesClient2 {

	public static void main(String[] args) {
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Guide guide = session.get(Guide.class, 3L);
		
		// save this student with the guide who is already created in db
		Student student = new Student("2022ABC987", "Percy Williams", guide);
		
		session.persist(student);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
	
}