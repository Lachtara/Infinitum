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
	
	public static ResultSet getAll () {
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			SQL = "SELECT * FROM Characters";
			result = stmt.executeQuery(SQL);
		} catch (SQLException ex) {
			Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
		}
		return result;
	}
	
	
	public static ResultSet getActive() {
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			SQL = "SELECT * FROM Characters WHERE active=true";
			result = stmt.executeQuery(SQL);
		} catch (SQLException ex) {
			Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
		}
		return result;
	}
}

