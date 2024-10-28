package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	//DEMO: INSERIR DADOS
	
	public static void main(String[] args) {

		Connection conn = null;
		
		Statement st = null;
		
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			 
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from seller");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name") + ", " + rs.getString("Email"));
			}
			
		}catch(SQLException e) {
			e.getStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}
	}

}