	//based on the example https://github.com/abegaz/carDealerStarterApp
    //which is based on https://github.com/HackeaMesta/Game-Store

	package application;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class InsulinPumpConfig {

		private static final String USERNAME = "root";
		private static final String PASSWORD = "";
		private static final String CONN_STRING = "jdbc:mysql://localhost/cardealer";  // replace this with the correct mysql database

		// connection  method that connects to the MySQL database
		public static Connection getConnection() throws SQLException{

			return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
		}

		// displays error in more detail if connection to database fails
		public static void displayException(SQLException ex){

			System.err.println("Error Message: " + ex.getMessage());
			System.err.println("Error Code: " + ex.getErrorCode());
			System.err.println("SQL Status: " + ex.getSQLState());

		}
	}

