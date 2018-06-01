package exceptions;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

public interface IntReader {
	
	int readIntFromFile() throws SQLException, EOFException;
	
	//Object readIntFromFile(); cannot overload by simply changing the return type

}
