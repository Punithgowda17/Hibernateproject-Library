package library;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;
@Entity
public class Library {
	@Id
	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int BookId;
	private String BookName;
	private String AuthorName;
	private double BookPrice;
	private LocalDateTime creationdatetime;
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(double bookPrice) {
		BookPrice = bookPrice;
	}
	public LocalDateTime getCreationdatetime() {
		return creationdatetime;
	}
	public void setCreationdatetime(LocalDateTime creationdatetime) {
		this.creationdatetime = creationdatetime;
	}
	
	
	
	

}
