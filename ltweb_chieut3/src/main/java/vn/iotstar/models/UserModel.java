package vn.iotstar.models;

import java.io.Serializable;
import java.sql.Date;

public class UserModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
    private String  username;
    private String email;
    private String password;
    private String images;
    private String fullname;
    private int role;
    private Date createdDate;
    private String phone;
	
    public UserModel() {
		super();
	}

	public UserModel(String username, String email, String password, String fullname, String images, int role,
			Date createdDate, String phone) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.images = images;
		this.fullname = fullname;
		this.role = role;
		this.createdDate = createdDate;
		this.phone = phone;
	}

	public UserModel(int id, String username, String email, String password, String fullname, String images, int role,
			Date createdDate, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.images = images;
		this.fullname = fullname;
		this.role = role;
		this.createdDate = createdDate;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", fullname=" + fullname + ", images=" + images +  ", role=" + role + ", createdDate=" + createdDate
				+ ", phone=" + phone + "]";
	}
    
    
}
