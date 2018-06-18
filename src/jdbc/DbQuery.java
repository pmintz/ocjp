package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
// Program to illustrate how to query a databaseSystem.out.println("ID \tfName \tlName \temail \tphoneNo");
class DbQuery {
	public static void main(String[] args) {
		// Get connection, execute query, get the result set
		// and print the entries from the result rest
		try (Connection connection = DbConnect.connectToDb();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")){
			//System.out.println("ID \t\tfName \t\tlName \t\temail \t\tphoneNo");
			System.out.println("ID \tfName \tlName \t\temail \t\tphoneNo");
			while (resultSet.next()) {
				/*System.out.println(resultSet.getInt("id") + "\t\t"
						+ resultSet.getString("firstName") + "\t\t"
						+ resultSet.getString("lastName") + "\t\t"
						+ resultSet.getString("email") + "\t\t"
						+ resultSet.getString("phoneNo"));*/
				
				System.out.println(resultSet.getInt("id") + "\t"
						+ resultSet.getString("firstName") + "\t"
						+ resultSet.getString("lastName") + " "
						+ resultSet.getString("email") + "\t"
						+ resultSet.getString("phoneNo"));
				
			/*	System.out.println(resultSet.getInt(1)
					+ "\t" + resultSet.getString(2)
					+ "\t" + resultSet.getString(3)
					+ "\t" + resultSet.getString(4)
					+ "\t" + resultSet.getString(5));*/
					
			}
		}catch (SQLException sqle) {
			sqle.printStackTrace();
			System.exit(-1);
		}
	}
}
