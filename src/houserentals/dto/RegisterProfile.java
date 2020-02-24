package houserentals.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegisterProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String fullName;
	@Column(unique=true, nullable=false )
	private String email;
	@Column(unique=true, nullable=false )
	private String mobileno;
	@Column(nullable=false)
	private String owner;
	@Column(nullable=false)
	private String username;
	@Column(nullable=false)
	private String  password;
	@Column(nullable=false)
	private String confirmPassword;
	
	public RegisterProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterProfile(int id, String fullName, String email, String mobileno,String owner, String username, String password,
			String confirmPassword) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.mobileno = mobileno;
		this.owner=owner;
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner= owner;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "RegisterProfile [id=" + id + ", fullName=" + fullName + ", email=" + email + ", mobileno=" + mobileno
				+ ",owner=" + owner + ", username=" + username + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}	
}

