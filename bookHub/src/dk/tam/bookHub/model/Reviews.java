/**
 * 
 */
package dk.tam.bookHub.model;

import java.sql.Blob;

import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 * @author Martyna
 *
 */
public class Reviews {
	private Long id;
	private String review_title;
	private String book_author;
	private String book_publisher;
	private Blob book_picture;
	private String review_content;
	private Date review_date;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the review_title
	 */
	public String getReview_title() {
		return review_title;
	}

	/**
	 * @param review_title the review_title to set
	 */
	public void setReview_title(String review_title) {
		this.review_title = review_title;
	}

	/**
	 * @return the book_author
	 */
	public String getBook_author() {
		return book_author;
	}

	/**
	 * @param book_author the book_author to set
	 */
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	/**
	 * @return the book_publisher
	 */
	public String getBook_publisher() {
		return book_publisher;
	}

	/**
	 * @param book_publisher the book_publisher to set
	 */
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}

	/**
	 * @return the book_picture
	 */
	public Blob getBook_picture() {
		return book_picture;
	}

	/**
	 * @param book_picture the book_picture to set
	 */
	public void setBook_picture(Blob book_picture) {
		this.book_picture = book_picture;
	}

	/**
	 * @return the review_content
	 */
	public String getReview_content() {
		return review_content;
	}

	/**
	 * @param review_content the review_content to set
	 */
	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}

	/**
	 * @return the review_date
	 */
	public Date getReview_date() {
		return review_date;
	}

	/**
	 * @param review_date the review_date to set
	 */
	public void setReview_date(Date review_date) {
		this.review_date = review_date;
	}

	/**
	 * 
	 */
	public Reviews() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param long1
	 */
	public void setId(long long1) {
		// TODO Auto-generated method stub
		
	}

}
