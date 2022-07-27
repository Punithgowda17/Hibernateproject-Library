package library;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Savelibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Library l1=new Library();
		
//		l1.setBookId(1);
		l1.setBookName("JAVA");
		l1.setAuthorName("JAMES");
		l1.setBookPrice(3000);
		l1.setCreationdatetime(LocalDateTime.now());

		
		entityTransaction.begin();
		entityManager.persist(l1);
		entityTransaction.commit();
	}

}
