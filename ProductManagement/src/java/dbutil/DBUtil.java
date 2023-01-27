package dbutil;

import java.sql.*;

public class DBUtil {

	public static Connection getConnection()
	{
		Connection conn = null;
		try 
		{
			
			Class.forName("org.apache.derby.jdbc.ClientDriver");
		    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/inventoryMGMT","adnan","adnan123");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void closeConnection(Connection conn)
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
