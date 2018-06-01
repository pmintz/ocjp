package exceptions;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

public interface StringReader {
	
	String readIntFromFile(String s) throws IOException, SQLException;
	
	int readIntFromFile() throws EOFException;

}
