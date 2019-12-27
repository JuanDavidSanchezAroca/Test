package co.productstore.infrastructure.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class UserSystemEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@Column ( name = "firstName")
	private String firstName;
	
	@Column ( name = "lastName")
	private String lastName;
	
	@Column ( name = "phone")
	private String phone;
	
	@OneToOne(mappedBy = "userSystem")
	private LoginEntity login;

	public UserSystemEntity() {
		super();
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public LoginEntity getLogin() {
		return login;
	}


	public void setLogin(LoginEntity login) {
		this.login = login;
	}
	
	
}
