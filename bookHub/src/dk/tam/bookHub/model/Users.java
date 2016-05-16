/**
 * 
 */
package dk.tam.bookHub.model;

import java.sql.Blob;

/**
 * @author Martyna
 *
 */
public class Users {
	private Long id;
	private String name;
	private String last_name;
	private String email;
	private String password;
	private Blob profile_picture;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Blob getProfile_picture() {
		return profile_picture;
	}

	public void setProfile_picture(Blob profile_picture) {
		this.profile_picture = profile_picture;
	}

	/**
	 * 
	 */
	public Users() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
