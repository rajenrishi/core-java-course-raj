import java.sql.*;

public class IssueBookDBOperations {
	
	public static boolean checkBookAvailability(String bookcallno) {
		
		boolean status=false;
		try{
			Connection con=DBInitialization.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from books where callno=?");
			ps.setString(1,bookcallno);
		    ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
		return status;
	}
	
	public static int save(String bookcallno, int iPerID, String name, String contact) {
		
		int status=0;
		try{
			Connection con=DBInitialization.getConnection();
			
			status = updateBook(bookcallno);
			
			if(status > 0) {
				PreparedStatement ps=con.prepareStatement("insert into issuedbooks(bookcallno,perid,pername,contact) values(?,?,?,?)");
				ps.setString(1, bookcallno);
				ps.setInt(2, iPerID);
				ps.setString(3, name);
				ps.setString(4, contact);
				status=ps.executeUpdate();
			}
			
			con.close();
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
		return status;
	}
	public static int updateBook(String bookcallno) {
		int status=0;
		int quantity=0,issued=0;
		try{
			Connection con=DBInitialization.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select quantity, issued from books where callno=?");
			ps.setString(1, bookcallno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("Inside update book");
				quantity = rs.getInt("quantity");
				issued = rs.getInt("issued");
			}
			if(quantity > 0) {
				
				PreparedStatement ps2=con.prepareStatement("update books set quantity=?,issued=? where callno=?");
				ps2.setInt(1, quantity-1);
				ps2.setInt(2, issued+1);
				ps2.setString(3, bookcallno);
				
				status=ps2.executeUpdate();
			}
			con.close();
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
		return status;
	}
}
