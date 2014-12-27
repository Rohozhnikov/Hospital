package com.epam.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.epam.model.Users;

public class UsersDAO {
	private Connection connection;
	private PreparedStatement pStm;
	private String insertQuery = "INSERT INTO user(id, f_name, l_name, phone, email, address, role, log, password) VALUES (?,?,?,?,?,?,?)";
	private String getAllQuery = "SELECT * FROM user";
	private String deleteUser = "DLETE FROM hospital.users WHERE id=?";
	private String updateUser = "UPDATE hospital.users SET f_name = ?, l_name = ?, phone = ?, email = ?, address = ?, log = ?, password = ?";

	public UsersDAO() {
		connection = DBConnection.getCon();
	}

	public void addUser(Users user) {
		try {
			pStm = connection.prepareStatement(insertQuery);
			pStm.setInt(1, user.getId());
			pStm.setString(2, user.getfName());
			pStm.setString(3, user.getlName());
			pStm.setString(4, user.getPhone());
			pStm.setString(5, user.getEmail());
			pStm.setString(6, user.getAddress());
			pStm.setString(7, user.getRole());
			pStm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteUser(int ID) {
		try {
			pStm = connection.prepareStatement(deleteUser);
			pStm.setInt(1, ID);
			pStm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateUser(Users user) {
		try {
			pStm = connection.prepareStatement(updateUser);
			pStm.setString(1, user.getfName());
			pStm.setString(2, user.getlName());
			pStm.setString(3, user.getPhone());
			pStm.setString(4, user.getEmail());
			pStm.setString(5, user.getAddress());
			pStm.setString(6, user.getLogin());
			pStm.setString(7, user.getPass());
			pStm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Users> getAllUsers() {
		List<Users> users = new ArrayList<Users>();

		try {
			pStm = connection.prepareStatement(getAllQuery);
			ResultSet rs = pStm.executeQuery();
			while (rs.next()) {
				Users user = new Users();

				user.setId(rs.getInt("id"));
				user.setfName(rs.getString("f_name"));
				user.setlName(rs.getString("l_name"));
				user.setPhone(rs.getString("phone"));
				user.setEmail(rs.getString("email"));
				user.setAddress(rs.getString("address"));
				user.setRole(rs.getString("role"));
				user.setLogin(rs.getString("login"));
				users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

}
