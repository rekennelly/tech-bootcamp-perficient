package com.perficient.techbootcamprachel.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/records", "root", "n00dl3-Kug3l12?");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
