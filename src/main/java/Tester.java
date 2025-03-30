

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Student student = new Student();
		student.setName("sounak");
		student.setAge(18);
		entityManager.persist(student);
		entityManager.getTransaction().commit();	
		entityManager.close();
		factory.close();
		}

}
