package exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionTest implements IntReader, StringReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest t = new ExceptionTest();
		String integerStr = "";
		System.out.println("The string to scan integer from it is: " + integerStr);
		Scanner consoleScanner = new Scanner(integerStr);
	
			try {
				System.out.println(t.readIntFromFile());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		try {
			System.out.println("The integer value scanned from string is: "
			+ consoleScanner.nextInt());
			//InputMismatchException extends NoSuchElementException
			} catch(InputMismatchException ime) {
			System.out.println("Error: InputMismatch");
			} catch(NoSuchElementException nsee) {
				throw nsee;
				//throw (RuntimeException)nsee;
			//System.out.println("Error: Cannot scan an integer from the given string");
			}catch(IllegalStateException ex){
				throw (RuntimeException)ex;
			//System.out.println("Object already closed");
			}

	}

	@Override
	public String readIntFromFile(String s) throws IOException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int readIntFromFile() throws EOFException{// because ExceptionTest implements IntReader and StringReader
		//interfaces, compilers assumes this method is from StringReader as its readIntFromFile method throws,
		//EOFException.  
		// TODO Auto-generated method stub
		return 0;
	}

/*	@Override
	public int readIntFromFile() throws IOException, EOFException, SocketException, IndexOutOfBoundsException, ArrayIndexOutOfBoundsException, 
	RuntimeException, StackOverflowError, Error, LinkageError, FileNotFoundException{//, Exception //can't go more general than IOException{
		// TODO Auto-generated method stub
		return 0;
	}*/

}
