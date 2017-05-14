package my_jdbc;

import java.sql.*;
import java.util.Scanner;

public class RunTime {

	public static void main(String[] args) {
		
		MyConnection myConnection = new MyConnection();
		Connection conn = myConnection.getConnection();
		
		myConnection.searchRecord(conn);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username to delete or insert: ");
		String username1 = sc.nextLine();
		if(myConnection.check(conn, username1)){
			System.out.print("Enter new password: ");
			String password = sc.nextLine();
			myConnection.insertRecord(conn, username1, password);
			System.out.println("Đã thêm thành công!");
		}
		else{
			myConnection.deleteRecord(conn, username1);
			System.out.println("Đã xóa thành công!");
		}
		
		System.out.print("Enter username to display others: ");
		String username2 = sc.nextLine();
		myConnection.usernameOther(conn, username2);
	}

}
