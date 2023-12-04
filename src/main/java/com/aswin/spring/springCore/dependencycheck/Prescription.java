package com.aswin.spring.springCore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	private int id;
	private String patienName;
	private List<String> medicines;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getPatienName() {
		return patienName;
	}

	@Required
	public void setPatienName(String patienName) {
		this.patienName = patienName;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	@Required
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patienName=" + patienName + ", medicines=" + medicines + "]";
	}

}
