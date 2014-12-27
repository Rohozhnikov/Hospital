package com.epam.controller.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.epam.model.Diagnose;
import com.epam.model.Users;
import com.epam.service.DBConnection;

public class DiagnoseDao {
	private Connection connection;
	private PreparedStatement pStm;
	private String addQuary = "INSERT INTO hospital.diagnose (id, client_id, doctore_id, name, date) VALUES (?,?,?,?,?)";
	private String getAllQuery = "SELECT * FROM hospital.diagnose";
	private String updateQuery = "UPDATE hospital.diagnose SET id = ?, client_id = ?, doctore_id = ?, name = ?, date = ?";
	private String deleteQuery = "DELETE FROM hospital.diagnose WHERE id = ?";

	public DiagnoseDao() {
		connection = DBConnection.getCon();
	}

	public void deleteDiagnose(int id) {
		try {
			pStm = connection.prepareStatement(deleteQuery);
			pStm.setInt(1, id);
			pStm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateDiagnose(Diagnose diagnose) {
		try {
			pStm = connection.prepareStatement(updateQuery);
			pStm.setObject(1, diagnose.getClientID());
			pStm.setObject(2, diagnose.getDoctorID());
			pStm.setString(3, diagnose.getName());
			pStm.setDate(4, diagnose.getDate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Diagnose> getAllDiagnose() {
		List<Diagnose> diagnoses = new ArrayList<Diagnose>();
		try {
			pStm = connection.prepareStatement(getAllQuery);
			ResultSet rs = pStm.executeQuery();
			while (rs.next()) {
				Diagnose diagnose = new Diagnose();
				diagnose.setId(rs.getInt("id"));
				diagnose.setClientID((Users) rs.getObject("client_id"));
				diagnose.setDoctorID((Users) rs.getObject("doctore_id"));
				diagnose.setName(rs.getString("name"));
				diagnose.setDate(rs.getDate("date"));
				diagnoses.add(diagnose);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return diagnoses;

	}

	public void addDiagnose(Diagnose diagnose) {
		try {
			pStm = connection.prepareStatement(addQuary);
			pStm.setInt(1, diagnose.getId());
			pStm.setObject(2, diagnose.getClientID());
			pStm.setObject(3, diagnose.getDoctorID());
			pStm.setString(4, diagnose.getName());
			pStm.setDate(5, diagnose.getDate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
