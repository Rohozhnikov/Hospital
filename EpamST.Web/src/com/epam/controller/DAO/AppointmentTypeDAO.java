package com.epam.controller.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.epam.model.AppointmentType;
import com.epam.service.DBConnection;

public class AppointmentTypeDAO {
	private Connection connection;
	private String addQuery = "INSERT INTO hospital.appointment_type (name) VALUE (?)";
//	private String deleteQuery = "DELETE FROM hospital.appointment_type WHERE ID = ?";
	private String updateQuery = "UPDATE hospital.appointment_type SET NAME = ?";
	private String getAllQuery = "SELECT * FROM hospital.appointment_type";
	private PreparedStatement pStm;

	public AppointmentTypeDAO() {
		connection = DBConnection.getCon();
	}
	public void addAppointmentType(AppointmentType appointmentType) {
		try {
			pStm = connection.prepareStatement(addQuery);
			pStm.setString(2, appointmentType.getName());
			pStm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateQuery(AppointmentType appointmentType) {
		try {
			pStm = connection.prepareStatement(updateQuery);
			pStm.setInt(1, appointmentType.getId());
			pStm.setString(2, appointmentType.getName());
			pStm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getAllAppointmentType() {
		List<AppointmentType> types = new ArrayList<AppointmentType>();
		try {
			pStm = connection.prepareStatement(getAllQuery);
			ResultSet rs = pStm.executeQuery();
			while (rs.next()) {
				AppointmentType type = new AppointmentType();
				type.getId();
				type.getName();
				types.add(type);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
