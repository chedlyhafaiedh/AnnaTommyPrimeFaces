package tn.edu.esprit.gl8.annaTommyEJB.domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Admin
 * 
 */
@Entity
public class Admin extends User implements Serializable {

	private String speciality;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

	public Admin(String speciality) {
		super();
		this.speciality = speciality;
	}

	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
