package client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import entity.Guide;
import entity.Student;
import util.HIbernateUtil;

public class OneToManyBidierctionalClient {

	public static void main(String[] args) {
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Guide guide = session.get(Guide.class, 3L);
		Student john = new Student("2022ABC123", "John Smith", guide);
		Student mary = new Student("2021XYZ567", "Julie Mary", guide);
		
		guide.getStudents().add(john);
		guide.getStudents().add(mary);
		
		session.persist(guide);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
	
}