package day39;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ArrayLIstPractice {

	public static void main(String[] args) {

		
		List<String> lineLst = getTextFileAsList("fileExtensions.txt");
	    System.out.println(lineLst);
	    System.out.println("Size of the ArrayList: "+lineLst.size());
	    
	    String s = "erat_quisque_erat.xls";
	    String fileExtension = s.substring(s.indexOf("."));
	    System.out.println(fileExtension);
	    
	    int count=0;
	    for(String str : lineLst) {
			if(str.endsWith(".xls"))
				count++;
		}
	    System.out.println("Count of Excel files: " + count);
	    
	    String longestExcel="";
	    for (String each : lineLst) {
			if(each.endsWith(".xls")) {
				if(each.length()>longestExcel.length()) {
					longestExcel=each;
				}
					
			}
		}
	    System.out.println("Longest excel file: "+longestExcel);
	  }
	
	  public static List<String> getTextFileAsList(String filePath) {

	    List<String> allLines = null;
	    try {
	      allLines = Files.readAllLines(Paths.get(filePath));
	    } catch (Exception e) {
	      System.out.println("Wrong file path probably");
	    }
	    return allLines;

		
	}

	
	
}
