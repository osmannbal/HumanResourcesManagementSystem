package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidates_verification")
public class CandidateVerification {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="candidate_id")
	private int candidateId;
	
	@Column(name="mernis_verification")
	private Boolean mernisVerification;
	
	@Column(name="email_verification")
	private Boolean emailVerification;
	
	@Column(name="confirmation")
	private Boolean confirmation;

	public CandidateVerification() {
		
	}

	public CandidateVerification(int id, int candidateId, Boolean mernisVerification, Boolean emailVerification,
			Boolean confirmation) {
		super();
		this.id = id;
		this.candidateId = candidateId;
		this.mernisVerification = mernisVerification;
		this.emailVerification = emailVerification;
		this.confirmation = confirmation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public Boolean getMernisVerification() {
		return mernisVerification;
	}

	public void setMernisVerification(Boolean mernisVerification) {
		this.mernisVerification = mernisVerification;
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
