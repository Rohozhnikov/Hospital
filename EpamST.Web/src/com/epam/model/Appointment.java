package com.epam.model;

public class Appointment {
	private int id;
	private Diagnose diagnoseID;
	private AppointmentType typeID;
	private Users medicID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Diagnose getDiagnoseID() {
		return diagnoseID;
	}

	public void setDiagnoseID(Diagnose diagnoseID) {
		this.diagnoseID = diagnoseID;
	}

	public AppointmentType getTypeID() {
		return typeID;
	}

	public void setTypeID(AppointmentType typeID) {
		this.typeID = typeID;
	}

	public Users getMedicID() {
		return medicID;
	}

	public void setMedicID(Users medicID) {
		this.medicID = medicID;
	}
}
