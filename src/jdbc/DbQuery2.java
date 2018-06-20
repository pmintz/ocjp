package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
class DbQuery2 {
	public static void main(String[] args) throws SQLException {
		try (Connection connection = DbConnect.connectToDb();
				Statement statement = connection.createStatement();
				ResultSet resultset = statement.executeQuery
						("SELECT firstName, email FROM"
						+ " contact WHERE firstName=\"Michael\"")) {
			System.out.println("fName \temail");
			while (resultset.next()){
				System.out.println(resultset.getString("firstName") + "\t"
						+ resultset.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
