import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ViewIssuedBooks {

	public static void viewIssuedBooks() {
		
		try{
			Connection con=DBInitialization.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from issuedbooks", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			for(int i=1;i<=cols;i++){
				
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();

			while(rs.next()){
				
				for(int i=1;i<=cols;i++){
					
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			con.close();
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
	}
}
