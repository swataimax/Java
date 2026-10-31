package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB4Q4 {
	public static void main(String[] args) {
		String user = "USER217"; // 配布されたユーザを指定する
		String pwd = "cu53xw"; // 配布されたパスワードを指定する
		String url = "jdbc:oracle:thin:@school.aimax.com:1521/ FREEPDB1 ";
		String sql = "DELETE FROM tbl2 WHERE col1 = ?";
		try (Connection con = DriverManager.getConnection(url, user, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, "E01");
			int rows = pstmt.executeUpdate();
			System.out.println("更新件数:" + rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
