package Assignment_1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class question_31 {

	 /*Read afile content and write it 
	  * to a new file in reverse order.(reverse line 1-10 to line 10-1)
	  */
	
public static void main(String[] ards) {
	
	
	String inputFilePath = "/Users/kavithabharathiraja/eclipse-workspace/Assingnment_1/src/Assignment_1/read";
	String outptFilePath = "/Users/kavithabharathiraja/eclipse-workspace/Assingnment_1/src/Assignment_1/write(reversed)";
	
	try {
		
		File inputFile = new File(inputFilePath);
		
		if (inputFile.createNewFile()) {
			System.out.println("Read file created: "+inputFile.getAbsolutePath());	
		}else {
			System.out.println("Read file already exists. ");
		}
		
        File outputFile = new File(inputFilePath);
		
		if (inputFile.createNewFile()) {
			System.out.println("Write file created: "+outputFile.getAbsolutePath());	
		}else {
			System.out.println("write file already exists. ");
		}	
		
		
	}catch(IOException e){
		
		e.printStackTrace();
	}
		
	

	
	
	  
   }
	
}
	
	
	
	


