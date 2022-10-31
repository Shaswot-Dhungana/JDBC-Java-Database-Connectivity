package myDBPackage;

import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

public class start {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanData = new Scanner(System.in);
		
		
		System.out.println("          ....Select Your Operation....");
		
		System.out.println("         ");
		System.out.println("         ");
		System.out.println("         ");
		

		
		while(true) {
		
			int a;
		System.out.println("    1. Exit");
		
		
		System.out.println("    2. Create Table.     ");
		System.out.println("      ");
		System.out.println("   Your Choice   :~  ");
		a = scanData.nextInt();
		 

		 if(a==1) {
		 
			 System.out.println("     Your Choice is "+a);
break;
			 
		 }else if(a==2) {
			 System.out.println("     Your Choice is "+a);
				createTable();
			 
		 }else {
			 System.out.println("     Please choose 1 or 2 ONly...");
				
		 }
		
		}
		
		
	}
	
	public static void createTable()  {

		try {
		// loading JDBC DRiver 
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		// Creating Connection
		
		String url = "jdbc:mysql://localhost:3306/student_manage";
		String userN = "root";
		String passW = "root";
		final Connection con = DriverManager.getConnection(url,userN,passW);
		
		if(con.isClosed()) {
			System.out.println("Connection Closed......");
		}else {
			System.out.println("Connection Established...");
		}
		// creating query
		
					String q = "create table table6(tId int(20) primary key auto_increment , tName varchar(200) not null , tCity varchar(400))";
					
					// creating statement
					
					Statement mySt = con.createStatement();
					mySt.executeUpdate(q);
					
					System.out.println("Table Created .....");
					
					con.close();

		

		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
}
