package bank.management.system;

import java.sql.*;



public class Verbindung {
	
	Connection connection;
	Statement statement;
	
	public Verbindung() {
		try {
			
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","123456");	
		statement = connection.createStatement();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
