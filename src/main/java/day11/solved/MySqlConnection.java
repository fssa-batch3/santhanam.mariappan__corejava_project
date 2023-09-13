package day11.solved;

import java.sql.*;

public class MySqlConnection {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://aws.connect.psdb.cloud:3306/corejava";
		String userName = "gjsz763qmbpfpgxs7e5k";
		String passWord = "pscale_pw_Swwn33X2kjlkDacgj2tspTKLXJjUlGclh0vBEcNYEV0";

		Connection con = DriverManager.getConnection(url, userName, passWord);

		System.out.println("connection created...");
		con.close();
	}
}