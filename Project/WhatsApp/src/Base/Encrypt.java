package Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Scanner;

public class Encrypt {

	public static void main (String[] args) {
		
		System.out.println("Enter the text you wanted to get encrypted");
		String inputValue = new Scanner(System.in).next();
		String encodedString= Base64.getEncoder().encodeToString(inputValue.getBytes());
		Path filePath= Paths.get("C:\\Projects\\Project\\Encryption\\EncrypteText.txt");
		
		try {
		Files.writeString(filePath, encodedString, StandardCharsets.UTF_8);	
	} catch (Exception e) {
		System.out.println("Exception occured while writing file "+e.getMessage()) ;
	}
 
		try {
		Scanner fileReader = new Scanner (new File("C:\\Projects\\Project\\Encryption\\EncrypteText.txt"));
		
		String readEncodeString = "";
		while (fileReader.hasNextLine()) {
			readEncodeString = readEncodeString + fileReader.next();
		}
		System.out.println("value from file " +readEncodeString);
		
		byte[] decodeValue = Base64.getDecoder().decode(readEncodeString);
		String outputValue = new String(decodeValue);
		
		System.out.println("the value decrypted from the file" + outputValue);
		
		
		
}  catch (FileNotFoundException e) {
	System.out.println("Exception occured while writing file " + e.getMessage());
} 
	}

}
