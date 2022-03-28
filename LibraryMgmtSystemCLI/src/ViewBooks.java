import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

public class ViewBooks extends JFrame {

	public static void viewBooks() {
		
		try{
			Connection con=DBInitialization.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from books",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			for(int i=1;i<=cols;i++) {
				
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
