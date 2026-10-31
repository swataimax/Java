package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBSample4 {
	public static void main(String[] args) {
		String user = "USER217"; // 配布されたユーザを指定する
		String pwd = "cu53xw"; // 配布されたパスワードを指定する
		String url = "jdbc:oracle:thin:@school.aimax.com:1521/ FREEPDB1 ";
		String sql = "UPDATE tbl1 SET col3 = ? WHERE col1 = ?";
		try (Connection con = DriverManager.getConnection(url, user, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, 999);
			pstmt.setString(2, "E99");
			int rows = pstmt.executeUpdate();
			System.out.println("更新件数:" + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
