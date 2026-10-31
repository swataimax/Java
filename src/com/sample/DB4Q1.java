package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB4Q1 {
	public static void main(String[] args) {
		String user = "USER217"; // 配布されたユーザを指定する
		String pwd = "cu53xw"; // 配布されたパスワードを指定する
		String url = "jdbc:oracle:thin:@school.aimax.com:1521/ FREEPDB1 ";
		String sql = "SELECT col1, col_d FROM tbl2";
		try (Connection con = DriverManager.getConnection(url, user, pwd);
				Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("col1") + "\t" +
						rs.getString("col_d"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
