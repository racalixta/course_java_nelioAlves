package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegratyException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null; 
		PreparedStatement st = null;
		
		try {
			
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?");
			
			// com os Id de 1 a 4 da erro, apenas os add posteriormente funciona
			st.setInt(1, 2);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows: " + rowsAffected);
			
		} catch(SQLException e) {
			throw new DbIntegratyException(e.getMessage());
			
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
			
		}
		
	}

}
