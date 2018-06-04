package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
class FileAttributes {
	public static void main(String[] args) {
		Path path = Paths.get(args[0]);
		try {
			Object object = Files.getAttribute(path, "creationTime",
					LinkOption.NOFOLLOW_LINKS);
			System.out.println("Creation time: " + object);
			object = Files.getAttribute(path, "lastModifiedTime", LinkOption.NOFOLLOW_LINKS);
			System.out.println("Last modified time: " + object);
			object = Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS);
			System.out.println("Size: " + object);
			object = Files.getAttribute(path, "dos:hidden", LinkOption.NOFOLLOW_LINKS);
			System.out.println("isHidden: " + object);
			object = Files.getAttribute(path, "isDirectory", LinkOption.NOFOLLOW_LINKS);
			System.out.println("isDirectory: " + object);
			
			//Map<String,Object> readAttributes(Path path, *, LinkOption... options)
			Map<String,Object> readAttributes(path, *, LinkOption.NOFOLLOW_LINKS);
			/*<A extends BasicFileAttributes> A readAttributes(Path path, Class<A> type, LinkOption...
			options)*/
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
