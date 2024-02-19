import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmpDao {
	
	public static Connection getConnection() throws SQLException
	{
		Connection con =null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema", "root" , "abc123");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;
		
	}

}
