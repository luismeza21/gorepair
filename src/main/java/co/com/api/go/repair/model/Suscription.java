package co.com.api.go.repair.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUSCRIPTION")
public class Suscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "id_user")
	private Long idUser;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "currency")
	private Long currency;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "number_services")
	private Long numberServices;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCurrency() {
		return currency;
	}

	public void setCurrency(Long currency) {
		this.currency = currency;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getNumberServices() {
		return numberServices;
	}

	public void setNumberServices(Long numberServices) {
		this.numberServices = numberServices;
	}

}
