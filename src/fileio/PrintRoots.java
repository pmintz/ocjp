package fileio;

import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class PrintRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File[] roots = File.listRoots();
		for(File f: roots){
			System.out.println(f);
		}
		
		Iterable<Path> root = FileSystems.getDefault().getRootDirectories();
		
		root.forEach(k->{System.out.println(k.toString());});
		
		root.forEach(System.out::println);
		
		/*URI uri = URI.create("c:\\");
		
		FileSystem fs = FileSystems.getFileSystem(uri);
		
		System.out.println(fs.toString());*/

	}

}
