package Assignment_1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class question31 {
	//Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)

	
		
		public static void main(String[] args) {
			
String inputFile = "/Users/kavithabharathiraja/eclipse-workspace/Assingnment_1/src/Assignment_1/read";
String outputFile = "/Users/kavithabharathiraja/eclipse-workspace/Assingnment_1/src/Assignment_1/write(reversed)";
			
reverseFileContent(inputFile, outputFile);
		
System.out.println("File content reversed successfully!");		
			
		}			
public static void reverseFileContent(String inputFile, String outputFile) {
	
	try {
        // Read the content of the input file
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
	
        Collections.reverse(lines);
	
     // Write the reversed content to the output file
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        for (String reversedLine : lines) {
            writer.write(reversedLine);
            writer.newLine();
        }
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
	
	
}
				
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	


