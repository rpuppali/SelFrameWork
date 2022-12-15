import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.testng.annotations.Test;

public class Write2txtfile {
	
	@Test
	public void writeTotextfile () throws IOException
	{
//		File file = new File("C:\\\\Users\\\\reach\\\\eclipse-workspace\\\\JavaSelMaven1\\\\src\\main\\\\java\\\\textfile.txt");
//		FileWriter fw = new FileWriter(file);
//		fw.write("Hello");
		
		 // Assigning the content of the file
        String text
            = "Welcome to geekforgeeks\nHappy Learning!";
 
        // Defining the file name of the file
        Path fileName = Path.of(
            "C:\\Users\\reach\\eclipse-workspace\\JavaSelMaven1\\src\\main\\java\\textfile.txt");
 
        // Writing into the file
        Files.writeString(fileName, text);
 
        // Reading the content of the file
        String file_content = Files.readString(fileName);
 
        // Printing the content inside the file
        System.out.println(file_content);
		
	}

}
