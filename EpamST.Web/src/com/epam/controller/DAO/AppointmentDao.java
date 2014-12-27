package com.epam.controller.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.epam.model.Appointment;
import com.epam.model.AppointmentType;
import com.epam.model.Diagnose;
import com.epam.model.Users;
import com.epam.service.DBConnection;

public class AppointmentDao {
	private Connection connection;
	private String addQuery = "INSERT INTO hospital.appointment (diagnose_id, type_id, medic_id) VALUE (?, ?, ?)";
	private String deleteQuery = "DELETE FROM hospital.appointment WHERE id = ?";
	private String updateQuery = "UPDATE hospital.appointment SET diagnose_id = ?, type_id = ?, medic_id = ?";
	private String getAllQuery = "SELECT * FROM hospital.appointment";
	private PreparedStatement pStm;

	public AppointmentDao() {
		connection = DBConnection.getCon();
	}

	public void addAppointment(Appointment appointment) {
		try {
			pStm = connection.prepareStatement(addQuery);
			pStm.setObject(1, appointment.getDiagnoseID());
			pStm.setObject(2, appointment.getTypeID());
			pStm.setObject(3, appointment.getMedicID());
			pStm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteAppointment(int id) {
		try {
			pStm = connection.prepareStatement(deleteQuery);
			pStm.setInt(1, id);
			pStm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateQuery(Appointment appointment) {
		try {
			pStm = connection.prepareStatement(updateQuery);
			pStm.setObject(1, appointment.getDiagnoseID());
			pStm.setObject(2, appointment.getTypeID());
			pStm.setObject(3, appointment.getMedicID());
			pStm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getAllAppointment() {
		List<Appointment> appointments = new ArrayList<Appointment>();

		try {
			pStm = connection.prepareStatement(getAllQuery);
			ResultSet rs = pStm.executeQuery();
			while (rs.next()) {
				Appointment appointment = new Appointment();
				appointment.setId(rs.getInt("id"));
				appointment.setDiagnoseID((Diagnose) rs
						.getObject("diagnose_id"));
				appointment
						.setTypeID((AppointmentType) rs.getObject("type_id"));
				appointment.setMedicID((Users) rs.getObject("medic_id"));
				appointments.add(appointment);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
