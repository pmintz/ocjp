package relativepath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativePath {
	
	public static void main(String[] args){
	Path p1 = Paths.get("c:\\new\\temp\\test.txt");
	Path p2 = Paths.get("report.pdf");
	//System.out.println(p1.resolve(p2)));
	System.out.println(p1.resolve(p2));
	
	Path p3 = Paths.get("..\\..\\test.txt");
	Path p4 = Paths.get("report.pdf");
	//System.out.println(p1.resolve(p2)));
	System.out.println(p3.resolve(p4));
	
	
	}
}
