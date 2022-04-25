package client;

import org.hibernate.Session;

import entity.Guide;
import entity.Student;
import util.HIbernateUtil;

public class GetGuideClient {

	public static void main(String[] args) {
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Guide guide = session.get(Guide.class, 3L);
		System.out.println(guide);
		System.out.println(guide.getStudents());
		session.getTransaction().commit();
		
		session.close();
		
	}
	
}