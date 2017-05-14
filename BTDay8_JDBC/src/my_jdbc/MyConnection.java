package my_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyConnection {
	
	public Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/17jsp2";
			String usr = "root";
			String pas = "1301";
			conn = DriverManager.getConnection(url, usr, pas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void searchRecord(Connection conn){
		try {
			String sql = "select * from user where username = 'abc'";
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			System.out.print("Thông tin cần tìm: ");
			while(rs.next()){
				String column1 = rs.getString("username");
				String column2 = rs.getString("password");
				System.out.println(column1+" - "+column2);
			}
			stm.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteRecord(Connection conn, String username){
		String sql = "delete from user where username = '"+username+"'";
		try{
			Statement stm = conn.createStatement();
			stm.execute(sql);
			stm.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertRecord(Connection conn, String username, String password){
		String sql = "insert into user(username, password) values ('"+username+"','"+password+"')";
		try{
			Statement stm = conn.createStatement();
			stm.execute(sql);
			stm.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void usernameOther(Connection conn, String username){
		String sql = "select * from user";
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()){
				String usernameCheck = rs.getString("username");
				String passwordCheck = rs.getString("password");
				if(usernameCheck.equals(username) == false){
					System.out.print("Username: "+usernameCheck+"\n");
					System.out.print("Password: "+passwordCheck+"\n--------------\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean check(Connection conn, String username) {
		boolean kt = true;
		String sql = "select username from user";
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()){
				String usernameCheck = rs.getString("username");
				if(usernameCheck.equals(username)){
					kt = false;
				}
			}
			//stm.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kt;
	}
}
