/**
 * 
 */
package dk.tam.bookHub.model;

import java.util.Date;

/**
 * @author Martyna
 *
 */
public class Comments {
	private Long id;
	private Long review_id;
	private Date posted_date;
	private String content;
	private String nickname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getReview_id() {
		return review_id;
	}

	public void setReview_id(Long review_id) {
		this.review_id = review_id;
	}

	public java.util.Date getPosted_date() {
		return posted_date;
	}

	public void setPosted_date(java.sql.Date date) {
		this.posted_date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * 
	 */
	public Comments() {
		// TODO Auto-generated constructor stub
	}

}
