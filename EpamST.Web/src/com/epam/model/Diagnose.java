package com.epam.model;

import java.sql.Date;

public class Diagnose {
	private int id;
	private Users clientID;
	private Users doctorID;
	private String name;
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getClientID() {
		return clientID;
	}

	public void setClientID(Users clientID) {
		this.clientID = clientID;
	}

	public Users getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(Users doctorID) {
		this.doctorID = doctorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
