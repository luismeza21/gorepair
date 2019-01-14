package co.com.api.go.repair.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "lastName", "phonenumber", "identification", "isMechanic", "photoUrl", "qualification",
		"idUser", "idSuscription" })
@Entity
@Table(name = "client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@JsonProperty("name")
	@Column(name = "name")
	private String name;

	@JsonProperty("lastName")
	@Column(name = "last_name")
	private String lastName;

	@JsonProperty("phonenumber")
	@Column(name = "phonenumber")
	private String phonenumber;

	@JsonProperty("identification")
	@Column(name = "identification")
	private String identification;

	@JsonProperty("isMechanic")
	@Column(name = "is_mechanic")
	private String isMechanic;

	@JsonProperty("photoUrl")
	@Column(name = "photo_url")
	private String photoUrl;

	@JsonProperty("qualification")
	@Column(name = "qualification")
	private Long qualification;

	@JsonProperty("idUser")
	@Column(name = "id_user")
	private Long idUser;

	@JsonProperty("idSuscription")
	@Column(name = "id_suscription")
	private Long idSuscription;

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

	public Long getQualification() {
		return qualification;
	}

	public void setQualification(Long qualification) {
		this.qualification = qualification;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Long getIdSuscription() {
		return idSuscription;
	}

	public void setIdSuscription(Long idSuscription) {
		this.idSuscription = idSuscription;
	}

}
