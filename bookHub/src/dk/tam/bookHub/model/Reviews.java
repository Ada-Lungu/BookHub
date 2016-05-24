/**
 * 
 */
package dk.tam.bookHub.model;

import java.sql.Blob;
import java.sql.Timestamp;

/**
 * @author Martyna
 *
 */
public class Reviews {
	private Long id;
	private String review_title;
	private String book_title;
	private String book_author;
	private String book_publisher;
	private Blob book_picture;
	private String review_content;
	
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	private Timestamp review_date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReview_title() {
		return review_title;
	}
	public void setReview_title(String review_title) {
		this.review_title = review_title;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	public Blob getBook_picture() {
		return book_picture;
	}
	public void setBook_picture(Blob book_picture) {
		this.book_picture = book_picture;
	}
	public String getReview_content() {
		return review_content;
	}
	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}
	public Timestamp getReview_date() {
		return review_date;
	}
	public void setReview_date(Timestamp review_date) {
		this.review_date = review_date;
	}

	

}
