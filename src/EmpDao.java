import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	
	public static int save(Emp e)
	{
		int status=0;
		
		try {
			Connection con= EmpDao.getConnection();
			PreparedStatement ps= con.prepareStatement("insert into user15 (name,password,email,country)values(?,?,?,?)");
			
			ps.setString(1, e.getName());
			
			status=ps.executeUpdate();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		return status;
		
	}

}
