import java.sql.*;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class LibrarianDBOperations {

	public static int save(String name,
			String password,
			int age,
			int perId,
			String email,
			String address,
			String city,
			String contact) {
		int status=0;
		try{
			Connection con=DBInitialization.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into librarian_new(name,password,age,per_id,email,address,city,contact) values(?,?,?,?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setInt(3,age);
			ps.setInt(4,perId);
			ps.setString(5,email);
			ps.setString(6,address);
			ps.setString(7,city);
			ps.setString(8,contact);
			status=ps.executeUpdate();
			con.close();
			
		} catch(MySQLIntegrityConstraintViolationException e) {
			
			System.out.println("WARNING: Librarian with given Personal ID already exists!");
		
		} catch(Exception e) {
			
			System.out.println(e);
		}
		
		return status;
	}
	
	public static int update(
			int perId,
			String password,
			String email,
			String address,
			String city,
			String contact) {
		int status=0;
		try{
			Connection con=DBInitialization.getConnection();
			PreparedStatement ps=con.prepareStatement("update librarian_new set password=?, email=?, address=?, city=?, contact=? where per_id=?");
			ps.setString(1,password);
			ps.setString(2,email);
			ps.setString(3,address);
			ps.setString(4,city);
			ps.setString(5,contact);
			ps.setInt(6,perId);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static int delete(int perId) {
		
		int status=0;
		try {
			Connection con=DBInitialization.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from librarian_new where per_id=?");
			ps.setInt(1,perId);
			status=ps.executeUpdate();
			con.close();
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
		return status;
	}

	public static boolean validate(String name, String password) {
		boolean status=false;
		try{
			Connection con=DBInitialization.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from librarian_new where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status = rs.next();
			con.close();
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
		
		return status;
	}
}
