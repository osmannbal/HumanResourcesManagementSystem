package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employer_verification")
public class EmployerVerification {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="employer_id")
	private int employerId;
	
	@Column(name="email_verification")
	private Boolean emailVerification;
	
	@Column(name="confirmation")
	private Boolean confirmation;

	public EmployerVerification() {
		
	}

	public EmployerVerification(int id, int employerId, Boolean emailVerification, Boolean confirmation) {
		super();
		this.id = id;
		this.employerId = employerId;
		this.emailVerification = emailVerification;
		this.confirmation = confirmation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public Boolean getEmailVerification() {
		return emailVerification;
	}

	public void setEmailVerification(Boolean emailVerification) {
		this.emailVerification = emailVerification;
	}

	public Boolean getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(Boolean confirmation) {
		this.confirmation = confirmation;
	}
}
