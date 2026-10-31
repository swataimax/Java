package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSample2 {
	public static void main(String[] args) {
		String user = "USER217"; // 配布されたユーザを指定する
		String pwd = "cu53xw"; // 配布されたパスワードを指定する
		String url = "jdbc:oracle:thin:@school.aimax.com:1521/ FREEPDB1 ";
//		String sql = "SELECT * FROM tbl1 WHERE col3 >= ?";
		String sql = "SELECT * FROM tbl1 WHERE col1 = ?";
//		String sql = "SELECT * FROM tbl1 WHERE ? = \'E01\'";	// これはできない。
		System.out.println(sql);

		try (Connection con = DriverManager.getConnection(url, user, pwd);
				PreparedStatement pstmt = con.prepareStatement(sql)) {
//			pstmt.setInt(1, 30);
			pstmt.setString(1, "E01");
//			pstmt.setString(1, "col1");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("col1") + "\t" +
						rs.getString("col2") + "\t" +
						rs.getInt("col3"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

// 2026/03/05 TDCソフト片山さんから聞かれて
// PreparedStatementでバインド変数（プレースホルダ）にできるのは、値（パラメータ）部分のみ
// テーブル名やカラム名はバインド変数にできない

// Copilot 検索「jdbc:oracle　バインド変数　カラム名」
// Oracle JDBC では バインド変数（? プレースホルダ） は 値 にしか使えず、カラム名やテーブル名などの識別子には使えません。
// これは JDBC 仕様と Oracle SQL の仕様による制約で、以下のようなコードはエラーになります。

// Oracleにおけるバインド変数の利用
// https://qiita.com/kamihork/items/948f451761a484ddfb27

// JavaのPreparedStatementを使った安全なSQLクエリ実行方法
// https://ittrip.xyz/java/java-preparedstatement-sql-query

// インタフェースPreparedStatement
// https://docs.oracle.com/javase/jp/25/docs/api/java.sql/java/sql/PreparedStatement.html

// インタフェースResultSet
// https://docs.oracle.com/javase/jp/25/docs/api/java.sql/java/sql/ResultSet.html

// パッケージjava.sql
// https://docs.oracle.com/javase/jp/25/docs/api/java.sql/java/sql/package-summary.html


