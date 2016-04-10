/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

// database imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author lachtara
 */
public class DB {
	
	// member variables
	protected static String SQL = "SELECT * FROM Characters";
	protected static ResultSet result = null;
	protected static Connection con = null;
	protected static Statement stmt = null;
	
	public static void getAll () {
		try {
			while ( result.next( ) ) {
				int id_col = result.getInt("ID");
				String char_firstname = result.getString("Char_Firstname");
				String char_lastname = result.getString("Char_Lastname");
				String real_firstname = result.getString("Real_Firstname");
				String real_lastname = result.getString("Real_Lastname");
				
				System.out.println(char_firstname + " " + char_lastname + " " + real_firstname + " " + real_lastname);
				
			}	
		} catch (SQLException ex) {
			Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

