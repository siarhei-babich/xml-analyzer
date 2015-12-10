package com.epam.analyzers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.epam.result.CaseResult;
import com.epam.result.Status;

public class FileAnalyzer {

	public CaseResult getStatus(File file) {
		if(!file.exists()) {
			System.out.println("No files for analysis detected!");
		}
		
		Status status = null;
		
		try {
		    @SuppressWarnings("resource")
			Scanner scanner = new Scanner(file);

		    int lineNum = 0;
		    while (scanner.hasNextLine()) {
		        String line = scanner.nextLine();
		        lineNum++;
		        if(line.contains("PASSED") || line.contains("FAILED")) { 
		            System.out.println("Status detected in line " + lineNum);
		            if(line.contains("PASSED")) {
		            	System.out.println("Status = PASSED");
		            	status = Status.PASSED;
		            } else if(line.contains("FAILED")) {
		            	System.out.println("Status = FAILED");
		            	status = Status.FAILED;
		            }
		        } else {
		        	System.out.println(String.format("File '%s' doesn't contain a status!", file.getName()));
		        }
		    }
		} catch(FileNotFoundException e) { 
		}
		return new CaseResult(file.getName(), status);
	}
	
}
