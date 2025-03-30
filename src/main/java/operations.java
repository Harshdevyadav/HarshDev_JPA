import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stu");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Student student = entityManager.find(Student.class, 1);
		//System.out.println(student.getName());
		entityManager.remove(student);
		//student.setName("bobby");
		//entityManager.persist(student);
		entityManager.getTransaction().commit();	
		entityManager.close();
		factory.close();
		
		
		
		
		
		
	}

}
