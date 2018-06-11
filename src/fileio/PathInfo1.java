package fileio;
import java.nio.file.Path;
import java.nio.file.Paths;
// Class to illustrate how to use Path interface and its methods
import java.util.Comparator;
public class PathInfo1 implements /*Comparable*/Comparator {
	public static void main(String[] args) {
		// create a Path object by calling static method get() in Paths class
		Path testFilePath = Paths.get("C:\\testfile.txt");
		// retrieve basic information about path
		System.out.println("Printing file information: ");
		System.out.println("\t file name: " + testFilePath.getFileName());
		System.out.println("\t root of the path: " + testFilePath.getRoot());
		System.out.println("\t parent of the target: " + testFilePath.getParent());
		// print path elements
		System.out.println("Printing elements of the path: ");
		for(Path element : testFilePath) {
			System.out.println("\t path element: " + element);
		}
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	//@Override
/*	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}*/
}