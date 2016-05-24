/**
 * 
 */
package dk.tam.bookHub.model;

import java.sql.Timestamp;
//import java.util.Date;
//import java.util.ArrayList;
//import java.util.List;

/**
 * @author Martyna
 *
 */
public class Comments {
	private Long id;
	private Long review_id;
	private Timestamp posted_date;
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


	public Timestamp getPosted_date() {
		return posted_date;
	}


	public void setPosted_date(Timestamp posted_date) {
		this.posted_date = posted_date;
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
