package library;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updatelibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Library l2=new Library();
		l2.setBookId(1);
		l2.setBookName("java");
		l2.setAuthorName("AMES");
		l2.setBookPrice(5000);
		l2.setCreationdatetime(LocalDateTime.now());
		
		
		entityTransaction.begin();
		entityManager.merge(l2);
		entityTransaction.commit();
		
		
	}

}
