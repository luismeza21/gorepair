package co.com.api.go.repair.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="name")
	private String name;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="phonenumber")
	private String phonenumber;
	
	@Column(name="identification")
	private String identification;
	
	@Column(name="is_mechanic")
	private String isMechanic; 
	
	@Column(name="photo_url")
	private String photoUrl; 
	
	@Column(name="code_authorization")
	private String codeAuthorization; 
	
	@Column(name="qualification")
	private Long qualification;
	
	@Column(name="id_role")
	private Long idRole;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getIsMechanic() {
		return isMechanic;
	}

	public void setIsMechanic(String isMechanic) {
		this.isMechanic = isMechanic;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getCodeAuthorization() {
		return codeAuthorization;
	}

	public void setCodeAuthorization(String codeAuthorization) {
		this.codeAuthorization = codeAuthorization;
	}

	public Long getQualification() {
		return qualification;
	}

	public void setQualification(Long qualification) {
		this.qualification = qualification;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	
	
	
}
